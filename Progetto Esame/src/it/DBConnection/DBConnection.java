package it.DBConnection;
import java.sql.*;
import java.util.ArrayList;

public class DBConnection {

   private static Connection db;      
   private static boolean connesso;    
   private static DBConnection instance; 

   public static synchronized DBConnection getInstance() {
	   if(instance == null)
		   instance = new DBConnection();
	   if(connesso != true)
			connetti("gestione_ordini", "root", "database95!");
	   return instance;
   }
   

   private static boolean connetti(String nomeDB, String nomeUtente, String pwdUtente) {

	   if(connesso) return true;

      try {


         Class.forName("com.mysql.jdbc.Driver");
         db = DriverManager.getConnection("jdbc:mysql://127.0.0.1/" + nomeDB + "?user=" + nomeUtente + "&password=" + pwdUtente);
         connesso=true;
         
      } catch (Exception e) {
    	  e.printStackTrace(); 
     }
      return connesso;
   }

   
   public ArrayList<String[]> eseguiQuery(String query) {
      ArrayList<String[]> a = null;
      String [] record;
      int colonne = 0;
      try {
         Statement stmt = db.createStatement();     
         ResultSet rs = stmt.executeQuery(query);   
         a = new ArrayList<String[]>();
         ResultSetMetaData rsmd = rs.getMetaData();
         colonne = rsmd.getColumnCount();

         while(rs.next()) {   
            record = new String[colonne];
            for (int i=0; i<colonne; i++) record[i] = rs.getString(i+1);
            a.add( (String[]) record.clone() );
         }

      } catch (Exception e) { e.printStackTrace(); }

      return a;
   }


   public boolean eseguiAggiornamento(String query) {
      boolean risultato = false;
      try {
         Statement stmt = db.createStatement();
         stmt.executeUpdate(query);
         risultato = true;
         stmt.close();
      } catch (Exception e) {
         e.printStackTrace();
         risultato = false;
      }
      return risultato;
   }

   
   private void disconnetti() {
      try {
         db.close();
         connesso = false;
      } catch (Exception e) { e.printStackTrace(); }
   }

   public boolean isConnesso() { return connesso; }   
}
