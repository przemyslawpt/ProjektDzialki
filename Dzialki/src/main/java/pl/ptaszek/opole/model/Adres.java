package pl.ptaszek.opole.model;

public class Adres {
		
		private String ulica;
		
		private String numerDomu;
		
		private String kodPocztowy;
		
		private String miejscowosc;
	
		public Adres() {}

		public Adres(String ulica, String numerDomu, String kodPocztowy, String miejscowosc) {
			this.ulica = ulica;
			this.numerDomu = numerDomu;
			this.kodPocztowy = kodPocztowy;
			this.miejscowosc = miejscowosc;
		}

		public String getUlica() {
			return ulica;
		}

		public void setUlica(String ulica) {
			this.ulica = ulica;
		}

		public String getNumerDomu() {
			return numerDomu;
		}

		public void setNumerDomu(String numerDomu) {
			this.numerDomu = numerDomu;
		}

		public String getKodPocztowy() {
			return kodPocztowy;
		}

		public void setKodPocztowy(String kodPocztowy) {
			this.kodPocztowy = kodPocztowy;
		}

		public String getMiejscowosc() {
			return miejscowosc;
		}

		public void setMiejscowosc(String miejscowosc) {
			this.miejscowosc = miejscowosc;
		}

	}

