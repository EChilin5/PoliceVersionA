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
public class Select_Complete_DriverTable {
     public static List<DriverTableInfo> driverCompleteList = new ArrayList<DriverTableInfo>();

        public static void DriverCompleteTableInformation() {
        try {
            driverCompleteList.clear();
            String driver = "com.mysql.jdbc.Driver";
            
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Select DriverName, DriverTelephoneNumber From Driver";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String driverName = rs.getString("DriverName");
                int phoneNumber = rs.getInt("DriverTelephoneNumber");

                DriverTableInfo driverInfo = new DriverTableInfo(driverName, Integer.toString(phoneNumber) );
                driverCompleteList.add(driverInfo);
            }
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
