package it.view;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;


public class DipLayout extends JFrame {
	

	public DipLayout()
	{
		super("Schermata dipendente");
		setLocation(500,200);
		ImageIcon car=new ImageIcon("C:/Users/Giuseppe/Desktop/carrello.gif");
		
//		this.d=d;
		JLabel benvenuto = new JLabel("Benvenuto kjkj"/*+  d.getNome()*/);
		JMenuBar bar =new JMenuBar();
		JMenu categoria = new JMenu("Categoria");
		JButton carrello = new JButton(car);
		JButton logout = new JButton("Logout");
		
		Container c = getContentPane();
		
		setJMenuBar(bar);
		bar.add(categoria);
		categoria.add(new JMenuItem("Categoria"));
		categoria.add(new JMenuItem("Cancelleria"));
		categoria.add(new JMenuItem("Elettronica"));
		categoria.add(new JMenuItem("Toner"));
		
		
		
		c.setLayout(null);
		carrello.setBounds(550,25, 100, 50);
		benvenuto.setBounds(400, 5, benvenuto.getPreferredSize().width,30);
		logout.setBounds(670, 25, 100,50);
		bar.setBounds(500, 600, bar.getPreferredSize().width,30);
		
		c.add(benvenuto);
		c.add(bar);
		c.add(logout);
		c.add(carrello);
		
		
		setSize(800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}


