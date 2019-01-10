package me.skrilltrax.mywallet.govtIds;

import android.media.Image;

public class IdentityCards {

    public String Name;
    public String surname;
    public int DateOfBirth;
    public int MonthOfBirth;
    public int YearOfBirth;
    public String CardNumber;

    Image photo;

    public String type;

    public IdentityCards() {

    }

    public String getType() {
        return type;
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

    public String getCardNumber() {
        return CardNumber;
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

    public void setCardNumber(String cardNumber) {
        this.CardNumber = cardNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
}

