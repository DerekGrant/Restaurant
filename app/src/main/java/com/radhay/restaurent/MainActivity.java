package com.radhay.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ita;
    ImageView south;
    ImageView medi;
    ImageView north;
    ImageView chin;
    Button order;
    public static int bill;
    public static String b="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ita = findViewById(R.id.ita);
        chin = findViewById(R.id.chin);
        south = findViewById(R.id.south);
        north =findViewById(R.id.north);
        medi = findViewById(R.id.medi);
        order=findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,payment.class);
                startActivity(intent);
                finish();
            }
        });
        ita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,italian.class);
            startActivity(intent);
            finish();
            }
        });
        chin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Dishesh.class);
                startActivity(intent);
                finish();
            }
        });
        medi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,mediat.class);
                startActivity(intent);
                finish();
            }
        });
        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,north.class);
                startActivity(intent);
                finish();
            }
        });
        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,south.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}