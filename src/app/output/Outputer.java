package app.output;

import app.item.Item;

import java.util.Map;

public class Outputer {
    public void getAllItems(Map<Integer, Item> items) {
        int count = 0;
        for (Item item : items.values()) {
            count++;
            System.out.println(count + ") " + item);
        }
    }

    public void getItemByID(Map<Integer, Item> items, Integer id) {
        System.out.println(items.get(id));
    }
}
