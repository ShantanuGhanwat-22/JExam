package com.demo.Beans;

import java.time.LocalDate;

public class TwoWheeler extends Vehicle{
	private int dcCapacity;

	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(int vID, String oName, LocalDate mDate, String vType, String sName, String make, String model,
			double price, String status,int dcCapacity) {
		super(vID, oName, mDate, vType, sName, make, model, price, status);
		// TODO Auto-generated constructor stub
		this.dcCapacity=dcCapacity;
	}

	public int getDcCapacity() {
		return dcCapacity;
	}

	public void setDcCapacity(int dcCapacity) {
		this.dcCapacity = dcCapacity;
	}

	@Override
	public String toString() {
		return super.toString()+"TwoWheeler [dcCapacity=" + dcCapacity + "]";
	}
	
	
}
