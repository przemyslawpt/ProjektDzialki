package pl.ptaszek.opole.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Przechowuje rejestr dzialek z przypisaniem do osoby
 **/
public class EwidencjaDzialek {
	/**
	 * Rejestr dzialek
	 */
	private Map<Osoba, List<Dzialka>> rejestr;

	public EwidencjaDzialek() {
		rejestr = new HashMap<Osoba, List<Dzialka>>();
	}

	/**
	 * @param osoba
	 *            osoba
	 * @param dzialka
	 *            dzialka
	 */
	public void dodajDzialka(Osoba osoba, Dzialka dzialka) {

	}

	/**
	 * Usuwa dzialke
	 * 
	 * @param osoba
	 * @param dzialka
	 */
	public void usunDziala(Osoba osoba, Dzialka dzialka) {

	}

	/**
	 * Wyswietla dzialki dla danej osoby
	 * 
	 * @param osoba
	 * @return
	 */
	public List<Dzialka> podajDzialki(Osoba osoba) {
		return null;
	}
}
