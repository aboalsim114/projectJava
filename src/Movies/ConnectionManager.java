/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Movies;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yutri
 */


public class ConnectionManager {

   private static String  user = "root";
   private static String password = "";
   private static String url = "jdbc:mysql://localhost:3306/projectjava";
    private static Connection con;
  

public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
               Connection  con = DriverManager.getConnection(url, user, password);
               if(con!=null){
            System.out.println("connected to the database");

               }
              
               else{
               System.out.println("failed to connect to the database");

               }
               
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found."); 
        }
        return con;
    }
    
      
    
    
    
    

}


