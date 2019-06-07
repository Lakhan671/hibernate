import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
	public static void main(String[] args) {
		Address add1=new Address();
		add1.setCity("Delhi");
		add1.setPincode("345");
		Address add2=new Address();
		add2.setCity("Rachi");
		add2.setPincode("876");
		Employee e=new Employee();
		e.setId(101);
		e.setName("lakhan singh");
		e.getListofAddress().add(add1);
		e.getListofAddress().add(add2);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr= session.beginTransaction();
		session.save(e);
		tr.commit();
		session.close();
	}

}
