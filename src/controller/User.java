package controller;

abstract class User implements UserAction {
    private String userID;
    private String password;
    private String userName;
    private String contactInfo;
    private String role;

    // Create Administrator, Restaurant account:
    User(String userID, String password, String userName, String role) {
        this.userID = userID;
        this.password = password;
        this.userName = userName;
        this.role = role;
    }
    // Create DeliveryStaff, Customer account:
    User(String userID, String password, String userName, String contactInfo, String role) {
        this.userID = userID;
        this.password = password;
        this.userName = userName;
        this.contactInfo = contactInfo;
        this.role = role;
    }

    abstract void login();
    abstract void logout();

    // getData function
    String getUserID() {
        return userID;
    }
    String getUserName() {
        return userName;
    }
    String getPassword() {
        return password;
    }
    String getContactInfo() {
        return contactInfo;
    }
}
