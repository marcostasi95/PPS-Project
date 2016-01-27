package it.view;

import java.awt.*;

import javax.swing.*;

public class CatLayout extends JFrame {

	public CatLayout() {
	super ("Seleziona Prodotto");
	JMenu categoria = new JMenu("Categoria");
	JLabel nome = new JLabel ("Nome Utente");
	JCheckBox selez = new JCheckBox();
	JLabel prezzo = new JLabel("Costo");
	JLabel nomeA = new JLabel ("Nome Articolo");
	JLabel descrizione = new JLabel ("descrizione");
	JLabel produttore = new JLabel ("Produttore");
	JLabel fornitore = new JLabel ("Fornitore");
	JLabel disponibilita = new JLabel ("Disponibile");
	JMenu quantita = new JMenu("Seleziona quantità");
	JButton gotocar = new JButton("Vai al carrello");
	JButton logout = new JButton("Logout");
	Container c = getContentPane();
	c.setLayout(null);
	logout.setBounds(700,43, logout.getPreferredSize().width, logout.getPreferredSize().height);
	categoria.setBounds(350, 50, categoria.getPreferredSize().width, categoria.getPreferredSize().height);
	nome.setBounds(600, 50, nome.getPreferredSize().width, nome.getPreferredSize().height);
	nomeA.setBounds(100,200, nomeA.getPreferredSize().width,nome.getPreferredSize().height);
	descrizione.setBounds(100,230, descrizione.getPreferredSize().width, descrizione.getPreferredSize().height);
	produttore.setBounds(100,260, produttore.getPreferredSize().width, produttore.getPreferredSize().height);
	fornitore.setBounds(200,260, fornitore.getPreferredSize().width, fornitore.getPreferredSize().height);
	prezzo.setBounds(310,230,prezzo.getPreferredSize().width,prezzo.getPreferredSize().height);
	disponibilita.setBounds(380, 230, disponibilita.getPreferredSize().width,disponibilita.getPreferredSize().height);
	selez.setBounds(500, 228, selez.getPreferredSize().width, selez.getPreferredSize().height);
	quantita.setBounds(600, 230, quantita.getPreferredSize().width, quantita.getPreferredSize().height);
	gotocar.setBounds(350, 600, gotocar.getPreferredSize().width, gotocar.getPreferredSize().height);
	c.add(logout);
	c.add(gotocar);
	c.add(quantita);
	c.add(selez);
	c.add(disponibilita);
	c.add(prezzo);
	c.add(categoria);
	c.add(nome);
	c.add(nomeA);
	c.add(descrizione);
	c.add(descrizione);
	c.add(produttore);
	c.add(fornitore);
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	setSize(800,800);
	}
	
}
