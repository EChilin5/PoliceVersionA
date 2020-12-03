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
public class Select_Complete_BusTable {
    
     public static List<BusTableInfo> busCompleteList = new ArrayList<BusTableInfo>();

        public static void BusCompleteTableInformation() {
        try {
            busCompleteList.clear();
            String driver = "com.mysql.jdbc.Driver";
            
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Select BusID, Model, Year  From Bus";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int busID = rs.getInt("BusID");
                String model = rs.getString("Model");
                String year = rs.getString("Year");

                BusTableInfo busInfo = new BusTableInfo(Integer.toString(busID), model, year );
                busCompleteList.add(busInfo);
            }
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
