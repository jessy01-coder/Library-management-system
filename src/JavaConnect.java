/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
   
    
  // private Connection conn;
  // private Statement statement;
   
   public static Connection ConnectDb(){
      /* if (conn == null )
       {
           String url= "jdbc:mysql://localhost/";
           String dbName="library";
           String driver="com.mysql.jdbc.Driver";
           String userName="root";
           String password="";
           try*/
              //Connection conn = null;
           try{
               Class.forName("com.mysql.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
               System.out.println("Connected!");
               return conn;
           }
           catch (Exception e)
               
           {
             JOptionPane.showMessageDialog(null, e);
             return null;
   }
           
   
   
}
   }

