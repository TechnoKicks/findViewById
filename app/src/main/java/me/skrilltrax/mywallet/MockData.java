package me.skrilltrax.mywallet;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import me.skrilltrax.mywallet.creditdebitcard.CDCards;
import me.skrilltrax.mywallet.creditdebitcard.LoyaltyCards;
import me.skrilltrax.mywallet.govtIds.AllCards.AadhaarCard;
import me.skrilltrax.mywallet.govtIds.AllCards.PanCard;
import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class MockData {

    MockData(Context context) {
        List<IdentityCards> IDlist= new ArrayList<IdentityCards>();
        AadhaarCard aadhaarCard = new AadhaarCard();
        aadhaarCard.setCardNumber("122314123123");
        aadhaarCard.setName("Aditya");
        aadhaarCard.setGender(AadhaarCard.Gender.Male);
        aadhaarCard.setDateOfBirth(29);
        aadhaarCard.setSurname("Wasan");
        aadhaarCard.setMonthOfBirth(10);
        aadhaarCard.setYearOfBirth(1999);

        IDlist.add(aadhaarCard);

        PanCard panCard = new PanCard();
        panCard.setCardNumber("234234798");
        panCard.setName("Aditya");
        panCard.setDateOfBirth(29);
        panCard.setSurname("Wasan");
        panCard.setMonthOfBirth(10);
        panCard.setYearOfBirth(1999);

        IDlist.add(panCard);

        List<IdentityCards> bankCardList = new ArrayList<IdentityCards>();

        CDCards cdCard = new CDCards();
        cdCard.setName("Aditya Wasan");
        cdCard.setCardNumber("122312421893127");
        cdCard.setCredit(true);
        cdCard.setCVVNumber(131);
        cdCard.setExpiringDate(12);
        cdCard.setExpiringYear(2020);

        CDCards dcCard = new CDCards();
        dcCard.setName("Aditya Wasan");
        dcCard.setCardNumber("23242432425325");
        dcCard.setCredit(false);
        dcCard.setCVVNumber(131);
        dcCard.setExpiringDate(12);
        dcCard.setExpiringYear(2020);

        bankCardList.add(cdCard);
        bankCardList.add(dcCard);

        List<IdentityCards> loyaltyCardList = new ArrayList<IdentityCards>();

        LoyaltyCards firstLoyaltyCard = new LoyaltyCards();
        firstLoyaltyCard.setName("Aditya Wasan");
        firstLoyaltyCard.setCardNumber("11288824293");

        LoyaltyCards secondLoyaltyCard = new LoyaltyCards();
        secondLoyaltyCard.setName("Aditya Wasan");
        secondLoyaltyCard.setCardNumber("43242937920");

        loyaltyCardList.add(firstLoyaltyCard);
        loyaltyCardList.add(secondLoyaltyCard);



        Utils.saveSharedPreferences(context,IDlist,"Passport");
        Utils.saveSharedPreferences(context,bankCardList,"Bank Card");
        Utils.saveSharedPreferences(context,loyaltyCardList,"Loyalty Card");
    }
}
