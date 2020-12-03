/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

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
public class Selecte_ActualTrip {
    public static List<ActualTripInfoSchedule> actualTripList = new ArrayList<ActualTripInfoSchedule>();

        public static void ActualTripTableInformation() {
        try {
            actualTripList.clear();
            String driver = "com.mysql.jdbc.Driver";
            
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Select TripNumber,Date,"
                    + "ScheduledStartTime,StopNumber,SchedulledArrivalTime,"
                    + "ActualStartTime,NumberofPassengersIn,"
                    + "NumberofPassengersOut from actualtripinfo";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int TripNumber = rs.getInt("TripNumber");
                String Date = rs.getDate("Date").toString();
                String ScheduledStartTime = rs.getString("ScheduledStartTime");
                int StopNumber = rs.getInt("StopNumber");
                String SchedulledArrivalTime = rs.getString("SchedulledArrivalTime");
                String ActualStartTime = rs.getString("ActualStartTime");
                int NumberofPassengersIn = rs.getInt("NumberofPassengersIn");
                int NumberofPassengersOut = rs.getInt("NumberofPassengersOut");
                
                ActualTripInfoSchedule actualInfo = new ActualTripInfoSchedule(Integer.toString(TripNumber),Date,ScheduledStartTime,
                        Integer.toString(StopNumber), SchedulledArrivalTime,ActualStartTime,
                        Integer.toString(NumberofPassengersIn), Integer.toString(NumberofPassengersOut));
                actualTripList.add(actualInfo);
            }
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
