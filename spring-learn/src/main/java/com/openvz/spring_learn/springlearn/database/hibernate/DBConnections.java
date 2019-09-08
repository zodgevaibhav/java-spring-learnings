package com.openvz.spring_learn.springlearn.database.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnections {

	public static void main(String[] args) {
		//Create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
	
		//create session
		
		try {
			Session session = factory.getCurrentSession();

			
			//create student object
			System.out.println("Creating student object");
			Student std = new Student("Swati","Zodge");
			//start a transaction
			session.beginTransaction();
			
			//save student object
			
			session.save(std);
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done.....");
			
		}catch(Exception e){
			System.out.println("********* exception occur ");
			e.printStackTrace();
		}
		
		finally {
			factory.close();
		}
	}
	
}
