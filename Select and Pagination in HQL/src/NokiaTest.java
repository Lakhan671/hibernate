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
		/*Query query=session.createQuery("from NOKIA");
		//pagination as following....
		query.setFirstResult(5);//starting form
		query.setMaxResults(3);  // retrive max result.
		
		List<NOKIA> nokias=(List<NOKIA>)query.list();
		for(NOKIA no:nokias){
			System.out.println(no);
		}*/
		
		/*select query......*/
		
		Query query=session.createQuery("mobileName from NOKIA");
		//pagination as following....
		query.setFirstResult(5);//starting form
		query.setMaxResults(3);  // retrive max result.
		
		List<String> nokias=(List<String>)query.list();
		for(String no:nokias){
			System.out.println(no);
		}
		session.getTransaction().commit();
		session.cancelQuery();
		sessionFactory.close();
		
	}

}
