package controller;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Restaurant extends User {
    private boolean restaurantStatus = false;
    private Queue<Order> ordersQueue;
    private ArrayList<MenuItem> menuItems;

    Restaurant(String userID, String password, String userName) {
        super(userID, password, userName, "Restaurant");
        this.ordersQueue = new LinkedList<>();
        this.menuItems = new ArrayList<>();
    }

    void addMenuItem(MenuItem item) {
        menuItems.add(item);
        System.out.println("Menu item added.");
    }

    void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
        System.out.println("Menu item removed.");
    }

    void manageOrders() {
        System.out.println("Managing orders...");
        // Add logic to process orders from the queue
    }

    // Overriding login/logout function
    @Override
    void login() {
        System.out.println("Restaurant logged in.");
    }

    @Override
    void logout() {
        System.out.println("Restaurant logged out.");
    }

    // Manage restaurant status
    boolean getRestaurantStatus() {
        return restaurantStatus;
    }

    protected void setRestaurantStatus(boolean status) {
        this.restaurantStatus = status;
    }

    public Queue<Order> getOrdersQueue() {
        return ordersQueue;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}


//Improvements on ordersQueue and addition of menuItems