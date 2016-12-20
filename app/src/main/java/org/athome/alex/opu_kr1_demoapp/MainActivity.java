package org.athome.alex.opu_kr1_demoapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = (TextView) findViewById(R.id.tv);
                tv.setText("Clicked!");
                tv.setTextSize(26);
                tv.setTextColor(Color.BLUE);
                LinearLayout ll = (LinearLayout) findViewById(R.id.activity_main);
                ll.setBackgroundColor(Color.CYAN);
            }
        });
    }
}
