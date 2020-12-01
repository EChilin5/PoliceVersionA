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
public class BusSchedule {

 private String tripNumber;
 private String mainLocation;
 private String destination;
 private String day;
 private String startTime;
 private String arrivalTime;
 private String driver;
 private String busID;

 public BusSchedule(String tripNumber, String mainLocation, String destination, String day, 
         String startTime, String arrivalTime, String driver, String busID) {
        this.tripNumber = tripNumber;
        this.mainLocation = mainLocation;
        this.destination = destination;
        this.day = day;
        this.startTime = startTime;
        this.arrivalTime = arrivalTime;
        this.driver = driver;
        this.busID = busID;
    } 
 
    public String getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public String getMainLocation() {
        return mainLocation;
    }

    public void setMainLocation(String mainLocation) {
        this.mainLocation = mainLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getBusID() {
        return busID;
    }
  
    public void setBusID(String busID) {
        this.busID = busID;
    }

   

   
}
