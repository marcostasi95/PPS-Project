package it.model;

public class Articolo extends Categoria{
	
	private String codiceA;
	private String nomeA;
	private int disponibilita;
	private double prezzo;
	private String descrizione;
	private String produttore;
	private String fornitore;
	
	public Articolo (String nomeC, String codiceA, String nomeA, int disponibilita, double prezzo, String descrizione, String produttore, String fornitore){
		super(nomeC);
		this.codiceA = codiceA;
		this.nomeA = nomeA;
		this.disponibilita = disponibilita;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
		this.produttore = produttore;
		this.fornitore = fornitore;
	}

	public String getCodiceA() {
		return codiceA;
	}

	public void setCodiceA(String codiceA) {
		this.codiceA = codiceA;
	}

	public String getNomeA() {
		return nomeA;
	}

	public void setNomeA(String nomeA) {
		this.nomeA = nomeA;
	}

	public int getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(int disponibilita) {
		this.disponibilita = disponibilita;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getProduttore() {
		return produttore;
	}

	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}

	public String getFornitore() {
		return fornitore;
	}

	public void setFornitore(String fornitore) {
		this.fornitore = fornitore;
	}
	
	
	public String getNomeC(){
		return nomeC;
	}
	


}
