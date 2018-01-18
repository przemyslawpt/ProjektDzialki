package pl.ptaszek.opole.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.ptaszek.opole.model.Adres;

@Repository
public class AdresDaoImpl implements AdresDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Adres adres) {
		sessionFactory.getCurrentSession().save(adres);
	}

	@Override
	public List<Adres> list() {
		@SuppressWarnings("unchecked")
		TypedQuery<Adres> query = sessionFactory.getCurrentSession().createQuery("from Adres");
		return query.getResultList();
	}

}
