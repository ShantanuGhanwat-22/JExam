package com.demo.Beans;

import java.time.LocalDate;

public class FourWheeler extends Vehicle{
	private String  etype;
	private String gType;
	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FourWheeler(int vID, String oName, LocalDate mDate, String vType, String sName, String make, String model,
			double price, String status,String  etype,String gType) {
		super(vID, oName, mDate, vType, sName, make, model, price, status);
		// TODO Auto-generated constructor stub
		this.etype=etype;
		this.gType=gType;	
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public String getgType() {
		return gType;
	}
	public void setgType(String gType) {
		this.gType = gType;
	}
	@Override
	public String toString() {
		return super.toString()+"FourWheeler [etype=" + etype + ", gType=" + gType + "]";
	}
	
	
}
