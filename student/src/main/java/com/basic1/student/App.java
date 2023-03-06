package com.basic1.student;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Transaction;


public class App 
{
    public static void main( String[] args )
    {
        sdetails d=new sdetails();
        /* d.setSid(2103100114);
        d.setSname("harshith");
        d.setContact(98755654);
        d.setBranch("MCA");*/
        
       /* sdetails d1=new sdetails();
        d1.setSid(210310010);
        d1.setSname("chandhana");
        d1.setContact(98768932);
        d1.setBranch("MCA");*/
        
        //to overcome the deprecated method we can write the code as follows...
        
       Configuration con=new Configuration().configure().addAnnotatedClass(sdetails.class);
       ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf=con.buildSessionFactory(reg);
       Session s=sf.openSession();
       Transaction tx=s.beginTransaction();
       
    //to fetch the data
        d=(sdetails)s.get(sdetails.class, 210310013);
      // s.save(d);
      // s.save(d1);
       tx.commit();
       System.out.println(d);
       }
}
