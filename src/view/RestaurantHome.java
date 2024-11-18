package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestaurantHome {
    private JFrame frame;
    private JTextField nameField, addressField, phoneField;
    private JButton updateButton, viewMenuButton;

    public RestaurantHome() {
        frame = new JFrame("Restaurant Management");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Restaurant Name:");
        nameLabel.setBounds(50, 50, 150, 30);
        frame.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(200, 50, 150, 30);
        frame.add(nameField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 100, 150, 30);
        frame.add(addressLabel);

        addressField = new JTextField();
        addressField.setBounds(200, 100, 150, 30);
        frame.add(addressField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(50, 150, 150, 30);
        frame.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(200, 150, 150, 30);
        frame.add(phoneField);

        updateButton = new JButton("Update Info");
        updateButton.setBounds(100, 200, 150, 30);
        frame.add(updateButton);

        viewMenuButton = new JButton("View Menu");
        viewMenuButton.setBounds(100, 250, 150, 30);
        frame.add(viewMenuButton);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRestaurantInfo();
            }
        });

        viewMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuManagement();
            }
        });

        frame.setVisible(true);
    }

    private void updateRestaurantInfo() {
        try {
            String name = nameField.getText();
            String address = addressField.getText();
            String phone = phoneField.getText();
            RestaurantDAO.updateRestaurant(1, name, address, phone); // Assuming restaurant ID = 1
            JOptionPane.showMessageDialog(frame, "Restaurant info updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
