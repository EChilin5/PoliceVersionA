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
public class Insert_ActualTrip {
    public static void InsertActualTripTable(int TripNumber, String Date, String ScheduledStartTime, 
            int StopNumber, String SchedulledArrivalTime, String ActualStartTime, 
            int NumberofPassengersIn, int NumberofPassengersOut) {
        try {
            
            
            
            
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Insert Into actualtripinfo (TripNumber,Date,ScheduledStartTime,StopNumber,"
                    + "SchedulledArrivalTime,ActualStartTime,NumberofPassengersIn,NumberofPassengersOut)"
                    + " Values ( ?,?, ?,?,?,?,?,?)";
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, TripNumber);
            preparedStatement.setString(2, Date);
            preparedStatement.setString(3, ScheduledStartTime);
            preparedStatement.setInt(4, StopNumber);
            preparedStatement.setString(5, SchedulledArrivalTime);
            preparedStatement.setString(6, ActualStartTime);
            preparedStatement.setInt(7, NumberofPassengersIn);
            preparedStatement.setInt(8, NumberofPassengersOut);


            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
                System.out.println("Generated Emp Id: " + rs.getInt(1));
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
