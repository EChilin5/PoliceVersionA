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
public class Officers {
    
      private String name;
    private String status;
    private String officerType;
    private String Position;
    private String Location;
    private int badgeNumber;
    private int carNumber;

    public Officers(String name, String status, String officerType, String position, String location, int badgeNumber, int carNumber) {
        this.name = name;
        this.status = status;
        this.officerType = officerType;
        Position = position;
        Location = location;
        this.badgeNumber = badgeNumber;
        this.carNumber = carNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOfficerType() {
        return officerType;
    }

    public void setOfficerType(String officerType) {
        this.officerType = officerType;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
}
