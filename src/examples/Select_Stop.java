/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import static examples.Select_MainSchedule.busScheduleList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgarchilin
 */
public class Select_Stop {
    
        public static List<StopSchedule> stopScheduleList = new ArrayList<StopSchedule>();

        public static void StopInformation() {
        try {
            stopScheduleList.clear();
            String driver = "com.mysql.jdbc.Driver";
            
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql
                    
                    = "Select TripNumber, StopNumber, "
                    + "SequenceNumber, DrivingTime from tripstopinfo";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int trip = rs.getInt("TripNumber");
                int stop = rs.getInt("StopNumber");
                int sequence = rs.getInt("SequenceNumber");
                int drivingTime = rs.getInt("DrivingTime");

                StopSchedule stopInformation = new StopSchedule(Integer.toString(trip), Integer.toString(stop),
                        Integer.toString(sequence), Integer.toString(drivingTime));
                stopScheduleList.add(stopInformation);
              
            }
            conn.close();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
