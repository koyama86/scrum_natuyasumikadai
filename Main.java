package ticket;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<Item>();

        items.add(new Item(1, "特製ラーメン", 1000));

        items.add(new Item(2, "醤油ラーメン", 780));

        items.add(new Item(3, "しおラーメン", 880));

        items.add(new Item(4, "ごはん", 150));

        TicketVendor tv = new TicketVendor(items);

        tv.showItems();

        System.out.print("購入する商品番号(支払いに進む場合はc)>");

    }

}