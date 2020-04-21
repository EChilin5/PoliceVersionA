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
public class OfficerAssignment {
      private String name;
    private int BadgeNumber;
    private String Assignment;
    private boolean Complete; 
    private int IncidentReportID;

    public OfficerAssignment(String name, int badgeNumber, String assignment, int assignmentNumber, 
            boolean Complete, int IncidentReportID) {
        this.name = name;
        BadgeNumber = badgeNumber;
        Assignment = assignment;
        AssignmentNumber = assignmentNumber;
        this.Complete = Complete;
        this.IncidentReportID = IncidentReportID;
    }

    private int AssignmentNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadgeNumber() {
        return BadgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        BadgeNumber = badgeNumber;
    }

    public String getAssignment() {
        return Assignment;
    }

    public void setAssignment(String assignment) {
        Assignment = assignment;
    }

    public int getAssignmentNumber() {
        return AssignmentNumber;
    }

    public void setAssignmentNumber(int assignmentNumber) {
        AssignmentNumber = assignmentNumber;
    }
    
     public boolean getComplete() {
        return Complete;
    }

    public void isComplete(boolean complete) {
        Complete = complete;
    }
    
     public int getIncidentReportID() {
        return IncidentReportID;
    }

    public void setIncidentReportID(int incidentReportID) {
        IncidentReportID = incidentReportID;
    }
}
