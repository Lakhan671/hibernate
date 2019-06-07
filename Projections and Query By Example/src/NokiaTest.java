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
		Session session = sessionFactory.openSession();
		session.beginTransaction();
       
		Criteria criteria=session.createCriteria(NOKIA.class);
		                       
		                       
		
				List<NOKIA> nokias=(List<NOKIA>)criteria.list();
				for(NOKIA no:nokias){
					System.out.println(no);
				}
				
		session.getTransaction().commit();
		session.cancelQuery();
		sessionFactory.close();
		
	}

}
