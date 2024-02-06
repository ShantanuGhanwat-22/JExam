package com.demo.Service;

import com.demo.Beans.Room;

public interface RoomService {

	void addNewRoom(int ch);

	void cancelRoom(int id);

	Room bookRoom(String rtype, int cap);

	void getall();

}
