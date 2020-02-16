package dev.gs.gamequiz;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

import static dev.gs.gamequiz.game.textmoney;

public class Saved extends AppCompatActivity {
    private static SharedPreferences.Editor editor;
    private static SharedPreferences preferences;
    public Saved(){};
    public static void init(Context context) {
        if (preferences == null){
            preferences = context.getSharedPreferences(context.getPackageName(), Activity.MODE_PRIVATE);
            editor = preferences.edit();
        }
    }
    void save(){
        editor.putInt("money", game.countmoney);
        editor.putInt("prisei", Shop.pricei);
        editor.putInt("moneyplus", game.money);
        editor.putInt("pistol", Shop.pricei);
        editor.commit();
    }
    void load_save() {
        game.countmoney = preferences.getInt("money", 0);
        Shop.pricei = preferences.getInt("pricei", 200);
        game.money = preferences.getInt("moneyplus", 1);
        Shop.pricei = preferences.getInt("pistol", 200);
        textmoney.setText(game.countmoney + "");
    }
}
