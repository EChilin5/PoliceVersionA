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
public class AddDispatcher {
     private int DispatcherID;
    private String Name;

    public AddDispatcher(int dispatcherID, String name, String branch) {
        DispatcherID = dispatcherID;
        Name = name;
        Branch = branch;
    }

    private String Branch;

    
    
    public int getDispatcherID() {
        return DispatcherID;
    }

    public void setDispatcherID(int dispatcherID) {
        DispatcherID = dispatcherID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }
    
}
