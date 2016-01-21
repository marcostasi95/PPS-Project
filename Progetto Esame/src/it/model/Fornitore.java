package it.model;

public class Fornitore {
	
	private String nomeF;
	private int codForn;
	private String telF;
	private String mailF;

	
	public Fornitore (String nomeF, int codForn, String telF, String mailF){
		this.nomeF = nomeF;
		this.codForn = codForn;
		this.telF = telF;
		this.mailF = mailF;
	}


	public String getNomeF() {
		return nomeF;
	}


	public void setNomeF(String nomeF) {
		this.nomeF = nomeF;
	}


	public int getCodForn() {
		return codForn;
	}


	public void setCodForn(int codForn) {
		this.codForn = codForn;
	}


	public String getTelF() {
		return telF;
	}


	public void setTelF(String telF) {
		this.telF = telF;
	}


	public String getMailF() {
		return mailF;
	}


	public void setMailF(String mailF) {
		this.mailF = mailF;
	}
	
	
}
