package com.demo.Service;

import java.util.Scanner;

import com.demo.Beans.MeetingRoom;
import com.demo.Beans.Room;
import com.demo.Beans.TrainingRoom;
import com.demo.Dao.RoomDao;
import com.demo.Dao.RoomDaoImpl;

public abstract class RoomServiceImpl implements RoomService {

	private RoomDao rdao;
	
	public RoomServiceImpl() {
		rdao = new RoomDaoImpl();
	}
	
	@Override
	public void addNewRoom(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr room id:");
		int id = sc.nextInt();
		System.out.println("Enter room capacity:");
		int cap = sc.nextInt();
		System.out.println("Enter room price:");
		double price = sc.nextDouble();
		Room r = null;
		switch(ch) {
		case 1:
			System.out.println("Enter TV make:");
			String tvmake = sc.next();
			System.out.println("Enter TV model:");
			String tvmodel = sc.next();
			r = new MeetingRoom(id,cap,price,tvmake,tvmodel);
			break;
		case 2:
			System.out.println("Enter Telephone number:");
			String tnum = sc.next();
			r = new TrainingRoom(id,cap,price,tnum);
			break;
		}
		
		rdao.save(r);
		
	}

	@Override
	public void cancelRoom(int id) {
		rdao.changeRoomStatus(id);
		
	}

	@Override
	public Room bookRoom(String rtype, int cap) {
		return rdao.bookRoom(rtype,cap);
		
	}

	@Override
	public void getall() {
		rdao.displayall();
		
	}

}
