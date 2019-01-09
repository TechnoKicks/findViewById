package me.skrilltrax.mywallet.govtIds.AllCards;

import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class VoterID extends IdentityCards {
    String Address;
    int age;

    public VoterID() {
    }

    public String getAddress() {
        return Address;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
