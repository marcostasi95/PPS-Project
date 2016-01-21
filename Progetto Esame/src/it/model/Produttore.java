package it.model;

public class Produttore {

	private String nomeP;
	private int codP;
	private String telP;
	private String mailP;
	private String indiP;
	
	public Produttore (String nomeP, int codP, String telP, String mailP, String indiP){
		this.nomeP = nomeP;
		this.codP = codP;
		this.telP = telP;
		this.mailP = mailP;
		this.indiP = indiP;
	
	}

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public int getCodP() {
		return codP;
	}

	public void setCodP(int codP) {
		this.codP = codP;
	}

	public String getTelP() {
		return telP;
	}

	public void setTelP(String telP) {
		this.telP = telP;
	}

	public String getMailP() {
		return mailP;
	}

	public void setMailP(String mailP) {
		this.mailP = mailP;
	}

	public String getIndiP() {
		return indiP;
	}

	public void setIndiP(String indiP) {
		this.indiP = indiP;
	}
	
	
}
