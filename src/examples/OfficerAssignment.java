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

    public OfficerAssignment(String name, int badgeNumber, String assignment, int assignmentNumber) {
        this.name = name;
        BadgeNumber = badgeNumber;
        Assignment = assignment;
        AssignmentNumber = assignmentNumber;
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
}
