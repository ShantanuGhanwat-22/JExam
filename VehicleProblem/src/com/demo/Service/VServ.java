package com.demo.Service;

import java.util.Set;

import com.demo.Beans.Vehicle;

public interface VServ {

	void addVehicle(int c);

	Vehicle searchModel(String make);

	Set<Vehicle> bookVehicle(double p, int c);

	Set<Vehicle> display();

}
