package com.radhay.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.radhay.restaurent.MainActivity.b;
import static com.radhay.restaurent.MainActivity.bill;

public class south extends AppCompatActivity {
Button order;
Button ch;
Button bp;
Button dp;
Button sp;
Button si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south);
        order = findViewById(R.id.order);
        ch = findViewById(R.id.ch);
        bp = findViewById(R.id.bp);

        dp = findViewById(R.id.dp);
        sp = findViewById(R.id.sp);
        si = findViewById(R.id.si);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("enter");
                bill += 150;
                System.out.println("ok");
                b=b+"      sds@12 " + "S I Thali " + 150 + "/." + "\n";
                System.out.println("then");
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 90;
                b=b+"     sds@10 " + "Vada " + 90 + "/." + "\n";

            }
        });
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bill += 60;
                b=b+"      sds@11 " + "Biryani " + 60 + "/." + "\n";

            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 200;
                b=b+"      sds@13 " + "Idli " + 200 + "/." + "\n";

            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 70;
                b=b+"     sds@14  " + "Dosa " + 70 + "/." + "\n";

            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(south.this, payment.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(south.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}