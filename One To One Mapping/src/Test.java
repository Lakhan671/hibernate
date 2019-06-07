import javax.swing.plaf.basic.BasicSliderUI.TrackListener;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		OnlineShope o=new OnlineShope();
		ItemList il=new ItemList();
		il.setName("shoes");
		il.setTiemPrice(300);
		
		o.setItemno(3);
		o.setName("tops");
		o.setItemlist(il);
		session.save(o);
		session.save(il);
		tr.commit();
	
		session.close();
	}

}
