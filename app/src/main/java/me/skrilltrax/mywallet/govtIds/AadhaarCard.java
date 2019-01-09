package me.skrilltrax.mywallet.govtIds;

public class AadhaarCard extends IdentityCards{

    enum Gender{
        Male, Female, Diverse
    }
    Gender gender;


    public AadhaarCard() {

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
