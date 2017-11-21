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
	 * Rozmiar dzia³ki w metrach kwadratowych
	 */
	private String wielkoscDzialki;
	
	public Dzialka() {
		numerEwidencyjny = "USTAW ZANIM ZACZNIESZ UZYWAC";
	}

	public Dzialka(String nrEwidencyjny) {
		numerEwidencyjny = nrEwidencyjny;
	}

	public String getNumerEwidencyjny() {
		return numerEwidencyjny;
	}

	public void setNumerEwidencyjny(String wartosc) {
		numerEwidencyjny = wartosc;
	}

	public void rozmiar() {
		wielkoscDzialki = "podaj iloœæ metrów kwadrat";	
	
	}
}
