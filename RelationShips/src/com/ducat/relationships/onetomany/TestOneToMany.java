package com.ducat.relationships.onetomany;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToMany {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emp2 emp = new Emp2();
		emp.setName("Amit");
		emp.setSal(90909);
		Collection<Dept2> deptList = new ArrayList<Dept2>();
		Dept2 dept = new Dept2();
		dept.setDeptName("IT");
		dept.setDeptno(4);
		deptList.add(dept);
		Dept2 dept2 = new Dept2();
		dept2.setDeptName("Training");
		dept2.setDeptno(5);
		deptList.add(dept2);
		emp.setDept(deptList);
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction trans = session.beginTransaction();
		session.save(emp);
		session.save(dept);
		session.save(dept2);
		trans.commit();
		session.close();

	}

}
