package com.cognizant.project.claimmanagementsystem.MemberMicroService.MemberEntities;

public class Member {
   private int memberid;
   private String membername;
   private String phonenumber;
   private int salary;
   private String gender; 


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

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{" +
            " memberid='" + getMemberid() + "'" +
            ", membername='" + getMembername() + "'" +
            ", phonenumber='" + getPhonenumber() + "'" +
            ", salary='" + getSalary() + "'" +
            ", gender='" + getGender() + "'" +
            "}";
    }



}
