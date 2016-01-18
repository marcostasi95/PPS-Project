package it.model;

import javax.xml.crypto.Data;

public class Utente {
	
	private String email;
	private String password;
	private String nome;
	private String cognome;
	private char sesso;
	private Data dataNascita;
	private String indirizzoC;
	private String indirizzoL;
	private String cellulare;
	private String progetto;
	private String ruolo;
	
	public Utente(String email, String password, String nome, String cognome, char sesso, Data dataNascita, String indirizzoC, String indirizzoL, String cellulare, String progetto, String ruolo)
	{
		this.email=email;
		this.password=password;
		this.nome=nome;
		this.cognome=cognome;
		this.sesso=sesso;
		this.dataNascita=dataNascita;
		this.indirizzoC=indirizzoC;
		this.indirizzoL=indirizzoL;
		this.cellulare=cellulare;
		this.progetto=progetto;
		this.ruolo=ruolo;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public char getSesso() {
		return sesso;
	}
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}
	public Data getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Data dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getIndirizzoC() {
		return indirizzoC;
	}
	public void setIndirizzoC(String indirizzoC) {
		this.indirizzoC = indirizzoC;
	}
	public String getIndirizzoL() {
		return indirizzoL;
	}
	public void setIndirizzoL(String indirizzoL) {
		this.indirizzoL = indirizzoL;
	}
	public String getCellulare() {
		return cellulare;
	}
	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}
	public String getProgetto() {
		return progetto;
	}
	public void setProgetto(String progetto) {
		this.progetto = progetto;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	
	
	

}
