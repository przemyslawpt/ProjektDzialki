package pl.ptaszek.opole.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import pl.ptaszek.opole.model.Adres;

public class AdresDao {

	protected SessionFactory sessionFactory;

	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings
				// // from //
				// hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	protected void exit() {
		sessionFactory.close();
	}

	protected void create() {
		Adres adres = new Adres();
		adres.setKodPocztowy("45-383");
		adres.setMiejscowosc("Lubartow");
		adres.setUlica("WojskaPolskiego");
		adres.setNumberLokalu("2");
		adres.setNumerDomu("12");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(adres);
		session.getTransaction().commit();
		session.close();
	}

	protected void read() {
	}

	protected void update() {
	}

	protected void delete() {
	}

	public static void main(String[] args) {
		AdresDao manager = new AdresDao();
		manager.setup();
		manager.create();
		manager.exit();
	}
	
}
