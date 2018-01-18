package pl.ptaszek.opole.service;

import java.util.List;

import pl.ptaszek.opole.model.Adres;

public interface AdresService {

	void save(Adres user);

	List<Adres> list();

}
