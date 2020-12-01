/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author edgarchilin
 */
public class Update_Schedule {
    
       public static void UpdateBus( int BusID, int TripNumber, String date, String schedule) {

        try {
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Update tripoffering Set  BusID = ?"
                    + " where TripNumber = ? And Date= ? And ScheduledStartTime = ?";
                   
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, BusID);
            preparedStatement.setInt(2, TripNumber);
            preparedStatement.setString(3, date);
            preparedStatement.setString(4, schedule);
            preparedStatement.executeUpdate();
             conn.close();
            System.out.println("Completed Update");

        } catch (Exception e) {
            System.out.println(e);
        }
        
        }
       public static void UpdateDriver( String Driver, int TripNumber, String date, String schedule) {

        try {
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Update tripoffering Set  DriverName = ?"
                    + " where TripNumber = ? And Date= ? And ScheduledStartTime = ?";
                   
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, Driver);
            preparedStatement.setInt(2, TripNumber);
            preparedStatement.setString(3, date);
            preparedStatement.setString(4, schedule);
            preparedStatement.executeUpdate();
             conn.close();
            System.out.println("Completed Update");

        } catch (Exception e) {
            System.out.println(e);
        }
        
        }
}
