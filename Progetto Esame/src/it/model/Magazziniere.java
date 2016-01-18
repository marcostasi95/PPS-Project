package it.model;

import javax.xml.crypto.Data;

public class Magazziniere extends Utente {
	
	public Magazziniere(String email, String password, String nome, String cognome, char sesso, Data dataNascita,
			String indirizzoC, String indirizzoL, String cellulare, String progetto, String ruolo) {
		super(email, password, nome, cognome, sesso, dataNascita, indirizzoC, indirizzoL, cellulare, progetto, ruolo);
	
	}

	
}

