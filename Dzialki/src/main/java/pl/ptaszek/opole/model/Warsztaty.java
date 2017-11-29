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
		Adres wieden = new Adres("byleco", "shunbrunerStrasse 23/3", "129028", "wieden");
		Osoba radek = new Osoba("Radek", "Ptaszek", miechowice, "13.01.1888", "8953121251412");
		Osoba przemek = new Osoba("Przemek", "Ptaszek", wieden, "10.10.1010", "10101010101001");
		Dzialka sad = new Dzialka("MOG-334", "324 metry kwadratowe", radek, miechowice);
		Dzialka pole = new Dzialka("MOG-335", "1 metr kwadratowy", przemek, wieden);
		Dzialka ropa = new Dzialka("MOG-100", "100 metr kwadratowy", radek, miechowice);
		Dzialka kicha = new Dzialka("MOG-5", "10 metr kwadratowy", przemek, wieden);
		Dzialka blok = new Dzialka("MOG-3", "10000000 metr kwadratowy", radek, miechowice);
		EwidencjaDzialek ewidencja = new EwidencjaDzialek();
		ewidencja.usunDzialka(radek, sad);
		ewidencja.wyswietlDzialki(radek);
		ewidencja.dodajDzialka(radek, sad);
		ewidencja.wyswietlDzialki(radek);
		ewidencja.usunDzialka(radek, sad);
		ewidencja.wyswietlDzialki(radek);
		ewidencja.dodajDzialka(radek,ropa);
		ewidencja.dodajDzialka(radek,blok);
		ewidencja.dodajDzialka(radek,blok);
		ewidencja.wyswietlDzialki(radek);
	}
}
