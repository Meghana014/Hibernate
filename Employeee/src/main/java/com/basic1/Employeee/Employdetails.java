package com.basic1.Employeee;

import javax.persistence.Entity;


import javax.persistence.Id;

@Entity
public class Employdetails {
	@Id
     private int eid;
     private Name ename;
     private String position;
     private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public Name getEname() {
		return ename;
	}
	public void setEname(Name ename) {
		this.ename = ename;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
     
     
}
