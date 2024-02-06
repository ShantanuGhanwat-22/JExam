package com.demo.Beans;

import java.time.LocalDate;

public class Vehicle implements Comparable<Vehicle> {
	private int vID;
	private String oName;
	private LocalDate mDate;
	private String vType;
	private String sName;
	private String make;
	private String model;
	private double price;
	private String status;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vID, String oName, LocalDate mDate, String vType, String sName, String make, String model,
			double price, String status) {
		super();
		this.vID = vID;
		this.oName = oName;
		this.mDate = mDate;
		this.vType = vType;
		this.sName = sName;
		this.make = make;
		this.model = model;
		this.price = price;
		this.status = status;
	}
	public int getvID() {
		return vID;
	}
	public void setvID(int vID) {
		this.vID = vID;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public LocalDate getmDate() {
		return mDate;
	}
	public void setmDate(LocalDate mDate) {
		this.mDate = mDate;
	}
	public String getvType() {
		return vType;
	}
	public void setvType(String vType) {
		this.vType = vType;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Vehicle [vID=" + vID + ", oName=" + oName + ", mDate=" + mDate + ", vType=" + vType + ", sName=" + sName
				+ ", make=" + make + ", model=" + model + ", price=" + price + ", status=" + status + "]";
	}
	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		return this.oName.compareTo(((Vehicle)o).getoName());
	}
	
	
	
}
