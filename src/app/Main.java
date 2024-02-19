package app;

import app.dataprovider.DataProvider;
import app.output.Outputer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        processRequest(getOption());
    }

    private static int getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose an option:
                1 - show all items available in the shop.
                2 - search for an item by its ID.
                """);
        return scanner.nextInt();
    }

    private static void processRequest(int option) {
        switch (option) {
            case 1 -> showAllItemsData();
            case 2 -> showDataByID();
            default -> System.out.println("Error when processing your request.");
        }
    }

    private static void showAllItemsData() {
        new Outputer().getAllItems(new DataProvider().provideAllItemsData());
    }

    private static void showDataByID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the ID of the item you would like to search for: ");
        Integer id = scanner.nextInt();
        new Outputer().getItemByID(new DataProvider().provideAllItemsData(), id);
    }
}
