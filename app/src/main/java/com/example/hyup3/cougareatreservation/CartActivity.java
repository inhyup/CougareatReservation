package com.example.hyup3.cougareatreservation;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.hyup3.cougareatreservation.Model.Cart;
import com.example.hyup3.cougareatreservation.Model.Money;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static com.example.hyup3.cougareatreservation.R.id.totalPriceTextView;

public class CartActivity extends AppCompatActivity {

    Money money = new Money();
    Cart cart = new Cart();
    private ArrayList<String> listOfItem;
    private ListView shoppingListView;
    private ArrayAdapter<String> myAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        listOfItem = new ArrayList<>();
        listOfItem = cart.getShoppingList();


        myAdapter = new ArrayAdapter<>(this, R.layout.view_shoppinglist, listOfItem);
        shoppingListView = (ListView)findViewById(R.id.shoppingListView);

        shoppingListView.setAdapter(myAdapter);


        TextView totalPriceTextView = (TextView)findViewById(R.id.totalPriceTextView);
        totalPriceTextView.setText("Total: $ " + money.getTotal());

        Button reserveButton = (Button)findViewById(R.id.reserveButton);
        reserveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CartActivity.this, FinishActivity.class);
                startActivity(myIntent);
            }
        });




    }

}
