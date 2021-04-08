package com.cognizant.project.claimmanagementsystem.PolicyMicroService.PolicyEntities;

public class Policy {
    private int policyid;
    private String policyname;
    private int hospitalid;
    private int premium;
    private int tenure;

    public Policy(int policyid, String policyname, int hospitalid, int premium, int tenure) {
        this.policyid = policyid;
        this.policyname = policyname;
        this.hospitalid = hospitalid;
        this.premium = premium;
        this.tenure = tenure;
    }

    public int getPolicyid() {
        return this.policyid;
    }

    public void setPolicyid(int policyid) {
        this.policyid = policyid;
    }

    public String getPolicyname() {
        return this.policyname;
    }

    public void setPolicyname(String policyname) {
        this.policyname = policyname;
    }

    public int getHospitalid() {
        return this.hospitalid;
    }

    public void setHospitalid(int hospitalid) {
        this.hospitalid = hospitalid;
    }

    public int getPremium() {
        return this.premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public int getTenure() {
        return this.tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return "{" +
            " policyid='" + getPolicyid() + "'" +
            ", policyname='" + getPolicyname() + "'" +
            ", hospitalid='" + getHospitalid() + "'" +
            ", premium='" + getPremium() + "'" +
            ", tenure='" + getTenure() + "'" +
            "}";
    }

}
