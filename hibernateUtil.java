package com.Demo;

import java.util.Properties;

public class hibernateUtil {
public static void main(String [] args) {

	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cfg.xml");
	configuration.addAnnotatedClass(Employee.class);
	// Create Session Factory
    SessionFactory sessionFactory = configuration.buildSessionFactory();

	// Initialize Session Object
	Session session = sessionFactory.openSession();
	Employee emp = new Employee(105,"bdc","it");
	session.beginTransaction();

	// Here we have used
	// save() method of JPA
	session.save(emp);
	session.getTransaction().commit();
	}
}
