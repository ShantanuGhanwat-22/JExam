package com.demo.Beans;

public class TrainingRoom extends Room{
	private String telphoneNumber;

	public TrainingRoom() {
		super();
	}

	public TrainingRoom(int id,int capacity, double price,String telphoneNumber) {
		super(id,"Training",capacity,price,true);
		this.telphoneNumber = telphoneNumber;
	}

	public String getTelphoneNumber() {
		return telphoneNumber;
	}

	public void setTelphoneNumber(String telphoneNumber) {
		this.telphoneNumber = telphoneNumber;
	}

	@Override
	public String toString() {
		return super.toString()+"TrainingRoom [telphoneNumber=" + telphoneNumber + "]\n";
	}
	
	
	
}
