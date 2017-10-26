package com.example.hyup3.cougareatreservation.FoodCouurt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.hyup3.cougareatreservation.Chickfila.ChickenSandwichActivity;
import com.example.hyup3.cougareatreservation.Chickfila.DeluxeSandwichActivity;
import com.example.hyup3.cougareatreservation.Model.ChickFila;
import com.example.hyup3.cougareatreservation.R;

public class ChickfilaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chickfila);

        ChickFila chickFila = new ChickFila();


        ImageButton menuButton1 = (ImageButton)findViewById(R.id.menuButton1);
        menuButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ChickfilaActivity.this, ChickenSandwichActivity.class);
                startActivity(myIntent);
            }
        });
        TextView menuTextView1 = (TextView)findViewById(R.id.menuTextView1);
        menuTextView1.setText(chickFila.getMenuArray().get(0) + " " + chickFila.getPriceArray().get(0));



        ImageButton menuButton2 = (ImageButton)findViewById(R.id.menuButton2);
        menuButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ChickfilaActivity.this, DeluxeSandwichActivity.class);
                startActivity(myIntent);
            }
        });
        TextView menuTextView2 = (TextView)findViewById(R.id.menuTextView2);
        menuTextView2.setText(chickFila.getMenuArray().get(1) + " " + chickFila.getPriceArray().get(1));



        ImageButton menuButton3 = (ImageButton)findViewById(R.id.menuButton3);
        menuButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ChickfilaActivity.this, ChickenSandwichActivity.class);
                startActivity(myIntent);
            }
        });
        TextView menuTextView3 = (TextView)findViewById(R.id.menuTextView3);
        menuTextView3.setText(chickFila.getMenuArray().get(2) + " " + chickFila.getPriceArray().get(2));



        ImageButton menuButton4 = (ImageButton)findViewById(R.id.menuButton4);
        menuButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ChickfilaActivity.this, ChickenSandwichActivity.class);
                startActivity(myIntent);
            }
        });
        TextView menuTextView4 = (TextView)findViewById(R.id.menuTextView4);
        menuTextView4.setText(chickFila.getMenuArray().get(3) + " " + chickFila.getPriceArray().get(3));


        ImageButton menuButton5 = (ImageButton)findViewById(R.id.menuButton5);
        menuButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ChickfilaActivity.this, ChickenSandwichActivity.class);
                startActivity(myIntent);
            }
        });
        TextView menuTextView5 = (TextView)findViewById(R.id.menuTextView5);
        menuTextView5.setText(chickFila.getMenuArray().get(4) + " " + chickFila.getPriceArray().get(4));


        ImageButton menuButton6 = (ImageButton)findViewById(R.id.menuButton6);
        menuButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ChickfilaActivity.this, ChickenSandwichActivity.class);
                startActivity(myIntent);
            }
        });
        TextView menuTextView6 = (TextView)findViewById(R.id.menuTextView6);
        menuTextView6.setText(chickFila.getMenuArray().get(5) + " " + chickFila.getPriceArray().get(5));


        ImageButton menuButton7 = (ImageButton)findViewById(R.id.menuButton7);
        menuButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ChickfilaActivity.this, ChickenSandwichActivity.class);
                startActivity(myIntent);
            }
        });
        TextView menuTextView7 = (TextView)findViewById(R.id.menuTextView7);
        menuTextView7.setText(chickFila.getMenuArray().get(6) + " " + chickFila.getPriceArray().get(6));



    }
}
