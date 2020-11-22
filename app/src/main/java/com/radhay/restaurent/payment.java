package com.radhay.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.radhay.restaurent.MainActivity.b;
import static com.radhay.restaurent.MainActivity.bill;

public class payment extends AppCompatActivity {
TextView b1,t1;
Button tn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        b1 = findViewById(R.id.b);
        t1 = findViewById(R.id.t1);
        tn = findViewById(R.id.tn);
        System.out.println("enter payment");
        System.out.print(b);
        t1.setText("Total Bill     "+bill);
        b1.setText(b);
        tn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText("       Thank You     ");
                t1.setText("");
            }
        });
    }
}