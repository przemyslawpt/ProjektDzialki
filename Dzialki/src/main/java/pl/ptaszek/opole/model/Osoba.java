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
		return "Imie: " + imie + "\nNazwisko: " + nazwisko + "\nadres: " + adres + "\nData urodzenia: "
				+ dataUrodzenia + "\nPESEL" + pesel;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (adres == null) {
			if (other.adres != null)
				return false;
		} else if (!adres.equals(other.adres))
			return false;
		if (dataUrodzenia == null) {
			if (other.dataUrodzenia != null)
				return false;
		} else if (!dataUrodzenia.equals(other.dataUrodzenia))
			return false;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		if (pesel == null) {
			if (other.pesel != null)
				return false;
		} else if (!pesel.equals(other.pesel))
			return false;
		return true;
	}
	
}
