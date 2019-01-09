package me.skrilltrax.mywallet.govtIds;

import android.media.Image;
import android.widget.ImageView;

public class IdentityCards {

    String Name;
    String surname;
    int DateOfBirth;
    int MonthOfBirth;
    int YearOfBirth;
    long IDNumber;

    Image photo;


    public IdentityCards() {

    }

    public String getName() {
        return Name;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public int getMonthOfBirth() {
        return MonthOfBirth;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public long getIDNumber() {
        return IDNumber;
    }

    public String getSurname() {
        return surname;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        MonthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    public void setIDNumber(long IDNumber) {
        this.IDNumber = IDNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
}

