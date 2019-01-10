package me.skrilltrax.mywallet.creditdebitcard;

import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class LoyaltyCards extends IdentityCards {

    public LoyaltyCards() {
        type = "Loyalty Card";
    }

    public String getType() {
        return type;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
