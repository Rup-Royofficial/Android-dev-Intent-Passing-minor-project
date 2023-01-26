package com.example.intentpassingminor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button loginnextButton = findViewById(R.id.loginnextActivity);
        loginnextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(nextActivity);
//                finish();  //if you give finish() then it will work as splash screen , initially seen then never again
            }
        });
    }
}