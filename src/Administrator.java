public class Administrator extends User {
    public String managedUsers;
    private String systemSettings;

    public Administrator(String userID, String username, String password, String contactInfo, String managedUsers, String systemSettings) {
        super(userID, username, password, contactInfo);
        this.managedUsers = managedUsers;
        this.systemSettings = systemSettings;
    }

    public boolean manageUsers() {
        System.out.println("Users managed by Administrator.");
        return true;
    }

    public boolean configureSettings() {
        System.out.println("System settings configured by Administrator.");
        return true;
    }

    public boolean viewReports() {
        System.out.println("Reports viewed by Administrator.");
        return true;
    }

    @Override
    public boolean login() {
        System.out.println("Administrator logged in.");
        return true;
    }

    @Override
    public boolean logout() {
        System.out.println("Administrator logged out.");
        return true;
    }

    @Override
    public boolean updateProfile() {
        System.out.println("Administrator profile updated.");
        return true;
    }

    public String getSystemSettings() {
        return systemSettings;
    }

    public void setSystemSettings(String systemSettings) {
        this.systemSettings = systemSettings;
    }
}
