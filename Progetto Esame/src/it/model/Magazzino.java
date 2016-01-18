package it.model;

public class Magazzino {
	
	private String codMagazzino;
	private String indirizzoMag;
	
	public Magazzino(String codMagazzino, String indirizzoMag){
		
		this.codMagazzino=codMagazzino;
		this.indirizzoMag=indirizzoMag;
	}

	public String getCodMagazzino() {
		return codMagazzino;
	}

	public void setCodMagazzino(String codMagazzino) {
		this.codMagazzino = codMagazzino;
	}

	public String getIndirizzoMag() {
		return indirizzoMag;
	}

	public void setIndirizzoMag(String indirizzoMag) {
		this.indirizzoMag = indirizzoMag;
	}
	
	
	

}
