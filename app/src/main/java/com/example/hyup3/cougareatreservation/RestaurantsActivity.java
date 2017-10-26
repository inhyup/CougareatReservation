package com.example.hyup3.cougareatreservation;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.hyup3.cougareatreservation.FoodCouurt.AlohaPlateActivity;
import com.example.hyup3.cougareatreservation.FoodCouurt.ChickfilaActivity;
import com.example.hyup3.cougareatreservation.FoodCouurt.LTsoupsaladActivity;
import com.example.hyup3.cougareatreservation.FoodCouurt.PapajohnsActivity;
import com.example.hyup3.cougareatreservation.FoodCouurt.ScoreBoardActivity;
import com.example.hyup3.cougareatreservation.FoodCouurt.SubwayActivity;
import com.example.hyup3.cougareatreservation.FoodCouurt.TacoBellActivity;
import com.example.hyup3.cougareatreservation.Model.Money;

public class RestaurantsActivity extends AppCompatActivity {

    Money money = new Money(10.00);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        TextView moneyTextView = (TextView)findViewById(R.id.moneyTextView);
        moneyTextView.setText(money.toString());
        moneyTextView.setTextColor(Color.WHITE);

        ImageButton chickfilaButton = (ImageButton)findViewById(R.id.chickfilaButton);
        chickfilaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RestaurantsActivity.this, ChickfilaActivity.class);
                startActivity(myIntent);
            }
        });

        ImageButton papajohnsButton = (ImageButton)findViewById(R.id.papajohnsButton);
        papajohnsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RestaurantsActivity.this, PapajohnsActivity.class);
                startActivity(myIntent);
            }
        });

        ImageButton subwayButton = (ImageButton)findViewById(R.id.subwayButton);
        subwayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RestaurantsActivity.this, SubwayActivity.class);
                startActivity(myIntent);
            }
        });

        ImageButton tacobellButton = (ImageButton)findViewById(R.id.tacobellButton);
        tacobellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RestaurantsActivity.this, TacoBellActivity.class);
                startActivity(myIntent);
            }
        });

        ImageButton alohaplateButton = (ImageButton)findViewById(R.id.alohaplateButton);
        alohaplateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(RestaurantsActivity.this, AlohaPlateActivity.class);
                startActivity(myIntent);
            }
        });


    }
}
