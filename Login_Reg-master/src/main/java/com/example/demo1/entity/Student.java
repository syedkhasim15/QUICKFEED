package com.example.demo1.entity;

public class Student {
	
	private int roll;
	private int pass;
	private String name;
	private String city;
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getPass() {
		return pass;
	}
	
	public void setPass(int pass)
	{
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(int roll, String name, String city, int pass) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.pass = pass;
	}

}
