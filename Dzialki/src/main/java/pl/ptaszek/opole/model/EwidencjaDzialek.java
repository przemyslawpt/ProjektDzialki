package pl.ptaszek.opole.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Przechowuje rejestr dzialek z przypisaniem do osoby
 **/
public class EwidencjaDzialek {
	/**
	 * Rejestr dzia³ek
	 */
	private Map<Osoba, List<Dzialka>> rejestr;

	public EwidencjaDzialek() {
		rejestr = new HashMap<Osoba, List<Dzialka>>();
	}
	
	public void dodajDzialka()
}
