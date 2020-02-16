package dev.gs.gamequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class game extends AppCompatActivity {
    static public int countmoney = 0;
    static public int money = 1;
    Button kill;
    Button back;
    Button shops;
    Button attac;
    static public TextView textmoney;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        kill = (Button) findViewById(R.id.kill);
        textmoney = (TextView) findViewById(R.id.money);
        Saved.init(getApplicationContext());
        new Saved().load_save();
        kill();

        back = (Button) findViewById(R.id.button2);
        back();

        shops = (Button) findViewById(R.id.shops);
        shops();

        attac = (Button) findViewById(R.id.attac);
        attac();


    }

    void kill() {
        kill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countmoney += money;
                textmoney.setText(countmoney + "");
                new Saved().save();
            }
        });
    }

    void back() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button2:
                        Intent intent = new Intent(game.this, NPS.class);
                        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        startActivity(intent);
                        break;
                }

            }
        });
    }

    void shops() {
        shops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.shops:
                        Intent intent = new Intent(game.this, Shop.class);
                        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        startActivity(intent);
                        break;
                }

            }
        });




    }
    void save(){
        preferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("money", countmoney);
        editor.commit();
    }
    void load_save() {
        preferences = getPreferences(MODE_PRIVATE);
        countmoney = preferences.getInt("money", 0);
        textmoney.setText(countmoney + "");
    }
    void attac() {
        attac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.attac:
                        Intent intent = new Intent(game.this, attack.class);
                        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                        startActivity(intent);
                        break;


                }
            }
        });
    }
}

