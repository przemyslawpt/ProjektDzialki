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
	
	public Dzialka() {
		numerEwidencyjny = "USTAW ZANIM ZACZNIESZ UZYWAC";
	}
	
	public String getNumerEwidencyjny() {
		return numerEwidencyjny;
	}

	public void setNumerEwidencyjny(String wartosc) {
		numerEwidencyjny = wartosc;
	}

}
