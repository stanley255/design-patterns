package sk.me.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Programmer {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.forEach(Order::placeOrder);
        orderList.clear();
    }

}
