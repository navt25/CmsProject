package com.tcs.dao.impl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.dao.impl.GenericOperationsDaoImpl;
import com.tcs.dao.inf.StudentOperationsDao;

@Service
public class StudentOperationsDaoImpl  implements StudentOperationsDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void getStudents() {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createSQLQuery("select * from tab");
		q.list();
		
		
		
		
	}

}
