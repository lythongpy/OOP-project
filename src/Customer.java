public class Customer extends User {
    public String orderHistory;
    private String paymentMethod;

    public Customer(String userID, String username, String password, String contactInfo, String orderHistory, String paymentMethod) {
        super(userID, username, password, contactInfo);
        this.orderHistory = orderHistory;
        this.paymentMethod = paymentMethod;
    }

    public boolean placeOrder() {
        System.out.println("Order placed successfully.");
        return true;
    }

    public boolean trackOrder() {
        System.out.println("Tracking order...");
        return true;
    }

    public boolean cancelOrder() {
        System.out.println("Order canceled.");
        return true;
    }

    @Override
    public boolean login() {
        System.out.println("Customer logged in.");
        return true;
    }

    @Override
    public boolean logout() {
        System.out.println("Customer logged out.");
        return true;
    }

    @Override
    public boolean updateProfile() {
        System.out.println("Customer profile updated.");
        return true;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
