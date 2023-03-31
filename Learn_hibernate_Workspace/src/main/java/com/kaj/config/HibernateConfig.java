package com.kaj.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kaj.entity.Flight;



public class HibernateConfig {
	
	public static SessionFactory getSessionFactory() {
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Flight.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		return sessionFactory;
	}
}
 