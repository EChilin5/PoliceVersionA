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
public class Alarm {
    private int AlarmID;
private String AlarmName;
private String AlarmType;
private String AlarmLocation;
    public Alarm(int alarmID, String alarmName, String alarmType, String alarmLocation) {
        AlarmID = alarmID;
        AlarmName = alarmName;
        AlarmType = alarmType;
        AlarmLocation = alarmLocation;
    }
    public int getAlarmID() {
        return AlarmID;
    }

    public void setAlarmID(int alarmID) {
        AlarmID = alarmID;
    }

    public String getAlarmName() {
        return AlarmName;
    }

    public void setAlarmName(String alarmName) {
        AlarmName = alarmName;
    }

    public String getAlarmType() {
        return AlarmType;
    }

    public void setAlarmType(String alarmType) {
        AlarmType = alarmType;
    }

    public String getAlarmLocation() {
        return AlarmLocation;
    }

    public void setAlarmLocation(String alarmLocation) {
        AlarmLocation = alarmLocation;
    }
}
