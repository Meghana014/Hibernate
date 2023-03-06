package com.hib.Mappingtables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

//one to one relation mapping

public class App 
{
    public static void main( String[] args )
    {
    	Student s=new Student();
        Laptop laptop=new Laptop();
        
        
        s.setRollno(3);
        s.setName("chacho");
        s.setMarks(97);
        
        laptop.setLid(103);
        laptop.setLname("Mac");
       
        
       // laptop.getStud().add(s); // for onestudent many laptops
       // s.getL().add(laptop); //for onelaptop to manystudents
       //s.setL(laptop);  //for one to one
        
        
        
        
          
        
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf=con.buildSessionFactory(reg);
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(laptop);
        session.save(s);
        tx.commit();
        
    }
    
}
