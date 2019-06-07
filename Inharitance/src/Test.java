import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DeartMent dm=new DeartMent();
		dm.setDpId(12);
		McaDeartment md=new McaDeartment();
		md.setBuilName("fory");
		md.setId(23);
		ItDeartment id=new ItDeartment();
		id.setItBlockName("A");
		id.setDpId(43);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		se.save(dm);
		se.save(id);
		se.save(md);
		tr.commit();
		se.close();
	}

}
