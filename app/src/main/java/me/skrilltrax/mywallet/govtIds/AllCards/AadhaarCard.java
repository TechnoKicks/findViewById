package me.skrilltrax.mywallet.govtIds.AllCards;

import android.media.Image;

import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class AadhaarCard extends IdentityCards {

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public int getMonthOfBirth() {
        return super.getMonthOfBirth();
    }

    @Override
    public int getYearOfBirth() {
        return super.getYearOfBirth();
    }

    @Override
    public String getCardNumber() {
        return super.getCardNumber();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public Image getPhoto() {
        return super.getPhoto();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setDateOfBirth(int dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    @Override
    public void setMonthOfBirth(int monthOfBirth) {
        super.setMonthOfBirth(monthOfBirth);
    }

    @Override
    public void setYearOfBirth(int yearOfBirth) {
        super.setYearOfBirth(yearOfBirth);
    }

    @Override
    public void setCardNumber(String cardNumber) {
        super.setCardNumber(cardNumber);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public void setPhoto(Image photo) {
        super.setPhoto(photo);
    }

    public enum Gender{
        Male, Female, Diverse
    }
    Gender gender;


    public AadhaarCard() {

        type = "Aadhar Card";
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getType() { return type;}


}
