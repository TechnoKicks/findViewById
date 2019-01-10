package me.skrilltrax.mywallet.creditdebitcard;

import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class CDCards extends IdentityCards {

    Boolean isCredit;
    int ExpiringDate;
    int ExpiringYear;
    int CVVNumber;

    public CDCards() {
        type = "Bank card";
    }


    public String getCardNumber() {
        return CardNumber;
    }

    public String getName() {
        return Name;
    }

    public int getExpiringDate() {
        return ExpiringDate;
    }

    public int getCVVNumber() {
        return CVVNumber;
    }

    public int getExpiringYear() {
        return ExpiringYear;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public Boolean getCredit() {
        return isCredit;
    }

    public void setCredit(Boolean credit) {
        isCredit = credit;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setExpiringYear(int expiringYear) {
        ExpiringYear = expiringYear;
    }

    public void setCVVNumber(int CVVNumber) {
        this.CVVNumber = CVVNumber;
    }

    public void setExpiringDate(int expiringDate) {
        ExpiringDate = expiringDate;
    }

    @Override
    public String getType() {
        if (getCredit())
            type = "Credit Card";
        else
            type = "Debit Card";
        return type;
    }
}
