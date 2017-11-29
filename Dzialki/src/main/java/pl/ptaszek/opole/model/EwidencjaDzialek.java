package pl.ptaszek.opole.model;

import java.util.ArrayList;
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
		List<Dzialka> dzialkiOsoby = rejestr.get(osoba);
		if (dzialkiOsoby == null) {
			rejestr.put(osoba, new ArrayList<Dzialka>());
		}
		rejestr.get(osoba).add(dzialka);
	}

	/**
	 * Usuwa dzialke
	 * 
	 * @param osoba
	 * @param dzialka
	 */
	public void usunDzialka(Osoba osoba, Dzialka dzialka) {
		if (rejestr.get(osoba) == null) {
			return;
		}
		rejestr.get(osoba).remove(dzialka);
	}

	/**
	 * Wyswietla dzialki dla danej osoby
	 * 
	 * @param osoba
	 * @return
	 */
	public List<Dzialka> podajDzialki(Osoba osoba) {
		return rejestr.get(osoba);
	}

	public void wyswietlDzialki(Osoba osoba) {
		System.out.println("------------");
		System.out.println(osoba);
		List<Dzialka> dzialkiOsoby = rejestr.get(osoba);
		if (dzialkiOsoby == null) {
			return;
		}
		System.out.println("------------");
		for (Dzialka dzialka : dzialkiOsoby) {
			System.out.println(dzialka);
		}
		System.out.println("------------");
	}

}
