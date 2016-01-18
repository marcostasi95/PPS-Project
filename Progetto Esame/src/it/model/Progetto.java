package it.model;

import javax.xml.crypto.Data;

public class Progetto {
	
	private String capoProgetto;
	private String codProgetto;
	private Data dataI;
	private Data dataF;
	private double costoMax;
	private double budRes;
	
	public Progetto (String capoProgetto, String codProgetto, Data dataI, Data dataF, double costoMax, double budRes){
		
		this.capoProgetto = capoProgetto;
		this.codProgetto = codProgetto;
		this.dataI = dataI;
		this.dataF = dataF;
		this.costoMax = costoMax;
		this.budRes = budRes;
	}

	public String getCapoProgetto() {
		return capoProgetto;
	}

	public void setCapoProgetto(String capoProgetto) {
		this.capoProgetto = capoProgetto;
	}

	public String getCodProgetto() {
		return codProgetto;
	}

	public void setCodProgetto(String codProgetto) {
		this.codProgetto = codProgetto;
	}

	public Data getDataI() {
		return dataI;
	}

	public void setDataI(Data dataI) {
		this.dataI = dataI;
	}

	public Data getDataF() {
		return dataF;
	}

	public void setDataF(Data dataF) {
		this.dataF = dataF;
	}

	public double getCostoMax() {
		return costoMax;
	}

	public void setCostoMax(double costoMax) {
		this.costoMax = costoMax;
	}

	public double getBudRes() {
		return budRes;
	}

	public void setBudRes(double budRes) {
		this.budRes = budRes;
	}

	
}
