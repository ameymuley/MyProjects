package com.ameym.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ameym.dto.Application_User;

public class HibernateTest {

	public static void main(String[] args) {
		
		Application_User user = new Application_User();
		user.setUsername("muleyamy");
		user.setPassword("Ameya123");
		user.setFirstname("Amey");
		user.setLastname("Muley");
		user.setAddress("Nandanwan Layout, Nagpur");
		user.setEmail("ameyamuley@rediffmail.com");
		user.setPhone(942174472);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}

}
