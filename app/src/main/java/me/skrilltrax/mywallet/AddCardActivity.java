package me.skrilltrax.mywallet;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import me.skrilltrax.mywallet.creditdebitcard.LoyaltyCards;
import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class AddCardActivity extends AppCompatActivity {

    EditText companyName;
    EditText number;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        companyName = findViewById(R.id.edit_text);
        number = findViewById(R.id.edit_text2);

    }

    public void addData(View view) {
        List<IdentityCards> loyaltyCardList = new ArrayList<IdentityCards>();
        LoyaltyCards firstLoyaltyCard = new LoyaltyCards();
        firstLoyaltyCard.setName(companyName.getText().toString());
        firstLoyaltyCard.setCardNumber(number.getText().toString());
        loyaltyCardList = Utils.loadSharedPreferences(view.getContext(),"Loyalty Card");
        loyaltyCardList.add(firstLoyaltyCard);
        Utils.saveSharedPreferences(view.getContext(),loyaltyCardList, "Loyalty Card");
        finish();
    }

}
