/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import static examples.SQLConnections.officersList;
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
public class Select_MainSchedule {
    
    public static List<BusSchedule> busScheduleList = new ArrayList<BusSchedule>();

    public static void BusInformation() {
        try {
            busScheduleList.clear();
            String driver = "com.mysql.jdbc.Driver";
            
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql
                    
                    = "Select  T.TripNumber as Trip,  T.StartLocationName as mainLocation, "
                    + "T.DestinationName as Destination,\n" +
                    " t1.Date as day, t1.ScheduledStartTime as startTime,"
                    + " t1.ScheduledArrivalTime as ArrivalTime, t1.DriverName as Driver,"
                    + " t1.BusID as BusId\n" +
                    "From trip as T, tripoffering as t1 \n" +
                    "Where T.TripNumber = t1.TripNumber";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int trip = rs.getInt("Trip");
                String mainLocation = rs.getString("mainLocation");
                String destination = rs.getString("Destination");
                String day = rs.getDate("day").toString();
                String startTime = rs.getString("startTime");
                String arriveTime = rs.getString("ArrivalTime");
                String driverName = rs.getString("Driver");
                int busId = rs.getInt("BusID");

                BusSchedule busInformation = new BusSchedule(Integer.toString(trip),mainLocation, destination, day,
                        startTime, arriveTime,
                        driverName, Integer.toString(busId));
                busScheduleList.add(busInformation);
            }
            conn.close();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
    
}
