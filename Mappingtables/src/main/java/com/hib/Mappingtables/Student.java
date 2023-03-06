package com.hib.Mappingtables;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	   @Id
        private int rollno;
        private String name;
        private int marks;
        
        /*@OneToOne
        private Laptop l;
        public Laptop getL() {
			return l;
		}
		public void setL(Laptop l) {
			this.l = l;
		}*/
        
      /* @OneToMany
        private List<Laptop> l=new ArrayList<Laptop>();
		public List<Laptop> getL() {
			return l;
		}
		public void setL(List<Laptop> l) {
			this.l = l;
		}*/
        
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		
		
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
		}
		
        
        
}
