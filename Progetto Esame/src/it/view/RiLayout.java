package it.view;

import java.awt.*;

import javax.swing.*;

public class RiLayout extends JFrame {

	public RiLayout(){
		super ("Conferma Stampa");
		JLabel ricevuta = new JLabel("Vuoi Stampare la ricevuta?");
		JButton si = new JButton("Si");
		JButton no = new JButton("No");
		
		Container c = getContentPane();
		c.setLayout(null);
		ricevuta.setBounds(70,50, ricevuta.getPreferredSize().width, ricevuta.getPreferredSize().height);
		si.setBounds(50, 90, 50, 50);
		no.setBounds(200,90, 50, 50);
		c.add(ricevuta);
		c.add(si);
		c.add(no);
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
