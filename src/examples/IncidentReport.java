/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author edgarchilin
 */
public class IncidentReport {
    private int IncidentReport;
private String incidentType;
private String name;
private String Location;
private String Description;
private int PoliceCode;
private int PriorityType;
private String time;
    private int RecieveCallID;

    public IncidentReport(int incidentReport, String incidentType, String name, String location,
                    String description, int policeCode, int priorityType, String time, int recieveCallID) {
        IncidentReport = incidentReport;
        this.incidentType = incidentType;
        this.name = name;
        Location = location;
        Description = description;
        PoliceCode = policeCode;
        PriorityType = priorityType;
        this.time = time;
        RecieveCallID = recieveCallID;
    }

    public int getIncidentReport() {
        return IncidentReport;
    }

    public void setIncidentReport(int incidentReport) {
        IncidentReport = incidentReport;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPoliceCode() {
        return PoliceCode;
    }

    public void setPoliceCode(int policeCode) {
        PoliceCode = policeCode;
    }

    public int getPriorityType() {
        return PriorityType;
    }

    public void setPriorityType(int priorityType) {
        PriorityType = priorityType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getRecieveCallID() {
        return RecieveCallID;
    }

    public void setRecieveCallID(int recieveCallID) {
        RecieveCallID = recieveCallID;
    }

}
