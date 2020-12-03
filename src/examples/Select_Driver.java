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
public class Select_Driver {
    public static List<DriverInformation> driverScheduleList = new ArrayList<DriverInformation>();

        public static void DriverTableInformation() {
        try {
            driverScheduleList.clear();
            String driver = "com.mysql.jdbc.Driver";
            
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Select D.DriverName as driver, T.Date as Date\n" +
                      "From driver As D, tripOffering as T\n" +
                       "Where D.DriverName = T.DriverName";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String driverName = rs.getString("driver");
             
                String date = rs.getString("Date");

                DriverInformation driverInfo = new DriverInformation(driverName, date );
                driverScheduleList.add(driverInfo);
            }
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
