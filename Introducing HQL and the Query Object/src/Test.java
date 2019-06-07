
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {
	public static Employee1 e=null;
	public void retriveRecord(Session se){
		se.beginTransaction();
		/*System.out.println("Enter the id ");
		int id=new Scanner(System.in).nextInt();*/
		
		//HQL start form "from"
	   Query query=se.createQuery("from Employee1");
	   
	   
	   List<Employee1> list=(List<Employee1>)query.list();
	   for(Employee1 ee:list){
		   
	   System.out.println(ee);
	   
	   }
		se.getTransaction().commit();
	}
	
	public void updateRecord(Session se){
		se.beginTransaction();
		System.out.println("Enter the id ");
		int id=new Scanner(System.in).nextInt();
	Employee1 ee=(Employee1) se.get(Employee1.class, id);
		ee.setAddress("gooa");
		se.update(ee);
		se.getTransaction().commit();
	}
	public void deleteRecord(Session se){
		se.beginTransaction();
		System.out.println("Enter the id ");
		int id=new Scanner(System.in).nextInt();
	Employee1 ee=(Employee1) se.get(Employee1.class, id);
		se.delete(ee);
		se.getTransaction().commit();
	}
	
public void insertRecord(Session se){
	
	
	for(int i=1;i<=2;i++){
		se.beginTransaction();
		e=new Employee1();
		System.out.println("Enter the id");
		int id=new Scanner(System.in).nextInt();
		System.out.println("Enter the name ");
		String name=new Scanner(System.in).next();
		System.out.println("Enter the Address:");
		String Add=new Scanner(System.in).next();
		e.setAddress(Add);
		e.setId(id);
		e.setName(name);
		se.save(e);
		
	}
	se.getTransaction().commit();
}
	
	public static void main(String[] args) {
		
		
		
		SessionFactory se=new Configuration().configure().buildSessionFactory();
		Session session=se.openSession();
		//session.beginTransaction();
		
		Test test=new Test();
		//test.insertRecord(session);
		test.retriveRecord(session);
		
		//test.deleteRecord(session);
		//test.updateRecord(session);
		
		
		//session.getTransaction().commit();
		session.close();
		se.close();

	}

}
