package com.ducat.relationships.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emp1 emp = new Emp1();
		emp.setName("Amit");
		emp.setSal(90909);
		Dept1 dept = new Dept1();
		dept.setDeptName("IT");
		emp.setDept(dept);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction trans = session.beginTransaction();
		session.save(emp);
		session.save(dept);
		trans.commit();
		session.close();

	}

}
