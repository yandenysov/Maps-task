package app.dataprovider;

import app.item.Item;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {

    public Map<Integer, Item> provideAllItemsData() {
        Map<Integer, Item> items = new HashMap<>();
        items.put(1, new Item ("Bread", "5", "1.99"));
        items.put(2, new Item ("Milk", "7", "3"));
        items.put(3, new Item ("Eggs", "20", "0.50"));
        items.put(4, new Item ("Soda", "3", "1.50"));
        return items;
    }

}
