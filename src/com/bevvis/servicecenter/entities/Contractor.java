package com.bevvis.servicecenter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.LinkedHashSet;


@Entity
public class Contractor {


    @Id
    @GeneratedValue
    private int id;
    @Column(name = "contractorPhoneNumber")
    private String phoneNumber;
    private String address;
    private int age;
    @Column(name = "contractorName")
    private String name;
    @Column(name = "contractorSurname")
    private String surname;
    private String shortName;
    private String fullName;
    private String fiscalCode;
    private String VAT;
    private String bankName;
    private String bankAccount;
    private boolean isCompany;


    public void addContractor() {
    }

    public boolean removeContractor() {
        return false;
    }

    public Contractor findContractorById() {
        return null;
    }

    public LinkedHashSet<Contractor> findAllContractors() {
        return null;
    }

    public boolean updateContractorDetails() {
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getVAT() {
        return VAT;
    }

    public void setVAT(String VAT) {
        this.VAT = VAT;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean isCompany() {
        return isCompany;
    }

    public void setCompany(boolean company) {
        isCompany = company;
    }
}
