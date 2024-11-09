import java.util.ArrayList;

class Order {
    private String restaurantName;
    private String customerName;
    private String deliveryAddress;
    private ArrayList<OrderItem> orderItems;
    private String orderStatus;
    private double totalPrice;

    public Order(String restaurantName, String customerName, String deliveryAddress) {
        this.restaurantName = restaurantName;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.orderItems = new ArrayList<>();
        this.orderStatus = "Pending";
        this.totalPrice = 0.0;
    }

    public void addOrderItem(OrderItem item) {
        orderItems.add(item);
        totalPrice += item.getPrice() * item.getQuantity();
    }

    public void removeOrderItem(OrderItem item) {
        orderItems.remove(item);
        totalPrice -= item.getPrice() * item.getQuantity();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
