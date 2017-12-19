package pl.ptaszek.opole.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * Opisuje wlasciciela dzialki
 * 
 */
public class WlascicielDzialki {

	/**
	 * 
	 */
	private String nazwa;
	/**
	 * 
	 */
	private BigDecimal procentowyUdzial;
	/**
	 * 
	 */
	private String podstawaWlasnosci;
	
	private Adres adres;
	
	private String numerIdentyfikacjiPodatkowej;
	
	private String regon;
	
	private List<Reprezentant> reprezentant;
	
	
	
	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public String getNumerIdentyfikacjiPodatkowej() {
		return numerIdentyfikacjiPodatkowej;
	}

	public void setNumerIdentyfikacjiPodatkowej(String numerIdentyfikacjiPodatkowej) {
		this.numerIdentyfikacjiPodatkowej = numerIdentyfikacjiPodatkowej;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public BigDecimal getProcentowyUdzial() {
		return procentowyUdzial;
	}

	public void setProcentowyUdzial(BigDecimal procentowyUdzial) {
		this.procentowyUdzial = procentowyUdzial;
	}

	public String getPodstawaWlasnosci() {
		return podstawaWlasnosci;
	}

	public void setPodstawaWlasnosci(String podstawaWlasnosci) {
		this.podstawaWlasnosci = podstawaWlasnosci;
	}

}
