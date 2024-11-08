public abstract class User {
    protected String userID;
    protected String username;
    protected String password;
    protected String contactInfo;

    public User(String userID, String username, String password, String contactInfo) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.contactInfo = contactInfo;
    }
    overload
    public User(String userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;
    }

    public abstract boolean login();
    public abstract boolean logout();
    public abstract boolean updateProfile();

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
