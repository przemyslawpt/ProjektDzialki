package pl.ptaszek.opole.model;

/**
 * Klasa uruchomeniowa.
 */
public class Warsztaty {

	/**
	 * Uruchamia klasy.
	 * 
	 * @param argc
	 */
	public static void main(String[] argc) {
		String ulica = "Miechowice";
		String numerDomu = "28";
		String kodPocztowy = "05-640";
		String miejscowosc = "Mogielnica";
		Adres miechowice = new Adres(ulica, numerDomu, kodPocztowy, miejscowosc);
		
		Osoba radek= new Osoba("Radek", "Ptaszek", miechowice, "13.01.1888", "8953121251412");
		
	}
}
