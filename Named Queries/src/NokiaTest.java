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
        /* Query query=session.getNamedQuery("NOKIA.byId");
         query.setInteger(0,2);*/
		
		
		 Query query=session.getNamedQuery("NOKIA>ByName");
         query.setString(0,"N72");
				
				List<NOKIA> nokias=(List<NOKIA>)query.list();
				for(NOKIA no:nokias){
					System.out.println(no);
				}
				
		session.getTransaction().commit();
		session.cancelQuery();
		sessionFactory.close();
		
	}

}
