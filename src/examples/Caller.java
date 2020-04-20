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
public class Caller {
    private int CallerID;
    private String name;
    private String description;
    private boolean holdStatus;

    public Caller(int callerID, String name, String description, boolean holdStatus) {
        CallerID = callerID;
        this.name = name;
        this.description = description;
        this.holdStatus = holdStatus;
    }
    public int getCallerID() {
        return CallerID;
    }

    public void setCallerID(int callerID) {
        CallerID = callerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHoldStatus() {
        return holdStatus;
    }

    public void setHoldStatus(boolean holdStatus) {
        this.holdStatus = holdStatus;
    }
}
