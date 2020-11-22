package com.radhay.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.radhay.restaurent.MainActivity.b;
import static com.radhay.restaurent.MainActivity.bill;

public class Dishesh extends AppCompatActivity {
Button order;
Button ch;
Button bp;
Button dp;
Button sp;
Button si;

public static int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishesh);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        order=findViewById(R.id.order);
        ch = findViewById(R.id.ch);
        bp = findViewById(R.id.bp);
        dp = findViewById(R.id.dp);
        sp = findViewById(R.id.sp);
        si = findViewById(R.id.si);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill+=87;
                b=b+"     abc@14 "+"   Chow Mein   "+87+"/."+"\n";
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill+=110;
                b=b+"     abc@10  "+"  Braised Pork "+110+"/."+"\n";

            }
        });
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bill+=200;
                b=b+"     abc@11   "+"Dumplings  "+200+"/."+"\n";

            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill+=90;
                b=b+"    abc@12  "+" Shrimp  "+90+"/."+"\n";

            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill+=100;
                b=b+"     abc@13  "+"Sichuan Pork  "+100+"/."+"\n";

            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dishesh.this,payment.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Dishesh.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}