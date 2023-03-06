package com.basic.Demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Alien a=new Alien();
        a.setAid(100);
        a.setName("meghana");
        a.setColor("green");
         
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);        
        SessionFactory sf=con.buildSessionFactory(); //this method is deprecated-buildSessionFactory()
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        session.save(a);
        
        tx.commit();
        
    }
}
