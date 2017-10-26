package com.example.hyup3.cougareatreservation.Model;

import android.widget.ImageView;

import com.example.hyup3.cougareatreservation.R;

import java.util.ArrayList;

/**
 * Created by hyup3 on 10/19/2017.
 */

public class ChickFila {

    public ArrayList<Integer> imageArray = new ArrayList<>();
    public ArrayList<String> menuArray = new ArrayList<String>();
    public ArrayList<Double> priceArray = new ArrayList<Double>();

    public ChickFila() {
        imageArray.add(R.drawable.chicken_sandwich);
        menuArray.add("Chicken Sandwich");
        priceArray.add(2.99);

        imageArray.add(R.drawable.deluxe_sandwich);
        menuArray.add("Delux Sandwich");
        priceArray.add(3.99);

        imageArray.add(R.drawable.spicy_sandwich);
        menuArray.add("Spicy Sandwich");
        priceArray.add(3.99);

        imageArray.add(R.drawable.spicy_deluxe_sandwich);
        menuArray.add("Spicy Deluxe Sandwich");
        priceArray.add(4.99);

        imageArray.add(R.drawable.grilled_chicken_sandwich);
        menuArray.add("Grilled Chicken Sandwich");
        priceArray.add(4.99);

        imageArray.add(R.drawable.grilled_chicken_club_sandwich);
        menuArray.add("Grilled Chicken Club Sandwich");
        priceArray.add(5.99);

        imageArray.add(R.drawable.grilled_chicken_cool_wrap);
        menuArray.add("Grilled Chicken Cool Wrap");
        priceArray.add(4.99);
    }

    public ArrayList<String> getMenuArray() {
        return menuArray;
    }

    public void setMenuArray(ArrayList<String> menuArray) {
        this.menuArray = menuArray;
    }

    public ArrayList<Double> getPriceArray() {
        return priceArray;
    }

    public void setPriceArray(ArrayList<Double> priceArray) {
        this.priceArray = priceArray;
    }

    public ArrayList<Integer> getImageArray() {
        return imageArray;
    }

    public void setImageArray(ArrayList<Integer> imageArray) {
        this.imageArray = imageArray;
    }
}
