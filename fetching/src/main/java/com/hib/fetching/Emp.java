package com.hib.fetching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Emp {
	@Id
    private int eid;
    private String ename;
    private double salary;
    @OneToMany(mappedBy="emp")
    private Collection<dependent> ld=new ArrayList<dependent>();
    
    
	public Collection<dependent> getLd() {
		return ld;
	}
	public void setLd(Collection<dependent> ld) {
		this.ld = ld;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
    
}
