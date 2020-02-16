package dev.gs.gamequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Shop extends AppCompatActivity {
    public static  TextView pistol;
    public static int pricei = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        pistol = (Button)findViewById(R.id.pistol);
        pistol.setText("Пистолет 9мм   =   "+ pricei +"");
        pistol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (game.countmoney >= pricei) {
                    game.money += 1;
                    game.countmoney -= pricei;
                    pricei+=200;
                    game.textmoney.setText(game.countmoney + "");
                    pistol.setText("Пистолет 9мм   =   "+ pricei +"");
                    new Saved().save();
                }
            }
        });
    }
}
