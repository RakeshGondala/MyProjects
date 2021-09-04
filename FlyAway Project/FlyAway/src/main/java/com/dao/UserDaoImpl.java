package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import Entity.User;

public class UserDaoImpl implements UserDao {


	SessionFactory sessionFactory = new Configuration().configure()
			/* .addResource("EProduct.hbm.xml") */
			.addAnnotatedClass(Entity.Source.class)
			.buildSessionFactory();
	
	@Override
	public int addUser(User user) {
		Session session= sessionFactory.getCurrentSession();
		session.beginTransaction();
		int id=(int) session.save(user);
		session.close();
		return id;
	}

	@Override
	public List<User> getUsers() {
		Session session= sessionFactory.getCurrentSession();
		session.getTransaction();
		List<User> users = session.createQuery("from User").list();
		session.close();
		return users;
		
	}
 }
 

