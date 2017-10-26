package com.example.hyup3.cougareatreservation.Model;

import java.util.ArrayList;

/**
 * Created by hyup3 on 10/12/2017.
 */

public class Cart {

    static ArrayList<String> shoppingList = new ArrayList<String>();
    static String shoppingItem;
    static ArrayList<String> result = new ArrayList<String>();

    public Cart() {
    }

    public static String getShoppingItem() {
        return shoppingItem;
    }

    public static void setShoppingItem(String shoppingItem) {
        Cart.shoppingItem = shoppingItem;
    }


    public static ArrayList<String> getShoppingList() {
        return shoppingList;
    }

    public static void setShoppingList(ArrayList<String> shoppingList) {
        Cart.shoppingList = shoppingList;
    }

    public static ArrayList<String> addShoppingList(String shoppingItem)
    {
        result.add(shoppingItem);
        return result;
    }
}
