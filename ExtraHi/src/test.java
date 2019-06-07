import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	SessionFactory se=new Configuration().configure().buildSessionFactory();
	Session session=se.openSession();
	session.getTransaction().begin();
	Amitdetail a=new Amitdetail();
	a.setAddress("ddd");
	a.setName("amit");
	a.setRono(1011);
	session.save(a);
	session.getTransaction().commit();
	session.close();
	se.close();
	

	}

}
