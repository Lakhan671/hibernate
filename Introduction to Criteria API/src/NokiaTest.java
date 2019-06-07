import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;


public class NokiaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
        Criteria criteria=session.createCriteria(NOKIA.class);
        
       // criteria.add(Restrictions.eq("id", 8));
        criteria.add(Restrictions.or(Restrictions.between("id", 3,6),Restrictions.between("id",5,7)));
        
				List<NOKIA> nokias=(List<NOKIA>)criteria.list();
				for(NOKIA no:nokias){
					System.out.println(no);
				}
				
		session.getTransaction().commit();
		session.cancelQuery();
		sessionFactory.close();
		
	}

}
