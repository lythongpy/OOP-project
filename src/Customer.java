class Customer extends User {
    String orderHistory;

    Customer(String userID, String password, String userName, String contactInfo) {
        super(userID, password, userName, contactInfo, "Customer");
    }

    // Ordering functions
    boolean placeOrder() {
        System.out.println("Order placed successfully.");
        return true;
    }
    boolean cancelOrder() {
        System.out.println("Order canceled.");
        return true;
    }

    boolean trackOrder() {
        System.out.println("Tracking order...");
        return true;
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

