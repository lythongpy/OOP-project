package controller;

import java.util.ArrayList;

class Customer extends User {
    ArrayList<Order> orderHistory;

    Customer(String userID, String password, String userName, String contactInfo) {
        super(userID, password, userName, contactInfo, "Customer");
        this.orderHistory = new ArrayList<>();
    }

    // Ordering functions
    boolean placeOrder(Order order) {
        System.out.println("Order placed successfully.");
        orderHistory.add(order);
        return true;
    }

    boolean cancelOrder(Order order) {
        System.out.println("Order canceled.");
        orderHistory.remove(order);
        return true;
    }

    boolean trackOrder() {
        System.out.println("Tracking order...");
        return true;
    }

    ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    // Overriding login/logout functions
    @Override
    void login() {
        System.out.println("Customer logged in.");
    }

    @Override
    void logout() {
        System.out.println("Customer logged out.");
    }
}


//To improve orderhistory attribute