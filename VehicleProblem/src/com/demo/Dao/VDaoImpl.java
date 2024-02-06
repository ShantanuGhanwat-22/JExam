package com.demo.Dao;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import com.demo.Beans.TwoWheeler;
import com.demo.Beans.Vehicle;

public class VDaoImpl implements VDao {
	static Set<Vehicle> ts;
	static {
		ts = new TreeSet<>();
		ts.add(new TwoWheeler(1,"Honda",LocalDate.of(2024,01,22),"Electric","XYZ","Hyabuza","abc",1000,"Available",10));
	}
	@Override
	public void addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		ts.add(v);
	}
	@Override
	public Vehicle searchbyVehicle(String make) {
		// TODO Auto-generated method stub
		for (Vehicle v: ts ) {
			if(v.getMake().equals(make)) {
				return v;
			}
		}
		return null;
	}
	@Override
	public Set<Vehicle> bookAVehicle(double p, int c) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<Vehicle> Display() {
		// TODO Auto-generated method stub
		return ts;
	}
	
}
