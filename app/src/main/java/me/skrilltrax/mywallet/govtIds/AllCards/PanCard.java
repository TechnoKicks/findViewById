package me.skrilltrax.mywallet.govtIds.AllCards;

import android.media.Image;

import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class PanCard extends IdentityCards {

    Image Signature;

    public PanCard() {
        type = "Pan Card";
    }

    public String getType() { return type;}

    public Image getSignature() {
        return Signature;
    }

    public void setSignature(Image signature) {
        Signature = signature;
    }

}
