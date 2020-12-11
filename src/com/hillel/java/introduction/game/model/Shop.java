package com.hillel.java.introduction.game.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Item> itemList;

    public Shop() {
        itemList = new ArrayList<>();

        // here you define the items with their characteristics that should be present in the shop

        itemList.add(new Item(Characteristics.HEALTH_INCREASE, 100, 40));

    }

    public List<Item> getItemsAvailable() {
        return itemList;
    }
}
