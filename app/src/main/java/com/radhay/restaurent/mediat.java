package com.radhay.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.radhay.restaurent.MainActivity.b;
import static com.radhay.restaurent.MainActivity.bill;

public class mediat extends AppCompatActivity {
Button order;
Button ch;
Button bp;
Button dp;
Button sp;
Button si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediat);
        order = findViewById(R.id.order);
        ch = findViewById(R.id.ch);
        bp = findViewById(R.id.bp);

        dp = findViewById(R.id.dp);
        sp = findViewById(R.id.sp);
        si = findViewById(R.id.si);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 440;
                b=b+"    fds@12 " + "Pizza " +440 + "/." + "\n";
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 266;
                b=b+"     fds@10 " + "Feta" + 266 + "/." + "\n";

            }
        });
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bill += 350;
                b=b+"    fds@11 " + "L & Y" + 350 + "/." + "\n";

            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill +=400;
                b=b+"     fds@13 " + "Spanakopita " + 400 + "/." + "\n";

            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 430;
                b=b+"     fds@14 " + "Baba Ganoush " + 430 + "/." + "\n";

            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mediat.this, payment.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(mediat.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}