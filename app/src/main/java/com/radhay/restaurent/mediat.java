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
                count+=1;
                Toast.makeText(mediat.this,count+"th Item Selected",Toast.LENGTH_SHORT).show();
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 266;
                b=b+"     fds@10 " + "Feta" + 266 + "/." + "\n";
                count+=1;
                Toast.makeText(mediat.this,count+"th Item Selected",Toast.LENGTH_SHORT).show();
            }
        });
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bill += 350;
                b=b+"    fds@11 " + "L & Y" + 350 + "/." + "\n";
                count+=1;
                Toast.makeText(mediat.this,count+"th Item Selected",Toast.LENGTH_SHORT).show();

            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill +=400;
                b=b+"     fds@13 " + "Spanakopita " + 400 + "/." + "\n";
                count+=1;
                Toast.makeText(mediat.this,count+"th Item Selected",Toast.LENGTH_SHORT).show();
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bill += 430;
                b=b+"     fds@14 " + "Baba Ganoush " + 430 + "/." + "\n";
                count+=1;
                Toast.makeText(mediat.this,count+"th Item Selected",Toast.LENGTH_SHORT).show();
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