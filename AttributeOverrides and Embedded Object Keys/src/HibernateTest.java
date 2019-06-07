

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateTest {
	public static void main(String[] args) {
		UserDetail user=new UserDetail();
		Addess add=new Addess();
		add.setCity("delhi");
		add.setLoc("KulaGard");
		add.setZibCode(2991);
		
		user.setUid(1004);
		user.setName("nirmal singh");
		user.setCity("mumbai");
		user.setHomeAddress(add);
		Addess add1=new Addess();
		add1.setCity("channi");
		add1.setLoc("rachi");
		add1.setZibCode(7332);
		user.setOfficeAddress(add1);
      
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr= session.beginTransaction();
	session.save(user);
	tr.commit();
	session.close();
	
	
	}

}
