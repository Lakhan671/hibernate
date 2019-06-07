

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateTest {
	public static void main(String[] args) {
		UserDetail user=new UserDetail();
		user.setUid(1004);
		user.setName("nirmal singh");
		user.setAddress("Delhi 201 cnad place");
		user.setCity("mumbai");
		user.setDate(new Date());
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr= session.beginTransaction();
	session.save(user);
	tr.commit();
	session.close();
	
	
	}

}
