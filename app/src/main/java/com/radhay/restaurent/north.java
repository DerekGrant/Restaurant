package com.radhay.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.UserHandle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.radhay.restaurent.MainActivity.b;
import static com.radhay.restaurent.MainActivity.bill;

public class north extends AppCompatActivity {
Button order;
Button ch;
Button bp;
Button dp;
Button sp;
Button si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north);
        order = findViewById(R.id.order);
        ch = findViewById(R.id.ch);
        bp = findViewById(R.id.bp);

        dp = findViewById(R.id.dp);
        sp = findViewById(R.id.sp);
        si = findViewById(R.id.si);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 50;
                b=b+"     nds@12 " + "Aloo Samosa " + 50 + "/." + "\n";
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 70;
                b=b+"     nds@10 " + "N I T " + 70 + "/." + "\n";

            }
        });
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bill += 88;
                b=b+"     nds@11 " + "Mlai K K" + 88 + "/." + "\n";

            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 150;
                b=b+"      nds@13 " + "Rogan Josh " + 150 + "/." + "\n";

            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 40;
                b=b+"      nds@14 " + "Chole Bhutere " + 40 + "/." + "\n";

            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(north.this, payment.class);
                startActivity(intent);
                finish();
            }
        });
     }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(north.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}