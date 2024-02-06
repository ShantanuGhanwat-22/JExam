package com.demo.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.demo.Beans.FourWheeler;
import com.demo.Beans.TwoWheeler;
import com.demo.Beans.Vehicle;
import com.demo.Dao.VDao;
import com.demo.Dao.VDaoImpl;

public class VServImpl implements VServ {
	private VDao vdao;
	public VServImpl() {
		vdao = new VDaoImpl();
	}
	@Override
	public void addVehicle(int c) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle Id");
		int vID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Owner Name");
		String oName = sc.next();
		System.out.println("Enter Date");
		String mdt=sc.next();
		LocalDate mDate = LocalDate.parse(mdt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter Vehicle Type 1.Electric \n 2.NonElectric");
		String vType = sc.next();
		System.out.println("Enter Name of Salesman");
		String name = sc.next();
		System.out.println("Enter Mft of Vehicle");
		String mft = sc.next();
		System.out.println("Enter model of Vehicle");
		String model=sc.next();
		System.out.println("Enter Price ");
		double Price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter vehicle Status 1. Available\n2.NotAvailable");
		String status = sc.next();
		
		Vehicle v = null;
		switch(c) {
		case 1:
			System.out.println("Enter dicky Capacity");
			int dc = sc.nextInt();
			v = new TwoWheeler(vID,oName,mDate,vType,name,mft,model,Price,status,dc);
			break;
		case 2 : 
			System.out.println("Enter 4Wheeler Engine type 1.Hybrid \n 2.Gear");
			String etype = sc.next();
			System.out.println("Enter 4Wheeler Engine type 1.Auto \n 2.Manual");
			String gtype = sc.next();
			v = new FourWheeler(vID,oName,mDate,vType,name,mft,model,Price,status,etype,gtype);
		}
		vdao.addVehicle(v);
	}
	@Override
	public Vehicle searchModel(String make) {
		// TODO Auto-generated method stub
		return vdao.searchbyVehicle(make);
	}
	@Override
	public Set<Vehicle> bookVehicle(double p, int c) {
		// TODO Auto-generated method stub
		return vdao.bookAVehicle(p,c);
	}
	@Override
	public Set<Vehicle> display() {
		// TODO Auto-generated method stub
		return vdao.Display();
	}
}
