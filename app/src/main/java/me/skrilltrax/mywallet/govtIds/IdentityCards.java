package me.skrilltrax.mywallet.govtIds;

import android.media.Image;
import android.widget.ImageView;

public class IdentityCards {

    String Name;
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
}
