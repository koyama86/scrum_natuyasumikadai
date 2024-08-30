package ticket;

import java.util.*;

/**
 *
 * 券売機
 *
 * ユーザーに対して券売機の機能を提供する。
 *
 */
public class TicketVendor {

    private List<Item> items;

    public TicketVendor(List<Item> items) {

        this.items = items;

    }

    public void showItems() {

        System.out.println("商品          金額");

        for (Item item : items) {

            System.out.println(item.getId() + "." + item.getName() + "     " + item.getPrice() + "円");

        }

    }

}