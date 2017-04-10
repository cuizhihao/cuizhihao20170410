package com.bwie.cuizhihao20170410;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private RoundProgressBar rpb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        rpb = (RoundProgressBar) findViewById(R.id.rpb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random mRandom = new Random();
                int r = mRandom.nextInt(255);
                int g = mRandom.nextInt(255);
                int b = mRandom.nextInt(255);
                int mRgb = Color.argb(255, r, g, b);
                rpb.setColor(mRgb);
            }
        });
    }
}
