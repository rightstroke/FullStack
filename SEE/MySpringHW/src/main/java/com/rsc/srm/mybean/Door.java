package com.rsc.srm.mybean;

public class Door extends BaseModel {
	private int numofDoors;
	
	private boolean isTintedGlass;

	public int getNumofDoors() {
		return numofDoors;
	}

	public void setNumofDoors(int numofDoors) {
		this.numofDoors = numofDoors;
	}

	public boolean isTintedGlass() {
		return isTintedGlass;
	}

	public void setTintedGlass(boolean isTintedGlass) {
		this.isTintedGlass = isTintedGlass;
	}

	@Override
	public String toString() {
		return "Door [numofDoors=" + numofDoors + ", isTintedGlass=" + isTintedGlass + "]";
	}
	
	
}
