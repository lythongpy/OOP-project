class Restaurant extends User {
    private boolean restaurantStatus = false;
    private String ordersQueue;

    Restaurant(String userID, String password, String userName) {
        super(userID, password, userName, "Restaurant");
    }

    void addMenuItem() {
    }

    void removeMenuItem() {

    }

    void ManageOrders() {

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

    // // Manage restaurant status
    boolean getRestaurantStatus() {
        return restaurantStatus;
    }
    protected void setRestaurantStatus(String restaurantStatus) {
        this.restaurantStatus = !this.restaurantStatus;
    }
}
