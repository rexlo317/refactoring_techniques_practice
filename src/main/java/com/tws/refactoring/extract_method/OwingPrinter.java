package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {

    void printOwing(String name, List<Order> orders) {

        printBannaer();

        double outstanding = calculateOutstanding(orders);

        printDetails(name, outstanding);
    }

    void printBannaer(){
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }

    double calculateOutstanding(List<Order> orders){
        double outstanding = 0.0;
        Iterator<Order> elements = orders.iterator();
        while (elements.hasNext()) {
            Order each = elements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    void printDetails(String name, double outstanding){
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    private class Order {
        private final double amount;

        public Order(double amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }
}
