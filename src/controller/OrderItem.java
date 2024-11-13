package controller;

class OrderItem {
    private String itemName;
    private int quantity;
    private String customerNote;
    private double price; // Price of a single item

    public OrderItem(String itemName, int quantity, double price, String customerNote) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.customerNote = customerNote;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCustomerNote() {
        return customerNote;
    }
}
