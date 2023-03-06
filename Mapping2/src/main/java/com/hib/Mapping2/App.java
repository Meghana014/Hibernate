package com.hib.Mapping2;

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
        Student s=new Student();
        Laptop l=new Laptop();
        
        l.setLid(122);
        l.setName("mac");
        
        s.setRollno(2);
        s.setSname("thanvi");
        s.setMarks(97);
        
        
        s.getLaptop().add(l);
        l.getStudent().add(s);
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf=con.buildSessionFactory(reg);
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(s);
        session.save(l);
        tx.commit();
        
    }
    
}
