package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuManagement {
    private JFrame frame;
    private JTextField nameField, priceField;
    private JButton addButton, viewMenuButton;

    public MenuManagement() {
        frame = new JFrame("Menu Management");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Item Name:");
        nameLabel.setBounds(50, 50, 150, 30);
        frame.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 30);
        frame.add(nameField);

        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(50, 100, 150, 30);
        frame.add(priceLabel);

        priceField = new JTextField();
        priceField.setBounds(150, 100, 150, 30);
        frame.add(priceField);

        addButton = new JButton("Add Item");
        addButton.setBounds(100, 150, 150, 30);
        frame.add(addButton);

        viewMenuButton = new JButton("View Menu");
        viewMenuButton.setBounds(100, 200, 150, 30);
        frame.add(viewMenuButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMenuItem();
            }
        });

        viewMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to display menu items
            }
        });

        frame.setVisible(true);
    }

    private void addMenuItem() {
        try {
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            MenuItemDAO.addMenuItem(name, price, 1); // Assuming restaurant ID = 1
            JOptionPane.showMessageDialog(frame, "Menu item added.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
