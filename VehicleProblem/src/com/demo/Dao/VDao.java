package com.demo.Dao;

import java.util.Set;

import com.demo.Beans.Vehicle;

public interface VDao {

	void addVehicle(Vehicle v);

	Vehicle searchbyVehicle(String make);

	Set<Vehicle> bookAVehicle(double p, int c);

	Set<Vehicle> Display();

	

}
