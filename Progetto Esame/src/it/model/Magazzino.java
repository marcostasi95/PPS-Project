package it.model;

public class Magazzino {
	
	private int codMagazzino;
	private String indirizzoMag;
	
	public Magazzino(int codMagazzino, String indirizzoMag){
		
		this.codMagazzino=codMagazzino;
		this.indirizzoMag=indirizzoMag;
	}

	public int getCodMagazzino() {
		return codMagazzino;
	}

	public void setCodMagazzino(int codMagazzino) {
		this.codMagazzino = codMagazzino;
	}

	public String getIndirizzoMag() {
		return indirizzoMag;
	}

	public void setIndirizzoMag(String indirizzoMag) {
		this.indirizzoMag = indirizzoMag;
	}
	
	
	

}
