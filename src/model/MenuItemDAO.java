package model;

import java.sql.*;

public class MenuItemDAO {
    public static void addMenuItem(String name, double price, int restaurantId) {
        String sql = "INSERT INTO MenuItems (name, price, restaurant_id) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setDouble(2, price);
            stmt.setInt(3, restaurantId);
            stmt.executeUpdate();
            System.out.println("Menu item added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getAllMenuItems() {
        String sql = "SELECT * FROM MenuItems";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Restaurant ID: " + rs.getInt("restaurant_id"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateMenuItem(int id, String name, double price) {
        String sql = "UPDATE MenuItems SET name = ?, price = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setDouble(2, price);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            System.out.println("Menu item updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteMenuItem(int id) {
        String sql = "DELETE FROM MenuItems WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Menu item deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
