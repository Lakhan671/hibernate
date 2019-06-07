

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
		user.setAddress(add);
        user.setCity("mumbai");
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr= session.beginTransaction();
	session.save(user);
	tr.commit();
	session.close();
	
	
	}

}
