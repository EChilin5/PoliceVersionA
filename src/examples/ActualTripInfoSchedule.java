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
public class ActualTripInfoSchedule {
    private String TripNumber;
    private String Date;
    private String ScheduledStartTime;
    private String StopNumber;
    private String SchedulledArrivalTime;
    private String ActualStartTime;
    private String NumberofPassengersIn;
    private String NumberofPassengersOut;

    public ActualTripInfoSchedule(String TripNumber, String Date, String ScheduledStartTime, 
            String StopNumber, String SchedulledArrivalTime, String ActualStartTime, String NumberofPassengersIn, String NumberofPassengersOut) {
        this.TripNumber = TripNumber;
        this.Date = Date;
        this.ScheduledStartTime = ScheduledStartTime;
        this.StopNumber = StopNumber;
        this.SchedulledArrivalTime = SchedulledArrivalTime;
        this.ActualStartTime = ActualStartTime;
        this.NumberofPassengersIn = NumberofPassengersIn;
        this.NumberofPassengersOut = NumberofPassengersOut;
    }

    public String getTripNumber() {
        return TripNumber;
    }

    public void setTripNumber(String TripNumber) {
        this.TripNumber = TripNumber;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getScheduledStartTime() {
        return ScheduledStartTime;
    }

    public void setScheduledStartTime(String ScheduledStartTime) {
        this.ScheduledStartTime = ScheduledStartTime;
    }

    public String getStopNumber() {
        return StopNumber;
    }

    public void setStopNumber(String StopNumber) {
        this.StopNumber = StopNumber;
    }

    public String getSchedulledArrivalTime() {
        return SchedulledArrivalTime;
    }

    public void setSchedulledArrivalTime(String SchedulledArrivalTime) {
        this.SchedulledArrivalTime = SchedulledArrivalTime;
    }

    public String getActualStartTime() {
        return ActualStartTime;
    }

    public void setActualStartTime(String ActualStartTime) {
        this.ActualStartTime = ActualStartTime;
    }

    public String getNumberofPassengersIn() {
        return NumberofPassengersIn;
    }

    public void setNumberofPassengersIn(String NumberofPassengersIn) {
        this.NumberofPassengersIn = NumberofPassengersIn;
    }

    public String getNumberofPassengersOut() {
        return NumberofPassengersOut;
    }

    public void setNumberofPassengersOut(String NumberofPassengersOut) {
        this.NumberofPassengersOut = NumberofPassengersOut;
    }
}
