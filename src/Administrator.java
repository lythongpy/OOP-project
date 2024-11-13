class Administrator extends User {

    public Administrator(String userID, String password, String userName) {
        super(userID, password, userName, "Administrator");
    }

    protected boolean manageUsers() {
        System.out.println("Users managed by Administrator.");
        return true;
    }

    // Overriding login/logout functions
    @Override
    void login() {
        System.out.println("Administrator logged in.");
    }
    @Override
    void logout() {
        System.out.println("Administrator logged out.");
    }
}