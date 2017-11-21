package pl.ptaszek.opole.model;

/**
 * Opisuje dzialke.
 *
 */
public class Dzialka {

	/**
	 * Numer ewidencyjny dzialki. Polski standard UFE-223.
	 */
	private String numerEwidencyjny;
	/**
	 * Rozmiar dzialki w metrach kwadratowych
	 */
	private String wielkoscDzialki;

	private Osoba wlasciciel;

	private Adres adres;
		
	public Dzialka() {
	}

	public Dzialka(String numerEwidencyjny, String wielkoscDzialki, Osoba wlasciciel) {
		super();
		this.numerEwidencyjny = numerEwidencyjny;
		this.wielkoscDzialki = wielkoscDzialki;
		this.wlasciciel = wlasciciel;
	}

	public String getNumerEwidencyjny() {
		return numerEwidencyjny;
	}

	public void setNumerEwidencyjny(String wartosc) {
		numerEwidencyjny = wartosc;

	}

	public String getWielkoscDzialki() {
		return wielkoscDzialki;
	}

	public Osoba getWlasciciel() {
		return wlasciciel;
	}

	public void setWlasciciel(Osoba wlasciciel) {
		this.wlasciciel = wlasciciel;
	}

}
