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
public class OtherAgency {

    private int AgencyBracnchID;
    private String AgencyBracnch;
    private int IncidentID;
    private int DispatcherId;
    private String Description;

    public OtherAgency(int agencyBracnchID, String agencyBracnch, int incidentID, int dispatcherId, String description) {
        AgencyBracnchID = agencyBracnchID;
        AgencyBracnch = agencyBracnch;
        IncidentID = incidentID;
        DispatcherId = dispatcherId;
        Description = description;
    }

    public int getAgencyBracnchID() {
        return AgencyBracnchID;
    }

    public void setAgencyBracnchID(int agencyBracnchID) {
        AgencyBracnchID = agencyBracnchID;
    }

    public String getAgencyBracnch() {
        return AgencyBracnch;
    }

    public void setAgencyBracnch(String agencyBracnch) {
        AgencyBracnch = agencyBracnch;
    }

    public int getIncidentID() {
        return IncidentID;
    }

    public void setIncidentID(int incidentID) {
        IncidentID = incidentID;
    }

    public int getDispatcherId() {
        return DispatcherId;
    }

    public void setDispatcherId(int dispatcherId) {
        DispatcherId = dispatcherId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
