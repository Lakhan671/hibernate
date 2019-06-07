import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projections;



public class NokiaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		//first session .....
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
       NOKIA n=(NOKIA)session.get(NOKIA.class,3);
       System.out.println(n);
      // n.setMobileName("l_kokia");
       NOKIA n1=(NOKIA)session.get(NOKIA.class,3);
       System.out.println(n1);
       session.getTransaction().commit();
		session.close();
		
		
       // second  Session ...
       
		
       Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		
		NOKIA n2=(NOKIA)session2.get(NOKIA.class,3);
		System.out.println(n2);
		
		session2.getTransaction().commit();
		session2.close();
		
		sessionFactory.close();
		
	}

}
