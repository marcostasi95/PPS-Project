package it.view;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
 
		public Login ()
  {
      super("Accesso");
	  JLabel user = new JLabel("Username");
	  JLabel password = new JLabel ("Password");
	  JTextField u = new JTextField(50);
	  JTextField p = new JTextField(20);
	  JButton l = new JButton("Login");
	  JButton forget = new JButton ("Password Dimenticata?");
	  Container log = getContentPane();
	  
	  log.setLayout(null);
	  user.setBounds(50, 50, 60, user.getPreferredSize().height);
	  password.setBounds(50, 70, password.getPreferredSize().width, password.getPreferredSize().height);
	  u.setBounds(120,50, u.getPreferredSize().width, u.getPreferredSize().height);
	  p.setBounds(120, 70, p.getPreferredSize().width,p.getPreferredSize().height);
	  l.setBounds(80, 90, l.getPreferredSize().width,l.getPreferredSize().height);
	  forget.setBounds(150,90, forget.getPreferredSize().width,forget.getPreferredSize().height);
	  
	  log.add(user);
	  log.add(password);
	  log.add(u);
	  log.add(p);
	  log.add(l);
	  log.add(forget);

	  
	  setSize(500,300);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  setVisible(true);
}
}