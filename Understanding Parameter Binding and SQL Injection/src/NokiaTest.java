import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class NokiaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
/* 1.
		 //SQL injection....
		String minid="5 or 1=1";
		
		//int minid = 5;
		Query query=session.createQuery("from NOKIA where id >"+minid);
		List<NOKIA> nokias=(List<NOKIA>)query.list();
		for(NOKIA no:nokias){
			System.out.println(no);
		}*/
		
	
		
	//2.	SQL injection....
				
				/*
				String minid = "5";
				String name="samNOKIA";
				Query query=session.createQuery("from NOKIA where id > ?and mobileName=?");
				query.setInteger(0,Integer.parseInt(minid));
				query.setString(1,name);
				
				List<NOKIA> nokias=(List<NOKIA>)query.list();
				for(NOKIA no:nokias){
					System.out.println(no);
				}
				*/
	
		//3.
		
				String minid = "5";
				String name="samNOKIA";
				Query query=session.createQuery("from NOKIA where id >:id and mobileName=:mo");
				query.setInteger("id",Integer.parseInt(minid));
				query.setString("mo",name);
				
				List<NOKIA> nokias=(List<NOKIA>)query.list();
				for(NOKIA no:nokias){
					System.out.println(no);
				}
				
		session.getTransaction().commit();
		session.cancelQuery();
		sessionFactory.close();
		
	}

}
