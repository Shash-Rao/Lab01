package com.raoshashwat.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    Button decrementButton;
    TextView greetingDisplay;
    int count = 0;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.increment_button);
        greetingDisplay = findViewById(R.id.greeting_textview);
        incrementButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("incrementing " + ++count);
                Log.i("incrementing", count + "");
                greetingDisplay.setText(count + "");
                int col = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                incrementButton.setBackgroundTintList(ColorStateList.valueOf(col));
            }
        });
    }

    public void decrement(View view) {
        decrementButton = findViewById(R.id.decrement_button);
        System.out.println("incrementing " + --count);
        greetingDisplay.setText(count + "");
        int col = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        decrementButton.setBackgroundTintList(ColorStateList.valueOf(col));
    }
}