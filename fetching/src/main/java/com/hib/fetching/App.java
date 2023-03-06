package com.hib.fetching;

import java.util.Collection;
import java.util.List;

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
    	/*Emp e=new Emp();
    	e.setEid(202);
    	e.setEname("mahesh");
    	e.setSalary(7000);
    	
    	dependent d=new dependent();
    	d.setDid(102);
    	d.setDname("sindhu");
    	d.setRelation("cousin");*/
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Emp.class).addAnnotatedClass(dependent.class);
        //ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        Emp e1=(Emp) session.get(Emp.class,201);
        System.out.println(e1.getSalary());
        Collection<dependent> deps=e1.getLd();
        for(dependent d1 : deps)
        {
        	System.out.println(d1);
        }
        // session.save(e);
       // session.save(d);
        
    }
}
