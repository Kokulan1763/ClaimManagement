package com.cognizant.project.claimmanagementsystem.PolicyMicroService.PolicyEntities;

public class providerpolicy {
    private int locationid;
    private String locationname;
    private int hospitalid;
    private String hospitalname;
    private int ambulancecharges;
    private int operationcharges;
    private int medicalcharges;
    private int stayingcharges;

    public providerpolicy(int locationid, String locationname, int hospitalid, String hospitalname, int ambulancecharges, int operationcharges, int medicalcharges, int stayingcharges) {
        this.locationid = locationid;
        this.locationname = locationname;
        this.hospitalid = hospitalid;
        this.hospitalname = hospitalname;
        this.ambulancecharges = ambulancecharges;
        this.operationcharges = operationcharges;
        this.medicalcharges = medicalcharges;
        this.stayingcharges = stayingcharges;
    }

    public int getLocationid() {
        return this.locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }

    public String getLocationname() {
        return this.locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public int getHospitalid() {
        return this.hospitalid;
    }

    public void setHospitalid(int hospitalid) {
        this.hospitalid = hospitalid;
    }

    public String getHospitalname() {
        return this.hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public int getAmbulancecharges() {
        return this.ambulancecharges;
    }

    public void setAmbulancecharges(int ambulancecharges) {
        this.ambulancecharges = ambulancecharges;
    }

    public int getOperationcharges() {
        return this.operationcharges;
    }

    public void setOperationcharges(int operationcharges) {
        this.operationcharges = operationcharges;
    }

    public int getMedicalcharges() {
        return this.medicalcharges;
    }

    public void setMedicalcharges(int medicalcharges) {
        this.medicalcharges = medicalcharges;
    }

    public int getStayingcharges() {
        return this.stayingcharges;
    }

    public void setStayingcharges(int stayingcharges) {
        this.stayingcharges = stayingcharges;
    }

    @Override
    public String toString() {
        return "{" +
            " locationid='" + getLocationid() + "'" +
            ", locationname='" + getLocationname() + "'" +
            ", hospitalid='" + getHospitalid() + "'" +
            ", hospitalname='" + getHospitalname() + "'" +
            ", ambulancecharges='" + getAmbulancecharges() + "'" +
            ", operationcharges='" + getOperationcharges() + "'" +
            ", medicalcharges='" + getMedicalcharges() + "'" +
            ", stayingcharges='" + getStayingcharges() + "'" +
            "}";
    }
    
}
