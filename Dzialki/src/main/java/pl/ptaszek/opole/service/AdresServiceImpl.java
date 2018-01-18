package pl.ptaszek.opole.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.ptaszek.opole.dao.AdresDao;
import pl.ptaszek.opole.model.Adres;

@Service
public class AdresServiceImpl implements AdresService {

	@Autowired
	private AdresDao adresDao;

	@Transactional
	public void save(Adres adres) {
		adresDao.save(adres);
	}

	@Transactional(readOnly = true)
	public List<Adres> list() {
		return adresDao.list();
	}

}
