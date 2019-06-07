package com.ducat.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ducat.Address;
import com.ducat.Employee;

public class TestHibernate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Employee emp = new Employee();
		Address address = new Address();
		address.setCity("Delhi-7");
		address.setState("Delhi");
		address.setZipCode("2222");
		
		Address office_address = new Address();
		office_address.setCity("Mumbai");
		office_address.setState("Maharashta");
		office_address.setZipCode("23333222");
		//emp.setEmpno(1002);
		emp.setAddress(address);
		emp.setOfficeAddress(office_address);
		emp.setName("Shyam");
		emp.setSal(9999.99);
		emp.setEmpDescription("AAAAAAAAAAAAAAAAAAAAAAAPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPHHHHHHHHHHHHHHHHHHHHHHHHHHEEEEEEEEEEEEEEEEEEEEEEENNNNNNNNNNNNNNNN");
		Calendar c = Calendar.getInstance();
		c.set(10, 2,1990);
		emp.setDob(c.getTime());
		//emp.setDob(new Date());
		Employee emp2 = new Employee();
		//emp.setEmpno(1002);
		emp2.setName("Ram");
		emp2.setSal(9999.99);
		emp2.setEmpDescription("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");*/
		Employee emp = new Employee();
		emp.setName("Amit");
		Address address = new Address();
		address.setCity("Delhi");
		address.setState("Delhi");
		address.setZipCode("111100");
		Set<Address> addressSet = new HashSet<Address>();
		addressSet.add(address);
		address = new Address();
		address.setCity("Noida");
		address.setState("UP");
		address.setZipCode("222200");
		addressSet.add(address);
		emp.setAddress(addressSet);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction trans = session.beginTransaction();
		session.save(emp);
		trans.commit();
		session.close();
		//session.save(emp2);
		session = sessionFactory.openSession();
		 trans = session.beginTransaction();
		Employee emp2 = (Employee)session.get(Employee.class,1);
		System.out.println(emp2);
		System.out.println("address "+emp2.getAddress());
		trans.commit();
		session.close();
		Runtime r;
		
		
		

	}

}
