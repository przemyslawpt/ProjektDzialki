package pl.ptaszek.opole.dao;

import java.util.List;

import pl.ptaszek.opole.model.Adres;

public interface AdresDao {

	void save(Adres user);

	List<Adres> list();
}
