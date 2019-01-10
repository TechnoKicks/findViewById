package me.skrilltrax.mywallet.govtIds.AllCards;

import android.media.Image;

import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class PassPort extends IdentityCards {


    String CounrtyCode;
    String nationality;

    enum Gender{
        Male, Female, Diverse
    }
    Gender gender;

    String PlaceOFBirth;
    String PlaceOFIssue;
    int DateOfIssue;
    int MonthOfIssue;
    int YearOfIssue;

    int DateOfExpire;
    int MonthOfExpire;
    int YearOfExpire;
    Image signature;

    public PassPort() {
        type = "Passport";
    }

    public String getType() {
        return type;
    }

    public String getCounrtyCode() {
        return CounrtyCode;
    }

    public String getNationality() {
        return nationality;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPlaceOFBirth() {
        return PlaceOFBirth;
    }

    public String getPlaceOFIssue() {
        return PlaceOFIssue;
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

    public int getDateOfExpire() {
        return DateOfExpire;
    }

    public int getMonthOfExpire() {
        return MonthOfExpire;
    }

    public int getYearOfExpire() {
        return YearOfExpire;
    }

    public Image getSignature() {
        return signature;
    }

    public void setCounrtyCode(String counrtyCode) {
        CounrtyCode = counrtyCode;
    }


    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setPlaceOFBirth(String placeOFBirth) {
        PlaceOFBirth = placeOFBirth;
    }

    public void setPlaceOFIssue(String placeOFIssue) {
        PlaceOFIssue = placeOFIssue;
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

    public void setDateOfExpire(int dateOfExpire) {
        DateOfExpire = dateOfExpire;
    }

    public void setMonthOfExpire(int monthOfExpire) {
        MonthOfExpire = monthOfExpire;
    }

    public void setYearOfExpire(int yearOfExpire) {
        YearOfExpire = yearOfExpire;
    }

    public void setSignature(Image signature) {
        this.signature = signature;
    }
}
