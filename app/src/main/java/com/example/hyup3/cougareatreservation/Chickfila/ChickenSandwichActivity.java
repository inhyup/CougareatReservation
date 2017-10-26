package com.example.hyup3.cougareatreservation.Chickfila;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hyup3.cougareatreservation.CartActivity;
import com.example.hyup3.cougareatreservation.Model.Cart;
import com.example.hyup3.cougareatreservation.Model.ChickFila;
import com.example.hyup3.cougareatreservation.Model.Money;
import com.example.hyup3.cougareatreservation.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChickenSandwichActivity extends AppCompatActivity {

    ChickFila chickFila = new ChickFila();
    Money money = new Money();
    Cart cart = new Cart();
    ArrayList<String> item = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_sandwich);

        TextView chickenSandwichNameText = (TextView)findViewById(R.id.chickenSandwichNameText);
        chickenSandwichNameText.setText(chickFila.getMenuArray().get(0));

        TextView chickenSandwichPriceText = (TextView)findViewById(R.id.chickenSandwichPriceText);
        chickenSandwichPriceText.setText("$ "+chickFila.getPriceArray().get(0));

        Button cartButton = (Button)findViewById(R.id.chickenSandwichCartButton);
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item = cart.addShoppingList(chickFila.getMenuArray().get(0) + " $"+  chickFila.getPriceArray().get(0));
                cart.setShoppingList(item);
                money.addMoney(chickFila.getPriceArray().get(0));
                Intent myIntent = new Intent(ChickenSandwichActivity.this, CartActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
