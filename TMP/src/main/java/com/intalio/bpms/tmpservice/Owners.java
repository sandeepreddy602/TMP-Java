package com.intalio.bpms.tmpservice;

import java.util.List;

public class Owners {
    
    private List<String> _userOwners;
    private List<String> _roleOwners;
    
    public void setUserOwners(List<String> _userOwners) {
        this._userOwners = _userOwners;
    }
    
    public List<String> getUserOwners() {
        return _userOwners;
    }
    
    public void setRoleOwners(List<String> _roleOwners) {
        this._roleOwners = _roleOwners;
    }
    
    public List<String> getRoleOwners() {
        return _roleOwners;
    }
    
}
