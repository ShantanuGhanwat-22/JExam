package com.demo.Dao;

import com.demo.Beans.Room;

public interface RoomDao {

	void save(Room r);

	void changeRoomStatus(int id);

	Room bookRoom(String rtype, int cap);

	void displayall();

}
