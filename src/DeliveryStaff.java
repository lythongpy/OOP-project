import java.util.ArrayList;

public class DeliveryStaff extends User {
    ArrayList<Order> assignedOrders;
    boolean availabilityStatus;

    DeliveryStaff(String userID, String password, String userName, String contactInfo) {
        super(userID, password, userName, contactInfo, "DeliveryStaff");
        this.assignedOrders = new ArrayList<>();
        this.availabilityStatus = true;
    }

    boolean acceptOrder(Order order) {
        System.out.println("Order accepted by Delivery Staff.");
        assignedOrders.add(order);
        return true;
    }

    boolean updateDeliveryStatus(Order order) {
        System.out.println("Order status updated by Delivery Staff.");
        return true;
    }

    boolean confirmDelivery(Order order) {
        System.out.println("Delivery confirmed by Delivery Staff.");
        assignedOrders.remove(order);
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

    public void setAvailabilityStatus(boolean status) {
        this.availabilityStatus = status;
    }
}


//Improvements on assignedOrders and availabilityStatus