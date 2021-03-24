package com.rsc.srm.mybean;

public class Car extends BaseModel {

	public Car() {
		super();
		System.out.println("############ I am in my Constructor ###############");
	}

	private Door dr;

	private String vin;

	private String color;
	
	public int sum(int x,int y) {
		return x+y;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Door getDr() {
		return dr;
	}

	public void setDr(Door dr) {
		this.dr = dr;
	}

	@Override
	public String toString() {
		return "Car [dr=" + dr + ", vin=" + vin + ", color=" + color + "]";
	}
	
	public void init() {
		System.out.println("## Init ##");
		//this.vin = "000000000000000000";
		//this.color = "white";
	}
	
	public void kill() {
		System.out.println("## Destroy ##");
		this.vin = "";
		this.color = "";
	}

}
