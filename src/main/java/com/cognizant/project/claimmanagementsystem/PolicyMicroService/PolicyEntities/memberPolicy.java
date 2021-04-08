package com.cognizant.project.claimmanagementsystem.PolicyMicroService.PolicyEntities;

public class memberPolicy {
    private int policyid;
    private int memberid;
    private String membername;
    private String subscriptiondate;
    private int locationid;
    private String locationname;
    private int hospitalid;
    private String hospitalname;
    private int topupfrequency;

    public memberPolicy(int policyid, int memberid, String membername, String subscriptiondate, int locationid, String locationname, int hospitalid, String hospitalname, int topupfrequency) {
        this.policyid = policyid;
        this.memberid = memberid;
        this.membername = membername;
        this.subscriptiondate = subscriptiondate;
        this.locationid = locationid;
        this.locationname = locationname;
        this.hospitalid = hospitalid;
        this.hospitalname = hospitalname;
        this.topupfrequency = topupfrequency;
    }

    public int getPolicyid() {
        return this.policyid;
    }

    public void setPolicyid(int policyid) {
        this.policyid = policyid;
    }

    public int getMemberid() {
        return this.memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public String getMembername() {
        return this.membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getSubscriptiondate() {
        return this.subscriptiondate;
    }

    public void setSubscriptiondate(String subscriptiondate) {
        this.subscriptiondate = subscriptiondate;
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

    public int getTopupfrequency() {
        return this.topupfrequency;
    }

    public void setTopupfrequency(int topupfrequency) {
        this.topupfrequency = topupfrequency;
    }

    @Override
    public String toString() {
        return "{" +
            " policyid='" + getPolicyid() + "'" +
            ", memberid='" + getMemberid() + "'" +
            ", membername='" + getMembername() + "'" +
            ", subscriptiondate='" + getSubscriptiondate() + "'" +
            ", locationid='" + getLocationid() + "'" +
            ", locationname='" + getLocationname() + "'" +
            ", hospitalid='" + getHospitalid() + "'" +
            ", hospitalname='" + getHospitalname() + "'" +
            ", topupfrequency='" + getTopupfrequency() + "'" +
            "}";
    }

}
