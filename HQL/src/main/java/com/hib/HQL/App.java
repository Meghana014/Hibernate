package com.hib.HQL;

import java.awt.Desktop.Action;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Random r=new Random();
        for(int i=1;i<=50;i++)
        {
        	Student s=new Student();
        	s.setRollno(i);
        	s.setName("student "+i);
        	s.setMarks(r.nextInt(100));
        	session.save(s);
        }
        tx.commit();
        
        
    }
}
