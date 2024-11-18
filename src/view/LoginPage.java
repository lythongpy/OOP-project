package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    private JFrame frame;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginPage() {
        frame = new JFrame("Login Page");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 50, 100, 30);
        frame.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(150, 50, 200, 30);
        frame.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        frame.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 200, 30);
        frame.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        frame.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        frame.setVisible(true);
    }

    private void login() {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        try {
            UserDAO userDAO = new UserDAO();
            String role = userDAO.getUserRole(email, password);
            if (role != null) {
                JOptionPane.showMessageDialog(frame, "Login Successful as " + role);
                frame.dispose();
                if (role.equals("Administrator")) {
                    new RestaurantHome();
                } else if (role.equals("Customer")) {
                    new CustomerHome();
                } else if (role.equals("DeliveryStaff")) {
                    new DeliveryHome();
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
