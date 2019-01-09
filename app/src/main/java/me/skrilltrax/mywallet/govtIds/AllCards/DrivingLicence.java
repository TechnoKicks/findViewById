package me.skrilltrax.mywallet.govtIds.AllCards;

import android.media.Image;

public class DrivingLicence {

    Image Signature;
    String FatherName;
    String Address;
    Boolean AuthToDrive_M_CYL = false;
    Boolean AuthToDrive_LMV_NT = false;

    int DateOfIssue;
    int MonthOfIssue;
    int YearOfIssue;

    int ExpireDate;
    int ExpireMonth;
    int ExpireYear;



    public DrivingLicence() {
    }

    public Image getSignature() {
        return Signature;
    }

    public void setSignature(Image signature) {
        Signature = signature;
    }

    public String getFatherName() {
        return FatherName;
    }

    public String getAddress() {
        return Address;
    }

    public Boolean getAuthToDrive_M_CYL() {
        return AuthToDrive_M_CYL;
    }

    public Boolean getAuthToDrive_LMV_NT() {
        return AuthToDrive_LMV_NT;
    }

    public int getDateOfIssue() {
        return DateOfIssue;
    }

    public int getMonthOfIssue() {
        return MonthOfIssue;
    }

    public int getYearOfIssue() {
        return YearOfIssue;
    }

    public int getExpireDate() {
        return ExpireDate;
    }

    public int getExpireMonth() {
        return ExpireMonth;
    }

    public int getExpireYear() {
        return ExpireYear;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setAuthToDrive_M_CYL(Boolean authToDrive_M_CYL) {
        AuthToDrive_M_CYL = authToDrive_M_CYL;
    }

    public void setAuthToDrive_LMV_NT(Boolean authToDrive_LMV_NT) {
        AuthToDrive_LMV_NT = authToDrive_LMV_NT;
    }

    public void setDateOfIssue(int dateOfIssue) {
        DateOfIssue = dateOfIssue;
    }

    public void setMonthOfIssue(int monthOfIssue) {
        MonthOfIssue = monthOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        YearOfIssue = yearOfIssue;
    }

    public void setExpireDate(int expireDate) {
        ExpireDate = expireDate;
    }

    public void setExpireMonth(int expireMonth) {
        ExpireMonth = expireMonth;
    }

    public void setExpireYear(int expireYear) {
        ExpireYear = expireYear;
    }
}
