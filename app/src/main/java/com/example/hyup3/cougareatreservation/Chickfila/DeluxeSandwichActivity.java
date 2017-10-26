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

import java.util.ArrayList;

public class DeluxeSandwichActivity extends AppCompatActivity {
    ChickFila chickFila = new ChickFila();
    Money money = new Money();
    Cart cart = new Cart();
    ArrayList<String> item = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deluxe_sandwich);

        TextView deluxeSandwichNameText = (TextView)findViewById(R.id.deluxeSandwichNameText);
        deluxeSandwichNameText.setText(chickFila.getMenuArray().get(1));

        TextView deluxeSandwichPriceText = (TextView)findViewById(R.id.deluxeSandwichPriceText);
        deluxeSandwichPriceText.setText("$ "+chickFila.getPriceArray().get(1));

        Button cartButton = (Button)findViewById(R.id.deluxeSandwichCartButton);
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item = cart.addShoppingList(chickFila.getMenuArray().get(1));
                cart.setShoppingList(item);
                money.addMoney(chickFila.getPriceArray().get(1));
                Intent myIntent = new Intent(DeluxeSandwichActivity.this, CartActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
