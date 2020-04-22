package examples;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edgarchilin
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLConnections {

    /**
     *
     */
    public static List<UserInfo> users = new ArrayList<UserInfo>();
    public static List<Operator> operatorList = new ArrayList<Operator>();
    public static List<Alarm> alarmList = new ArrayList<Alarm>();
    public static List<AddDispatcher> dispatcherList = new ArrayList<AddDispatcher>();

    public static List<Caller> callerList = new ArrayList<Caller>();
    public static List<Officers> officersList = new ArrayList<Officers>();
    public static List<OfficerAssignment> officerAssignmentList = new ArrayList<OfficerAssignment>();
    public static List<IncidentReport> incidentList = new ArrayList<IncidentReport>();

    public static Connection getConnection() throws Exception {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO Sample (ID) VALUES (?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "90020");

            preparedStatement.executeUpdate();

            System.out.println("Connected");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public static void RetrieveInformaiton() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Select ID FROM Sample";
            //PreparedStatement preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, "9000");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("ID");
                UserInfo sqlData = new UserInfo(id, "name  hoirt eijterjj ergwogren"
                        + "groeqr goijigrewij ogrewijgrw"
                        + "rgewigrew oiw egriweg jroiewjgo");
                users.add(sqlData);
                System.out.println("" + id);
            }
            conn.close();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void OfficerInformation() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql
                    = "SELECT Responder.Name AS NAME, Responder.Status AS STATUS, "
                    + "Responder.TypeofOfficer AS OfficerType, Responder.Position as Position,"
                    + " ResponderLocation.Location as Location,"
                    + " ResponderLocation.ResponderNumber as BadgeNumber, "
                    + "ResponderLocation.CarNumberID as carNumber"
                    + " From Responder Inner Join ResponderLocation "
                    + "on ResponderLocation.ResponderNumber = Responder.ResponderNumber\n";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("NAME");
                String status = rs.getString("STATUS");;
                String officerType = rs.getString("OfficerType");;
                String position = rs.getString("Position");;
                String location = rs.getString("Location");;
                int badgeNumber = rs.getInt("BadgeNumber");;
                int carNumber = rs.getInt("carNumber");;

                Officers officersInfo = new Officers(name, status,
                        officerType, position, location, badgeNumber, carNumber);
                officersList.add(officersInfo);
            }
            conn.close();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void OfficerAssigments() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Select Responder.Name AS NAME,"
                    + " Responder.ResponderNumber as BadgeNumber,"
                    + "ResponderAssignment.Assignment as Assignment,"
                    + "ResponderAssignment.Complete as Complete,"
                    + "ResponderAssignment.IncidentReportID as IncidentReportID, "
                    + " ResponderAssignment.AssignmentID as ID "
                    + "From Responder "
                    + "Inner Join ResponderAssignment"
                    + " On ResponderAssignment.ResponderNumber = Responder.ResponderNumber "
                    + " ORDER BY ResponderAssignment.Complete; ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("NAME");

                String assignment = rs.getString("Assignment");;

                int badgeNumber = rs.getInt("BadgeNumber");;
                int assignmentNumber = rs.getInt("ID");
                boolean complete = rs.getBoolean("Complete");
                int IncidentReportID = rs.getInt("IncidentReportID");

                OfficerAssignment officersInfo = new OfficerAssignment(name, badgeNumber, assignment,
                        assignmentNumber, complete, IncidentReportID);
                officerAssignmentList.add(officersInfo);
            }
            conn.close();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void callerInformaiton() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Select RecieveCallID, holdStatus, Name, Descritpion From RecieveCall;";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int callerId = rs.getInt("RecieveCallID");

                String name = rs.getString("Name");;

                String desc = rs.getString("Descritpion");;
                boolean hold = rs.getBoolean("holdStatus");;
                Caller callerInfo = new Caller(callerId, name, desc, hold);
                callerList.add(callerInfo);
            }
            conn.close();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void IncidentReportInfo() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql
                    = "Select IncidentReport.IncidentReportID as IncidentReportID,	"
                    + "IncidentReport.IncidentType  as IncidentType,"
                    + "IncidentReport.Name  as Name, "
                    + "IncidentReport.Location  as Location, "
                    + "IncidentReport.Description as Description, "
                    + "IncidentReport.PoliceCode as PoliceCode,"
                    + "Priority.PriorityType as PriorityType,"
                    + " Priority.PriorityTime as PriorityTime, "
                    + "RecieveCall.RecieveCallID as RecieveCallID"
                    + " From ReicieveCallIncidentReport "
                    + "Inner Join IncidentReport "
                    + "on IncidentReport.IncidentReportID = ReicieveCallIncidentReport.IncidentReportID "
                    + "Inner Join Priority "
                    + "on Priority.IncidentReportID = ReicieveCallIncidentReport.IncidentReportID "
                    + "Inner Join RecieveCall "
                    + "on RecieveCall.RecieveCallID = ReicieveCallIncidentReport.RecieveCallID"
                    + " ORDER BY Priority.PriorityType ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int incidentReport = rs.getInt("IncidentReportID");;
                String incidentType = rs.getString("IncidentType");
                String name = rs.getString("Name");
                String location = rs.getString("Location");
                ;
                String description = rs.getString("Description");
                int policeCode = rs.getInt("PoliceCode");;
                int priorityType = rs.getInt("PriorityType");;
                String time = rs.getString("PriorityTime");
                int recieveCallID = rs.getInt("RecieveCallID");

                IncidentReport officersInfo = new IncidentReport(incidentReport, incidentType, name, location,
                        description, policeCode, priorityType, time, recieveCallID
                );
                incidentList.add(officersInfo);
            }
            conn.close();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

      public static void DispatcherInfo() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Select DispatcherID, Name,Branch  From Operator;";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int dispatcherId = rs.getInt("DispatcherID");

                String name = rs.getString("Name");
                 String branch = rs.getString("Branch");

                AddDispatcher op = new AddDispatcher(dispatcherId, name, branch);
                dispatcherList.add(op);
            }
            conn.close();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
    
    
    
    public static void OperatorInfo() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Select operatorID, operatorName From Operator;";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int operatorId = rs.getInt("operatorID");

                String name = rs.getString("operatorName");

                Operator op = new Operator(operatorId, name);
                operatorList.add(op);
            }
            conn.close();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void AlarmInformation() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://us-cdbr-iron-east-01.cleardb.net:3306/heroku_c511b6e038c9438";
            String username = "b57fbaa3a5275d";
            String password = "fbe8c1ca";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "Select AlarmID, AlarmName, AlarmType, AlarmLocation From Alarm;";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int alarmID = rs.getInt("AlarmID");

                String name = rs.getString("AlarmName");;

                String desc = rs.getString("AlarmType");;
                String Location = rs.getString("AlarmLocation");;
                Alarm alarmInfo = new Alarm(alarmID, name, desc, Location);
                alarmList.add(alarmInfo);
            }
            conn.close();
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
