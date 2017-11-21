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
		Dzialka radkaDzialka = new Dzialka();
		Dzialka mojaDzialka = radkaDzialka;
		System.out.println(radkaDzialka.getNumerEwidencyjny());
		radkaDzialka.setNumerEwidencyjny("MOG-334");
		System.out.println(radkaDzialka.getNumerEwidencyjny());
		System.out.println(mojaDzialka.getNumerEwidencyjny());
		Dzialka asiDzialka = new Dzialka("OPOLE-222356");
		System.out.println(asiDzialka.getNumerEwidencyjny());
	}

}
