package com.cognizant.project.claimmanagementsystem.ClaimsMicroService.ClaimEntities;

public class ProviderPolicy {
    public int HospitalID;
    public String HospitalName;
    public String HospitalAddress;
    public int PolicyID;
    public String Location;

    public ProviderPolicy() {
    }

    public ProviderPolicy(int HospitalID, String HospitalName, String HospitalAddress, int PolicyID, String Location) {
        this.HospitalID = HospitalID;
        this.HospitalName = HospitalName;
        this.HospitalAddress = HospitalAddress;
        this.PolicyID = PolicyID;
        this.Location = Location;
    }

    public int getHospitalID() {
        return this.HospitalID;
    }

    public void setHospitalID(int HospitalID) {
        this.HospitalID = HospitalID;
    }

    public String getHospitalName() {
        return this.HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getHospitalAddress() {
        return this.HospitalAddress;
    }

    public void setHospitalAddress(String HospitalAddress) {
        this.HospitalAddress = HospitalAddress;
    }

    public int getPolicyID() {
        return this.PolicyID;
    }

    public void setPolicyID(int PolicyID) {
        this.PolicyID = PolicyID;
    }

    public String getLocation() {
        return this.Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public ProviderPolicy HospitalID(int HospitalID) {
        setHospitalID(HospitalID);
        return this;
    }

    public ProviderPolicy HospitalName(String HospitalName) {
        setHospitalName(HospitalName);
        return this;
    }

    public ProviderPolicy HospitalAddress(String HospitalAddress) {
        setHospitalAddress(HospitalAddress);
        return this;
    }

    public ProviderPolicy PolicyID(int PolicyID) {
        setPolicyID(PolicyID);
        return this;
    }

    public ProviderPolicy Location(String Location) {
        setLocation(Location);
        return this;
    }

  
    @Override
    public String toString() {
        return "{" +
            " HospitalID='" + getHospitalID() + "'" +
            ", HospitalName='" + getHospitalName() + "'" +
            ", HospitalAddress='" + getHospitalAddress() + "'" +
            ", PolicyID='" + getPolicyID() + "'" +
            ", Location='" + getLocation() + "'" +
            "}";
    }


}
