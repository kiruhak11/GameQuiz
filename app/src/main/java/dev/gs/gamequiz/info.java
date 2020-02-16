package dev.gs.gamequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class info extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button back = (Button) findViewById(R.id.button2);
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view. getId()) {
            case R.id.button2:
                Intent intent = new Intent(info.this, MainActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(intent);
                break;
        }
    }
}
