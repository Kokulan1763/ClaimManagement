package com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberEntities;

public class MemberClaim {
    private int memberid;
    private int claimid;
    private int billedamount;
    private int claimedamount;
    private int benefirid;
    private String claimstatus;

    public MemberClaim(int memberid, int claimid, int billedamount, int claimedamount, int benefirid, String claimstatus) {
        this.memberid = memberid;
        this.claimid = claimid;
        this.billedamount = billedamount;
        this.claimedamount = claimedamount;
        this.benefirid = benefirid;
        this.claimstatus = claimstatus;
    }

    public int getMemberid() {
        return this.memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public int getClaimid() {
        return this.claimid;
    }

    public void setClaimid(int claimid) {
        this.claimid = claimid;
    }

    public int getBilledamount() {
        return this.billedamount;
    }

    public void setBilledamount(int billedamount) {
        this.billedamount = billedamount;
    }

    public int getClaimedamount() {
        return this.claimedamount;
    }

    public void setClaimedamount(int claimedamount) {
        this.claimedamount = claimedamount;
    }

    public int getBenefirid() {
        return this.benefirid;
    }

    public void setBenefirid(int benefirid) {
        this.benefirid = benefirid;
    }

    public String getClaimstatus() {
        return this.claimstatus;
    }

    public void setClaimstatus(String claimstatus) {
        this.claimstatus = claimstatus;
    }

    @Override
    public String toString() {
        return "{" +
            " memberid='" + getMemberid() + "'" +
            ", claimid='" + getClaimid() + "'" +
            ", billedamount='" + getBilledamount() + "'" +
            ", claimedamount='" + getClaimedamount() + "'" +
            ", benefirid='" + getBenefirid() + "'" +
            ", claimstatus='" + getClaimstatus() + "'" +
            "}";
    }

}
