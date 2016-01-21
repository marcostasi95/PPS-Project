package it.model;

public class Ordine {
	
	private int codOrdine;
	private double totale;
	private double prezzo;
	private String nomeArt;
	private String nomeUtente;
	private int codProgetto;
	
	public Ordine (int codOrdine, double totale, double prezzo, String nomeArt, String nomeUtente, int codProgetto){
	this.codOrdine = codOrdine;
	this.totale = totale;
	this.prezzo = prezzo;
	this.nomeArt = nomeArt;
	this.nomeUtente = nomeUtente;
	this.codProgetto = codProgetto;
			
	}
		

	public int getCodOrdine() {
		return codOrdine;
	}

	public void setCodOrdine(int codOrdine) {
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

	public int getCodProgetto() {
		return codProgetto;
	}

	public void setCodProgetto(int codProgetto) {
		this.codProgetto = codProgetto;
	}


}
