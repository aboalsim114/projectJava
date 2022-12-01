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
public class connection {
    public static void main(String[] args){
        
        
        Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/projectjava?user=root&password=");
             System.out.println("connected");
            statement  = connect.createStatement();
            String q = "Select * from login";
            resultSet  = statement.executeQuery(q);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"error to connect to the database" );
          
        }
        
        
    }
}
