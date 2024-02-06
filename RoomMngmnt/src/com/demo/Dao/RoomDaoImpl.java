package com.demo.Dao;

import java.util.HashSet;
import java.util.Set;

import com.demo.Beans.Room;

public class RoomDaoImpl implements RoomDao {

	static Set<Room> rset;
	
	static {
		rset = new HashSet<>();	
//		rset.add(new MeetingRoom(4,4500,"samsung","a44"));
	}

	@Override
	public void save(Room r) {
		rset.add(r);	
	}

	@Override
	public void changeRoomStatus(int id) {
		for(Room rm : rset) {
			if(rm.getRoomid() == id) {
				rm.setStatus(true); 
			}
		}
		
	}

	@Override
	public Room bookRoom(String rtype, int cap) {
		for(Room rm: rset) {
			if(rm.getRoomname().equals(rtype) && rm.getCapacity() == cap) {
				rm.setStatus(false);
				return rm;
			}
		}
		return null;
	}

	@Override
	public void displayall() {
		System.out.println(rset);
		
	}

}
