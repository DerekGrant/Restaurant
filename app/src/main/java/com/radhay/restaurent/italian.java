package com.radhay.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.radhay.restaurent.MainActivity.b;
import static com.radhay.restaurent.MainActivity.bill;
import static com.radhay.restaurent.MainActivity.count;

public class italian extends AppCompatActivity {
    Button order;
    Button ch;
    Button bp;
    Button dp;
    Button sp;
    Button si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);
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
                System.out.println("enter");
                count+=1;
                b=b+"    cds@12 " + "Pasta Con E " + 50 + "/." + "\n";
                Toast.makeText(italian.this,count+"th Item Selected",Toast.LENGTH_SHORT).show();
                System.out.println("enter1");
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 70;
                count+=1;
                b=b+"     cds@10 " + "Pasta Carbonara " + 70 + "/." + "\n";
                Toast.makeText(italian.this,count+"th Item Selected",Toast.LENGTH_SHORT).show();
            }
        });
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count+=1;
                bill += 67;
                b=b+"     cds@11 " + "Capress Salad " + 67 + "/." + "\n";
                Toast.makeText(italian.this,count+"th Item Selected",Toast.LENGTH_SHORT).show();
            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 100;
                count+=1;
                b=b+"    cds@13  " + "   Panzenella " + 100 + "/." + "\n";
                Toast.makeText(italian.this,count+"th Item Selected",Toast.LENGTH_SHORT).show();
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 300;
                count+=1;
                b=b+"    cds@14 " + "Margherita " + 300 + "/." + "\n";
                Toast.makeText(italian.this,count+"th Item Selected",Toast.LENGTH_SHORT).show();
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(italian.this, payment.class);
                startActivity(intent);
                finish();
            }
        });
    }
        @Override
        public void onBackPressed () {
            Intent intent = new Intent(italian.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
