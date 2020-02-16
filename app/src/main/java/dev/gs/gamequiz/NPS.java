package dev.gs.gamequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NPS extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nps);

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setOnClickListener(this);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView2:
                Intent intent = new Intent(NPS.this, game.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(intent);
                break;

            case R.id.button2:
                Intent intent1 = new Intent(NPS.this, MainActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(intent1);
                break;
        }
    }
}
