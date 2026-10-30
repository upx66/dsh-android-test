package com.example.hello;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        box.setGravity(Gravity.CENTER);
        box.setBackgroundColor(Color.WHITE);

        final TextView tv = new TextView(this);
        tv.setText("Hello，这是云端编出来的 APK");
        tv.setTextSize(22);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);

        Button btn = new Button(this);
        btn.setText("点我");
        btn.setOnClickListener(v -> tv.setText("点了 " + (++count) + " 次"));

        box.addView(tv);
        box.addView(btn);
        setContentView(box);
    }
}
