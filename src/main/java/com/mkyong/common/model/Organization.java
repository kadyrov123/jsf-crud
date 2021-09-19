package com.mkyong.common.model;

import com.mkyong.common.model.Employee;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Organization implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String formOfOwnership;
   private String legalForm;
   private String name;
   private String directorFullName;
   private String fax;
   private String phoneNumber;
   private String webpage;
   private Long licenseNumber;
   private Date licenceReceiveDate;
   private Long certificateNumber;
   private Date certificateReceiveDate;
   private String address;
   private String files;

   @OneToMany
   private List<Employee> employees;

   public Organization() {}

   public Organization(String formOfOwnership, String legalForm, String name, String directorFullName, String fax, String phoneNumber, String webpage, Long licenseNumber, Date licenceReceiveDate, String address, String files, List<Employee> employees) {
      this.formOfOwnership = formOfOwnership;
      this.legalForm = legalForm;
      this.name = name;
      this.directorFullName = directorFullName;
      this.fax = fax;
      this.phoneNumber = phoneNumber;
      this.webpage = webpage;
      this.licenseNumber = licenseNumber;
      this.licenceReceiveDate = licenceReceiveDate;
      this.address = address;
      this.files = files;
      this.employees = employees;
   }

   public Organization(int id, String formOfOwnership, String legalForm, String name, String directorFullName, String fax, String phoneNumber, String webpage, Long licenseNumber, Date licenceReceiveDate, String address, String files, List<Employee> employees) {
      this.id = id;
      this.formOfOwnership = formOfOwnership;
      this.legalForm = legalForm;
      this.name = name;
      this.directorFullName = directorFullName;
      this.fax = fax;
      this.phoneNumber = phoneNumber;
      this.webpage = webpage;
      this.licenseNumber = licenseNumber;
      this.licenceReceiveDate = licenceReceiveDate;
      this.address = address;
      this.files = files;
      this.employees = employees;
   }

   public String getFormOfOwnership() {
      return formOfOwnership;
   }

   public void setFormOfOwnership(String formOfOwnership) {
      this.formOfOwnership = formOfOwnership;
   }

   public String getLegalForm() {
      return legalForm;
   }

   public void setLegalForm(String legalForm) {
      this.legalForm = legalForm;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDirectorFullName() {
      return directorFullName;
   }

   public void setDirectorFullName(String directorFullName) {
      this.directorFullName = directorFullName;
   }

   public String getFax() {
      return fax;
   }

   public void setFax(String fax) {
      this.fax = fax;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getWebpage() {
      return webpage;
   }

   public void setWebpage(String webpage) {
      this.webpage = webpage;
   }

   public Long getLicenseNumber() {
      return licenseNumber;
   }

   public void setLicenseNumber(Long licenseNumber) {
      this.licenseNumber = licenseNumber;
   }

   public Date getLicenceReceiveDate() {
      return licenceReceiveDate;
   }

   public void setLicenceReceiveDate(Date licenceReceiveDate) {
      this.licenceReceiveDate = licenceReceiveDate;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getFiles() {
      return files;
   }

   public void setFiles(String files) {
      this.files = files;
   }

   public List<Employee> getEmployees() {
      return employees;
   }

   public void setEmployees(List<Employee> employees) {
      this.employees = employees;
   }

   public int getId() {return id;}

   public void setId(int id) {this.id = id;}

   public Long getCertificateNumber() {
      return certificateNumber;
   }

   public void setCertificateNumber(Long certificateNumber) {
      this.certificateNumber = certificateNumber;
   }

   public Date getCertificateReceiveDate() {
      return certificateReceiveDate;
   }

   public void setCertificateReceiveDate(Date certificateReceiveDate) {
      this.certificateReceiveDate = certificateReceiveDate;
   }

   @Override
   public String toString() {
      return "Organization{" +
              "id=" + id +
              ", formOfOwnership='" + formOfOwnership + '\'' +
              ", legalForm='" + legalForm + '\'' +
              ", name='" + name + '\'' +
              ", directorFullName='" + directorFullName + '\'' +
              ", fax='" + fax + '\'' +
              ", phoneNumber='" + phoneNumber + '\'' +
              ", webpage='" + webpage + '\'' +
              ", licenseNumber=" + licenseNumber +
              ", licenceReceiveDate=" + licenceReceiveDate +
              ", certificateNumber=" + certificateNumber +
              ", certificateReceiveDate=" + certificateReceiveDate +
              ", address='" + address + '\'' +
              ", files='" + files + '\'' +
              '}';
   }
}
