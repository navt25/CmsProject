package com.tcs.dao.inf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface GenericOperationsDao {
	public Session getSession(SessionFactory factory);
}
