package it.view;

import java.awt.*;

import javax.swing.*;

public class CloseLayout extends JFrame{

 public CloseLayout(){
	 super ("Schermata Finale");
	 JLabel fine = new JLabel("Grazie per gli acquisti");
	 JButton logout = new JButton("Logout");
	 Container c = getContentPane();
	 c.setLayout(null);
	 fine.setBounds(350,50,200,150);
	 logout.setBounds(370,170, 90,30);
	 
	c.add(fine);
	c.add(logout);
	setSize(800,800);
	setVisible(true);
	 
 }
}
