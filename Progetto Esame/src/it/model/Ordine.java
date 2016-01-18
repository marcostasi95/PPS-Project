package it.model;

public class Ordine {
	
	private String codOrdine;
	private double totale;
	private double prezzo;
	private String nomeArt;
	private String nomeUtente;
	private String codProgetto;
	
	public Ordine (String codOrdine, double totale, double prezzo, String nomeArt, String nomeUtente, String codProgetto){
	this.codOrdine = codOrdine;
	this.totale = totale;
	this.prezzo = prezzo;
	this.nomeArt = nomeArt;
	this.nomeUtente = nomeUtente;
	this.codProgetto = codProgetto;
			
	}
		

	public String getCodOrdine() {
		return codOrdine;
	}

	public void setCodOrdine(String codOrdine) {
		this.codOrdine = codOrdine;
	}

	public double getTotale() {
		return totale;
	}

	public void setTotale(double totale) {
		this.totale = totale;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getNomeArt() {
		return nomeArt;
	}

	public void setNomeArt(String nomeArt) {
		this.nomeArt = nomeArt;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getCodProgetto() {
		return codProgetto;
	}

	public void setCodProgetto(String codProgetto) {
		this.codProgetto = codProgetto;
	}


}
