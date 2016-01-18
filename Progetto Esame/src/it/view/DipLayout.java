package it.view;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;


public class DipLayout extends JFrame {
	

	public DipLayout()
	{
		super("Schermata dipendente");
//		this.d=d;
		JLabel benvenuto = new JLabel("Benvenuto "/*+  d.getNome()*/);
		JMenuBar bar =new JMenuBar();
		JMenu categoria = new JMenu("Categoria");
		JButton carrello = new JButton("Carrello");
		JButton logout = new JButton("Logout");
		
		Container c = getContentPane();
		
		setJMenuBar(bar);
		bar.add(categoria);
		categoria.add(new JMenuItem("Categoria"));
		categoria.add(new JMenuItem("Cancelleria"));
		categoria.add(new JMenuItem("Elettronica"));
		categoria.add(new JMenuItem("Toner"));
		
		c.setLayout(null);
		carrello.setBounds(1,2, carrello.getPreferredSize().width, carrello.getPreferredSize().height);
		benvenuto.setBounds(400, 10, benvenuto.getPreferredSize().width, benvenuto.getPreferredSize().height);
		logout.setBounds(700, 10, logout.getPreferredSize().width, logout.getPreferredSize().height);
		bar.setBounds(130, 70, bar.getPreferredSize().width,bar.getPreferredSize().height);
		
		c.add(benvenuto);
		c.add(bar);
		c.add(logout);
		c.add(carrello);
		
		
		setSize(800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}


