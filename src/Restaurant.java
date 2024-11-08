public class Restaurant extends User {
    public String menu;
    private String restaurantStatus;
    protected String ordersQueue;

    public Restaurant(String userID, String username, String password, String menu, String restaurantStatus, String ordersQueue) {
        super(userID, username, password);
        this.menu = menu;
        this.restaurantStatus = restaurantStatus;
        this.ordersQueue = ordersQueue;
    }

    public boolean updateMenu() {
        System.out.println("Menu updated in Restaurant.");
        return true;
    }

    public boolean manageOrders() {
        System.out.println("Managing orders in Restaurant.");
        return true;
    }

    public boolean handleCustomerService() {
        System.out.println("Handling customer service in Restaurant.");
        return true;
    }

    @Override
    public boolean login() {
        System.out.println("Restaurant logged in.");
        return true;
    }

    @Override
    public boolean logout() {
        System.out.println("Restaurant logged out.");
        return true;
    }

    @Override
    public boolean updateProfile() {
        System.out.println("Restaurant profile updated.");
        return true;
    }

    public String getRestaurantStatus() {
        return restaurantStatus;
    }

    public void setRestaurantStatus(String restaurantStatus) {
        this.restaurantStatus = restaurantStatus;
    }
}
