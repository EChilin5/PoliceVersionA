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
public class StopSchedule {
    private String TripNumber;
    private String StopNumber;
    private String SequnceNumber;
    private String DrivingTime;

    public StopSchedule(String TripNumber, String StopNumber, String SequnceNumber, String DrivingTime) {
        this.TripNumber = TripNumber;
        this.StopNumber = StopNumber;
        this.SequnceNumber = SequnceNumber;
        this.DrivingTime = DrivingTime;
    }

    public String getTripNumber() {
        return TripNumber;
    }

    public void setTripNumber(String TripNumber) {
        this.TripNumber = TripNumber;
    }

    public String getStopNumber() {
        return StopNumber;
    }

    public void setStopNumber(String StopNumber) {
        this.StopNumber = StopNumber;
    }

    public String getSequnceNumber() {
        return SequnceNumber;
    }

    public void setSequnceNumber(String SequnceNumber) {
        this.SequnceNumber = SequnceNumber;
    }

    public String getDrivingTime() {
        return DrivingTime;
    }

    public void setDrivingTime(String DrivingTime) {
        this.DrivingTime = DrivingTime;
    }
    
}
