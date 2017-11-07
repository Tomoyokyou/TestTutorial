package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView display = (TextView)findViewById(R.id.display);
        Bundle bundle = getIntent().getExtras();
        display.setText(bundle.getString("Fahrenheit") + "F is " + bundle.getString("Celsius") + "C");
    }
}
