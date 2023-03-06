package com.basic1.Employeee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Name n=new Name();
    	n.setFname("mullangi");
    	n.setMname("meghana");
    	n.setLname("reddy");
    	
    	Employdetails e=new Employdetails();
    	e.setEid(100);
    	e.setPosition("manager");
     	e.setSalary(80080);
        e.setEname(n);
        
    	Configuration con=new Configuration().configure().addAnnotatedClass(Employdetails.class);
    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.save(e);
        tx.commit();
    }
}
