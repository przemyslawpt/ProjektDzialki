package pl.ptaszek.opole.model;

/**
 * Opisuje obreb geodezyjny.
 *
 */
public class ObrebGeodezyjny {

	/**
	 * Number ewidencyjny.
	 */
	private String numerIdentyfinacyjny;

	private String miejscowosc;

	private String solectwo;

	public String getNumerIdentyfinacyjny() {
		return numerIdentyfinacyjny;
	}

	public void setNumerIdentyfinacyjny(String numerIdentyfinacyjny) {
		this.numerIdentyfinacyjny = numerIdentyfinacyjny;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getSolectwo() {
		return solectwo;
	}

	public void setSolectwo(String solectwo) {
		this.solectwo = solectwo;
	}

}
