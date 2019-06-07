package com.ducat.relationships.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestManyToMany {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emp3 emp = new Emp3();
		emp.setId(4);
		emp.setName("Amit");
		emp.setSal(90909);
		Collection<Dept3> deptList  = new ArrayList<Dept3>();
		Dept3 dept = new Dept3();
		dept.setDeptName("IT");
		deptList.add(dept);
		Dept3 dept2 = new Dept3();
		dept2.setDeptName("Training");
		deptList.add(dept2);
		emp.setDept(deptList);
		
		Collection<Emp3> empList = new ArrayList<Emp3>();
		empList.add(emp);
		Emp3 emp2  =new Emp3();
		emp2.setName("Ram");
		emp2.setSal(9090);
		emp2.setId(5);
		dept.setEmp(empList);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction trans = session.beginTransaction();
		session.save(emp);
		session.save(emp2);
		session.save(dept);
		session.save(dept2);
		trans.commit();
		session.close();

	}

}
