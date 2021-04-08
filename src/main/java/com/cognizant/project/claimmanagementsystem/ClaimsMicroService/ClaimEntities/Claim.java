package com.cognizant.project.claimmanagementsystem.ClaimsMicroService.ClaimEntities;

public class Claim {
    public int ClaimID;
    public String ClaimStatus;
    public String Remarks;
    public int PolicyID;
    public int HospitalID;
    public String BenefitsAvailed;
    public double AmountClaimed;
    public String Settled;


    public Claim() {
    }

    public Claim(int ClaimID, String ClaimStatus, String Remarks, int PolicyID, int HospitalID, String BenefitsAvailed, double AmountClaimed, String Settled) {
        this.ClaimID = ClaimID;
        this.ClaimStatus = ClaimStatus;
        this.Remarks = Remarks;
        this.PolicyID = PolicyID;
        this.HospitalID = HospitalID;
        this.BenefitsAvailed = BenefitsAvailed;
        this.AmountClaimed = AmountClaimed;
        this.Settled = Settled;
    }

    public int getClaimID() {
        return this.ClaimID;
    }

    public void setClaimID(int ClaimID) {
        this.ClaimID = ClaimID;
    }

    public String getClaimStatus() {
        return this.ClaimStatus;
    }

    public void setClaimStatus(String ClaimStatus) {
        this.ClaimStatus = ClaimStatus;
    }

    public String getRemarks() {
        return this.Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    public int getPolicyID() {
        return this.PolicyID;
    }

    public void setPolicyID(int PolicyID) {
        this.PolicyID = PolicyID;
    }

    public int getHospitalID() {
        return this.HospitalID;
    }

    public void setHospitalID(int HospitalID) {
        this.HospitalID = HospitalID;
    }

    public String getBenefitsAvailed() {
        return this.BenefitsAvailed;
    }

    public void setBenefitsAvailed(String BenefitsAvailed) {
        this.BenefitsAvailed = BenefitsAvailed;
    }

    public double getAmountClaimed() {
        return this.AmountClaimed;
    }

    public void setAmountClaimed(double AmountClaimed) {
        this.AmountClaimed = AmountClaimed;
    }

    public String getSettled() {
        return this.Settled;
    }

    public void setSettled(String Settled) {
        this.Settled = Settled;
    }

    public Claim ClaimID(int ClaimID) {
        setClaimID(ClaimID);
        return this;
    }

    public Claim ClaimStatus(String ClaimStatus) {
        setClaimStatus(ClaimStatus);
        return this;
    }

    public Claim Remarks(String Remarks) {
        setRemarks(Remarks);
        return this;
    }

    public Claim PolicyID(int PolicyID) {
        setPolicyID(PolicyID);
        return this;
    }

    public Claim HospitalID(int HospitalID) {
        setHospitalID(HospitalID);
        return this;
    }

    public Claim BenefitsAvailed(String BenefitsAvailed) {
        setBenefitsAvailed(BenefitsAvailed);
        return this;
    }

    public Claim AmountClaimed(double AmountClaimed) {
        setAmountClaimed(AmountClaimed);
        return this;
    }

    public Claim Settled(String Settled) {
        setSettled(Settled);
        return this;
    }

   
    @Override
    public String toString() {
        return "{" +
            " ClaimID='" + getClaimID() + "'" +
            ", ClaimStatus='" + getClaimStatus() + "'" +
            ", Remarks='" + getRemarks() + "'" +
            ", PolicyID='" + getPolicyID() + "'" +
            ", HospitalID='" + getHospitalID() + "'" +
            ", BenefitsAvailed='" + getBenefitsAvailed() + "'" +
            ", AmountClaimed='" + getAmountClaimed() + "'" +
            ", Settled='" + getSettled() + "'" +
            "}";
    }
   

}
