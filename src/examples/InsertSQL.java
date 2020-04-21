/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;  

/**
 *
 * @author edgarchilin
 */
public class InsertSQL {
    public static int InsertCallPk;
    public static int ResponderPK;
        public static int IncidentReportPK;
                public static int DispatcherPK;


    
    public static int getIncidentReportPK(){
        return IncidentReportPK;
    }
    
    
    
    public static void InsertCall(String name, String description) {
        try {
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO RecieveCall (holdStatus, Name, Descritpion)"
                    + " VALUES (?,?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setBoolean(1, true);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, description);

            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
                System.out.println("Generated Emp Id: " + rs.getInt(1));
                InsertCallPk = rs.getInt(1);
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void Priority(String PriorityType,  int IncidentReportID) {
        try {
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO Priority (PriorityType, PriorityTime, IncidentReportID)"
                    + " VALUES (?,?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");  
             Date date = new Date();  
             System.out.println(formatter.format(date));
             String record = date.toString();
            preparedStatement.setString(1, PriorityType);
            preparedStatement.setString(2, record);
            preparedStatement.setInt(3, IncidentReportID);

            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
                System.out.println("Generated Emp Id: " + rs.getInt(1));
                InsertCallPk = rs.getInt(1);
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
       public static void ReicieveCallIncidentReport(int RecieveCallID, int IncidentReportID) {

        try {
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO ReicieveCallIncidentReport (RecieveCallID, IncidentReportID)"
                    + " VALUES (?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, RecieveCallID);
            preparedStatement.setInt(2, IncidentReportID);
            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
              //  System.out.println("Generated Emp Id: " + rs.getInt(1));
              //  InsertCallPk = rs.getInt(1);
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public static void IncidentReport(String IncidentType, String Name, String Location, 
             String Description, int PoliceCode) {

        try {
            System.out.println("wait Insert for report");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO IncidentReport (IncidentType, Name, Location, Description, PoliceCode)"
                    + " VALUES (?,?,?,?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, IncidentType);
            preparedStatement.setString(2, Name);
             preparedStatement.setString(3, Location);
            preparedStatement.setString(4, Description);
            preparedStatement.setInt(5, PoliceCode);
            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
              //  System.out.println("Generated Emp Id: " + rs.getInt(1));
                IncidentReportPK = rs.getInt(1);
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
                        System.out.println("report Insert failed ");

        }
    }
    
      public static void Dispatcher(String name, String branch) {

        try {
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO Dispatcher (Name, Branch)"
                    + " VALUES (?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, branch);
            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
              //  System.out.println("Generated Emp Id: " + rs.getInt(1));
                DispatcherPK = rs.getInt(1);
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     public static void OtherAgency(String AgencyBracnch, int IncidentID, int DispatcherId, String Description) {
        try {
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO RecieveCall (IncidentID, DispatcherId,Description,AgencyBracnch)"
                    + " VALUES (?,?,?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, IncidentID);
            preparedStatement.setInt(2, DispatcherId);
            preparedStatement.setString(3, Description);
            preparedStatement.setString(1, AgencyBracnch);

            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
              //  System.out.println("Generated Emp Id: " + rs.getInt(1));
              //  InsertCallPk = rs.getInt(1);
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
     
    
      public static void DispatchResponder(int dispatch,  int ResponderNumber) {

        try {
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Insert Into DispatcherResponder (DispatcherId, ResponderNumber)"
                    + " VALUES (?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, dispatch);
            preparedStatement.setInt(2, ResponderNumber);
          
            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
             //   System.out.println("Generated Emp Id: " + rs.getInt(1));
             //   ResponderPK = rs.getInt(1);
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
    
    
    
    public static void Responder(String name, String status, String type, String Position) {

        try {
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Insert Into Responder (Name, Status, TypeofOfficer, Position)"
                    + " VALUES (?,?,?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, status);
            preparedStatement.setString(3, type);
            preparedStatement.setString(4, Position);

            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
                System.out.println("Generated Emp Id: " + rs.getInt(1));
                ResponderPK = rs.getInt(1);
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void ResponderAssignment(int responder, String assignment, int IncidentNumber) {

        try {
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Insert Into ResponderAssignment (ResponderNumber, Assignment, Complete, IncidentReportID)"
                    + " VALUES (?,?, ?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, responder);
            preparedStatement.setString(2, assignment);
            preparedStatement.setBoolean(3, false);
            preparedStatement.setInt(4, IncidentNumber);

    

            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
                //System.out.println("Generated Emp Id: " + rs.getInt(1));
                //ResponderPK = rs.getInt(1);
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
     public static void ResponderLocation(String Location, String ETATOINCIDENT, int ResponderNumber) {

        try {
            System.out.println("wait Insert");
            ResultSet rs = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Insert Into ResponderLocation (Location, ETATOINCIDENT, ResponderNumber)"
                    + " VALUES (?,?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, Location);
            preparedStatement.setString(2, ETATOINCIDENT);
            preparedStatement.setInt(3, ResponderNumber);
          
            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
            if (rs != null && rs.next()) {
             //   System.out.println("Generated Emp Id: " + rs.getInt(1));
             //   ResponderPK = rs.getInt(1);
            }

            System.out.println("Completed Insert");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
}
