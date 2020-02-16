package dev.gs.gamequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.newgame);
        button.setOnClickListener(this);

        Button button1 = (Button) findViewById(R.id.info1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.exit);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {

            case R.id.newgame:
                Intent intent = new Intent(MainActivity.this, NPS.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(intent);
                break;

            case R.id.info1:
                Intent intent1 = new Intent(MainActivity.this, info.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(intent1);
                break;

            case R.id.exit:
                    Intent startMain = new Intent(Intent.ACTION_MAIN);
                    startMain.addCategory(Intent.CATEGORY_HOME);
                    startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(startMain);
                    break;

        }
    }
}
