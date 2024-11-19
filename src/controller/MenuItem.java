package controller;

class MenuItem {
    private String name;
    private String description;
    private double price;

    public MenuItem(String name, String description, double price, String image) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

}
