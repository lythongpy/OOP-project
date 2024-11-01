public class DeliveryStaff extends User {
    public String assignedOrders;
    protected String availabilityStatus;

    public DeliveryStaff(String userID, String username, String password, String contactInfo, String assignedOrders, String availabilityStatus) {
        super(userID, username, password, contactInfo);
        this.assignedOrders = assignedOrders;
        this.availabilityStatus = availabilityStatus;
    }

    public boolean acceptOrder() {
        System.out.println("Order accepted by Delivery Staff.");
        return true;
    }

    public boolean updateOrderStatus() {
        System.out.println("Order status updated by Delivery Staff.");
        return true;
    }

    public boolean confirmDelivery() {
        System.out.println("Delivery confirmed by Delivery Staff.");
        return true;
    }

    @Override
    public boolean login() {
        System.out.println("Delivery Staff logged in.");
        return true;
    }

    @Override
    public boolean logout() {
        System.out.println("Delivery Staff logged out.");
        return true;
    }

    @Override
    public boolean updateProfile() {
        System.out.println("Delivery Staff profile updated.");
        return true;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
