package com.tcs.dao.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tcs.dao.inf.GenericOperationsDao;

@Transactional
public class GenericOperationsDaoImpl implements GenericOperationsDao {

		@Resource(name = "devSessionFactory")
		protected SessionFactory sessionFactory;
	    
	    public Session getSession(SessionFactory factory) {
	        if (factory == null) {
	            System.out.println("factory is null");
	        }
	        
	        if (factory.getCurrentSession() == null) {
	        	 System.out.println("session is null");
	        }
	        
	        return factory.getCurrentSession();
	    }
}
