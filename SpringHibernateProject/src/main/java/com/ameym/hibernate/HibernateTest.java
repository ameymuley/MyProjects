package com.ameym.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ameym.dto.AppUser;

public class HibernateTest {

	public static void main(String[] args) {
		
		AppUser user = new AppUser();
		user.setId(1001);
		user.setName("Simranjeet Singh");
		user.setAge(25);
		user.setAddress("Ashok Nagar, Nagpur");
		user.setSalary(25000.00f);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}

}
