package com.dependentobject.entity;

public class Car {

	
	private String carNo;
	private String carModel;
	private String carBrand;
	private String carType;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String carNo, String carModel, String carBrand, String carType) {
		super();
		this.carNo = carNo;
		this.carModel = carModel;
		this.carBrand = carBrand;
		this.carType = carType;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carModel=" + carModel + ", carBrand=" + carBrand + ", carType=" + carType
				+ "]";
	}
	
}
