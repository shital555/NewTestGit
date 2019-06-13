package com.scp.emp.util;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HbmEmp {
	public static void main(String[] args) {
		
		EmployeeData e1=new EmployeeData(101, "Shital kashid", 200000,"Cogni");
		EmployeeData e4=new EmployeeData(104, "Shital1 kashid", 220000,"Cogn2i");
		EmployeeData e2=new EmployeeData(102, "Mangesh kashid", 232000,"synechron");
		EmployeeData e3=new EmployeeData(103, "Shubhangi kashid", 23260,"TCS");
		
		Product p1=new Product(1,"mobileaaaaaaaaa");
		Product p2=new Product(2,"HAIR DRYERaaaaa");
		Product p3=new Product(3,"CHARGERaaaaaaaa");
		Product p4=new Product(4,"LAPPYaaaaaaaaaa");
		
		//Properties
		
		
		/*
		 * SessionFactory sf=new
		 * Configuration().configure("hsql-hibernate.cfg.xml").buildSessionFactory();
		 * SessionFactory sf1=new
		 * Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 */
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		SessionFactory sf1=new Configuration().configure("hsql-hibernate.cfg.xml").buildSessionFactory();
		
		Session mysqlsession=sf.openSession();
		Session mysqlsession1=sf.getCurrentSession();
		Session mysqlsession2=sf.getCurrentSession();
		
		Session hsqlsession=sf1.openSession();
		Session hsqlsession1=sf1.getCurrentSession();
		Session hsqlsession2=sf1.getCurrentSession();
	
		System.out.println("Mysql dayabase");
		System.out.println(mysqlsession.hashCode());
		System.out.println(mysqlsession1.hashCode());
		System.out.println(mysqlsession2.hashCode());
		
		System.out.println("Hsql Database");
		System.out.println(hsqlsession.hashCode());
		System.out.println(hsqlsession1.hashCode());
		System.out.println(hsqlsession2.hashCode());
		 
		Transaction tr=mysqlsession.beginTransaction();
		Transaction tr1=hsqlsession.beginTransaction();
		
		
		  mysqlsession.save(e1); mysqlsession.save(e2); mysqlsession.save(e3);
		  mysqlsession.save(e4);
		  
		  mysqlsession.save(p1); mysqlsession.save(p2); mysqlsession.save(p3);
		  mysqlsession.save(p4);
		  
		  hsqlsession.save(e1); hsqlsession.save(e2); hsqlsession.save(e3);
		  hsqlsession.save(e4);
		  
		  hsqlsession.save(p1); hsqlsession.save(p2); hsqlsession.save(p3);
		  hsqlsession.save(p4);
		  
		  
		 		
		mysqlsession.flush();
		hsqlsession.flush();
		
		tr.commit();
		tr1.commit();
		
		mysqlsession.clear();
		hsqlsession.clear();
				
		System.out.println("Completed");
	}
}
