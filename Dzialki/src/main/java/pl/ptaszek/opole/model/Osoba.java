package pl.ptaszek.opole.model;

/**
 * Opisuje osobe
 * 
 * @author Radek
 *
 */
public class Osoba {
	/**
	 * Imiê
	 */
	private String imie;
	/**
	 * Nazwisko
	 */
	private String nazwisko;
	/**
	 * Adres
	 */
	private Adres adres;
	/**
	 * Data urodzenia
	 */
	private String dataUrodzenia;
	/**
	 * Numer ewidencyjny
	 */
	private String pesel;

	public Osoba() {
	}

	public Osoba(String imie, String nazwisko, Adres adres, String dataUrodzenia, String pesel) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.dataUrodzenia = dataUrodzenia;
		this.pesel = pesel;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public String getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(String dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	
	public String toString() {
		return "Imie: " + imie + ", Nazwisko: " + nazwisko + ", adres: " + adres + ", Data urodzenia: "
				+ dataUrodzenia + ", PESEL" + pesel;
	}
}
