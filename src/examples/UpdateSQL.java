/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author edgarchilin
 */
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
public class UpdateSQL {
    
    
        public static void ResponderAssignment( int assignment) {

        try {
            System.out.println("wait update" 
            +assignment);
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Update ResponderAssignment Set  Complete = ? where AssignmentID = ?";
                   
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);
            preparedStatement.setInt(2, assignment);
           
            preparedStatement.executeUpdate();
             conn.close();
            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
        
        }
            
        public static void ResponderStatus( int responderNumber, String Status) {

        try {
            System.out.println("wait update" );
     
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Update Responder Set  Status = ? where ResponderNumber = ?";
                   
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, Status);
            preparedStatement.setInt(2, responderNumber);
           
            preparedStatement.executeUpdate();
             conn.close();
            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}
