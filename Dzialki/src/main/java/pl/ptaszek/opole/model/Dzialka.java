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

	
	public Dzialka(String numerEwidencyjny, String wielkoscDzialki, Osoba wlasciciel, Adres adres) {
		super();
		this.numerEwidencyjny = numerEwidencyjny;
		this.wielkoscDzialki = wielkoscDzialki;
		this.wlasciciel = wlasciciel;
		this.adres = adres;
	}


	public String getNumerEwidencyjny() {
		return numerEwidencyjny;
	}


	public void setNumerEwidencyjny(String numerEwidencyjny) {
		this.numerEwidencyjny = numerEwidencyjny;
	}


	public String getWielkoscDzialki() {
		return wielkoscDzialki;
	}


	public void setWielkoscDzialki(String wielkoscDzialki) {
		this.wielkoscDzialki = wielkoscDzialki;
	}


	public Osoba getWlasciciel() {
		return wlasciciel;
	}


	public void setWlasciciel(Osoba wlasciciel) {
		this.wlasciciel = wlasciciel;
	}


	public Adres getAdres() {
		return adres;
	}


	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	public String toString() {
		return "Numer Ewidencyjny: " + numerEwidencyjny + ", Wielkosc dzialki: " + wielkoscDzialki;
	}
	
}
