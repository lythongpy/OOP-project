public class DeliveryStaff extends User {
    String assignedOrders;
    boolean availabilityStatus;

    DeliveryStaff(String userID, String password, String userName, String contactInfo, String role) {
        super(userID, password, userName, contactInfo, "DeliveryStaff");
    }

    boolean acceptOrder() {
        System.out.println("Order accepted by Delivery Staff.");
        return true;
    }

    boolean updateDeliveryStatus() {
        System.out.println("Order status updated by Delivery Staff.");
        return true;
    }
    boolean confirmDelivery() {
        System.out.println("Delivery confirmed by Delivery Staff.");
        return true;
    }

    // Overriding login/logout functions
    @Override
    void login() {
        System.out.println("Delivery Staff logged in.");
    }
    @Override
    void logout() {
        System.out.println("Delivery Staff logged out.");
    }

    // Manage Availability status
    public boolean getAvailabilityStatus() {
        return availabilityStatus;
    }
    public void setAvailabilityStatus() { this.availabilityStatus = !this.availabilityStatus; }
}
