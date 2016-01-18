package it.view;

import java.awt.*;

import javax.swing.*;

public class PayLayout extends JFrame {

	public PayLayout(){
		super("Schermata Pagamento");
		
		JLabel nomeutente = new JLabel("Nome Utente");
		JButton logout = new JButton("Logout");
		JMenu progetto = new JMenu("Seleziona Progetto");
		JLabel totale = new JLabel("Totale:"/*+ get*/);
		JButton conferma = new JButton("Conferma Pagamento");
		
		//creare menu con i nomi progetto all'interno
		
		Container c = getContentPane();
		c.setLayout(null);
		nomeutente.setBounds(600,10, nomeutente.getPreferredSize().width,nomeutente.getPreferredSize().height);
		logout.setBounds(700,10, logout.getPreferredSize().width, logout.getPreferredSize().height);
		progetto.setBounds(200, 300, progetto.getPreferredSize().width, progetto.getPreferredSize().height);
		totale.setBounds(700, 400, totale.getPreferredSize().width, totale.getPreferredSize().height);
		conferma.setBounds(700,600, conferma.getPreferredSize().width,conferma.getPreferredSize().height);
		
		c.add(nomeutente);
		c.add(logout);
		c.add(progetto);
		c.add(totale);
		c.add(conferma);
		
		setSize(800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		}
	
}
