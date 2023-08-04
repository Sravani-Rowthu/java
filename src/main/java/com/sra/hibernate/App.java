package com.sra.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sra.hibernate.dao.EmployeeDAO;
import com.sra.hibernate.entity.Address;
import com.sra.hibernate.entity.Employee;
import com.sra.hibernate.entity.Person;
import com.sra.hibernate.util.HibernateUtil;
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=HibernateUtil.buildSessionFactory();
        Session session=factory.openSession();
        Person p=session.get(Person.class,787);
        if(p!=null)
        {
        	System.out.println(p.getSsn()+" "+p.getPersonName()+" "+p.getAge()+" "+p.getGender());
        	System.out.println(p.getAddress().getHouseNo()+" "+p.getAddress().getStreetName());
        	System.out.println(p.getAddress().getCity()+" "+p.getAddress().getStateName());
        }
        Address a=session.get(Address.class,7001);
        if(a!=null)
        {
        	System.out.println(a.getHouseNo()+" "+a.getStreetName());
        	System.out.println(a.getCity()+" "+a.getStateName());
        	System.out.println(a.getPerson().getSsn()+" "+a.getPerson().getPersonName());
        	System.out.println(a.getPerson().getAge()+" "+a.getPerson().getGender());
        }
        session.close();
        HibernateUtil.shutDown();
    }
}
