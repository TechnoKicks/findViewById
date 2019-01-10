package me.skrilltrax.mywallet;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class Utils {

    public static final String PREFS_FILE_NAME = "MyPrefs";

    public static void saveSharedPreferences(Context context, List<IdentityCards> callLog, String cardType) {


        if(cardType.equals("Aadhaar Card") || cardType.equals("Voter ID") || cardType.equals("Driving Licence") || cardType.equals("Passport") || cardType.equals("Pan Card"))
            cardType = "ID Card";
        if(cardType.equals("Credit Card") || cardType.equals("Debit Card"))
            cardType = "Bank Card";
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(callLog);
        editor.putString(cardType, json);
        editor.apply();
    }

    public static List<IdentityCards> loadSharedPreferences(Context context, String cardType) {
        List<IdentityCards> cardList;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString(cardType, "");
        Type type = new TypeToken<List<IdentityCards>>() {}.getType();
        cardList = gson.fromJson(json, type);
        return cardList;
    }

}
