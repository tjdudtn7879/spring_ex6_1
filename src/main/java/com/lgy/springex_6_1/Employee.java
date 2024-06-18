package com.lgy.springex_6_1;

import java.util.ArrayList;

public class Employee {
	String name;
	int pay;
	ArrayList<String> license;
	
	public Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public ArrayList<String> getLicense() {
		return license;
	}
	public void setLicense(ArrayList<String> license) {
		this.license = license;
	}
}
