package com.basic1.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
//@Table(name="sdetails_table")   //changes table name
public class sdetails {
	
	@Id
	private int sid;
	private String sname;
	//@Transient
	private String branch;
	private long contact;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	 }
	
	public String toString()
	{
		return "student details:[sid="+sid+",name="+sname+",branch="+branch+",contact="+contact+"]";
	}
	
	

}
