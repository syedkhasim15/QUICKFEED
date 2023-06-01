package binod.suman.Spring_Boot_Project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_boot")
public class Student {

	 @Id
	 @Column
	 private int roll;
	 @Column
	 private String name;
	 @Column
	 private String city;
	 
	 @Column
	 private int pass;
	 
	 public Student() {}

	public Student(int roll, String name, String city,int pass) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.pass = pass;
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
	public void setPass(int pass) {
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

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}
	
	
	 
	 
	 
}

