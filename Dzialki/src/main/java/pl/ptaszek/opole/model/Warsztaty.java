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
		System.out.println(miechowice);
		
		Osoba radek= new Osoba("Radek", "Ptaszek", miechowice, "13.01.1888", "8953121251412");
		System.out.println(radek);
		
		Dzialka sad = new Dzialka ("MOG-334", "324 metry kwadratowe", radek, miechowice);
		System.out.println(sad);
		/**
		 * Jak uruchomic program (jakich komend uzyc?) aby kazda kolejna dana byla pod sob� a nie w jednej lini??
		 * jak zrobic wprowadzanie danych? scanner in?
		 */
		
	}
}
