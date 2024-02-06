package com.demo.Test;

import java.util.Scanner;
import java.util.Set;

import com.demo.Beans.Vehicle;
import com.demo.Service.VServ;
import com.demo.Service.VServImpl;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		VServ vs = new VServImpl();
		int ch = 0 ;
		do {
			System.out.println("1. Add Vehicle \n"
					+ "2. Serach Vehicle byModel \n"
					+ "3. Book A Vehicle \n"
					+ "4. Display All Vehicle \n"
					+ "Your Choice");
			ch = sc.nextInt();
			switch(ch) {
			case 1 :
				System.out.println("Select Vehicle 1. TwoWheeler \n 2.FourWheeler");
				int c = sc.nextInt();
				vs.addVehicle(c);
				break;
			case 2 :
				System.out.println("Enter Mnaufacturer of Vehicle");
				String make = sc.next();
				Vehicle v = vs.searchModel(make);
				if(v!=null) {
					System.out.println(v);
				}
				else {
					System.out.println("Model Not found");
				}
				break;
			case 3 :
				System.out.println("Enter Price of Vehicle");
				double P = sc.nextDouble();
				System.out.println("Select Vehicle Type 1. 2 Wheeler \n 2. 4Wheeler");
				c = sc.nextInt();
				Set<Vehicle> vset = vs.bookVehicle(P,c);
				if(vset!=null) {
					vset.stream().forEach(System.out::println);
				}
				else {
					System.out.println("Vehicle Not Booked");
				}
				break;
			case 4 :
				Set<Vehicle> vSet=vs.display();
				if(vSet!=null) {
					vSet.stream().forEach(System.out::println);
				}
				break;
			default : 
				System.out.println("Dhanywaad");
				break;
			}
		}while(ch!=5);
	}

}
