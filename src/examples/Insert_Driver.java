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
public class Insert_Driver {
    public static void InsertDriverTable(String DriverName, String phoneNumber) {
        try {
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com/heroku_d024c4b29cf6214";
            String username = "ba39d14a73da25";
            String password = "f221ecf9";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Insert Into driver (DriverName, DriverTelephoneNumber)"
                    + " Values ( ?,  ?)";
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, DriverName);
            preparedStatement.setString(2, phoneNumber);

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
