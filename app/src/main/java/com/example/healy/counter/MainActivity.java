package com.example.healy.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counterVal = 0;

    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = (TextView)findViewById(R.id.counterTextView);
    }

    public void plusButtonClicked(View view) {
        counterVal ++;
        counterTextView.setText(String.valueOf(counterVal));
    }

    public void minusButtonClicked(View view) {
        counterVal --;
        counterTextView.setText(String.valueOf(counterVal));
    }
}
