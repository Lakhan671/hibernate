import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.ejb.criteria.expression.ConcatExpression;


public class Test {

	public static void main(String[] args) {
		OnlineShop on=new OnlineShop();
		//here is tresient object.
		
		
		on.setName("Nokia 72");
		SessionFactory se=new Configuration().configure().buildSessionFactory();
		Session session =se.openSession();
		
		session.beginTransaction();
		session.save(on);
		
		
		
		//here is persistent object.
		on.setName("Windo 8");
		
		
		
		session.getTransaction().commit();
		session.close();
		on.setName("vlc 2.09");
		

}
}