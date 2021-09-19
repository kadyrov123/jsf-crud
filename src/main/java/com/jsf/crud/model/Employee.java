package com.jsf.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;
    private String homeAddress;
    private String email;
    private String bankDetails;
    private String position;
    private int orgId;

    public Employee() { }

    public Employee(String fullName, String homePhone, String mobilePhone, String workPhone, String homeAddress, String email, String bankDetails, String position) {
        this.fullName = fullName;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.homeAddress = homeAddress;
        this.email = email;
        this.bankDetails = bankDetails;
        this.position = position;
    }

    public Employee(Long id, String fullName, String homePhone, String mobilePhone, String workPhone, String homeAddress, String email, String bankDetails, String position, int orgId) {
        this.id = id;
        this.fullName = fullName;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.homeAddress = homeAddress;
        this.email = email;
        this.bankDetails = bankDetails;
        this.position = position;
        this.orgId = orgId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getOrgId() {return orgId;}

    public void setOrgId(int orgId) {this.orgId = orgId;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", workPhone='" + workPhone + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", email='" + email + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", position='" + position + '\'' +
                ", orgId=" + orgId +
                '}';
    }
}
