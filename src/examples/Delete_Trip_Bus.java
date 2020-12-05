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
import java.sql.Statement;

/**
 *
 * @author edgarchilin
 */
public class Delete_Trip_Bus {
    
    public static void DeleteBusProccess(int busId){
        System.out.println("Wait Deleting Bus");
        changeTripOfferingeTable(busId);
        DeleteBusTable(busId);
        System.out.println("Deleteing Bus Complete");
    }
    public static void DeleteTripOferringProccess(int trip, String time, String start){
        System.out.println("Wait Deleteing Trip");
        DeleteActualTripTable(trip, time, start);
        DeleteTripStopInfoTable(trip);
        DeleteTripOfferingTable(trip, time, start);
        System.out.println("Deleting Trip Complete");
    }
    
    public static void changeTripOfferingeTable(int busId) {
        try {
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Update tripoffering Set  BusID = null "
                    + "where BusID = ?";
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, busId);

            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
//                System.out.println("Generated Emp Id: " + rs.getInt(1));
            }

//            System.out.println("Completed Update");

        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    public static void DeleteBusTable(int busId) {
        try {
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "DELETE FROM bus WHERE BusID=?;";
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, busId);

            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
//                System.out.println("Generated Emp Id: " + rs.getInt(1));
            }

//            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
     public static void DeleteActualTripTable(int trip, String time, String start) {
        try {
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "DELETE FROM actualtripInfo WHERE "
                    + "TripNumber=? And Date = ? And ScheduledStartTime = ? ;";
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             preparedStatement.setInt(1, trip);
            preparedStatement.setString(2, time);
            preparedStatement.setString(3, start);



            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
                System.out.println("Generated Emp Id: " + rs.getInt(1));
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public static void DeleteTripOfferingTable(int trip, String time, String start) {
        try {
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "DELETE FROM tripoffering WHERE "
                    + "TripNumber=? And Date = ? And ScheduledStartTime = ? ;";
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, trip);
            preparedStatement.setString(2, time);
            preparedStatement.setString(3, start);



            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
//                System.out.println("Generated Emp Id: " + rs.getInt(1));
            }

//            System.out.println("Completed Delete From Trip Offering");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
     public static void DeleteTripStopInfoTable(int trip) {
        try {
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "DELETE FROM tripstopinfo\n" +
                    "WHERE TripNumber = ? ;";
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, trip);
      
            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
//                System.out.println("Generated Emp Id: " + rs.getInt(1));
            }

//            System.out.println("Completed Delete From Trip Offering");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
