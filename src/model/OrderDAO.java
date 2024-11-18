package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    public static void addOrder(int customerId, int restaurantId, String status) {
        String sql = "INSERT INTO Orders (customer_id, restaurant_id, order_date, status) VALUES (?, ?, NOW(), ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, customerId);
            stmt.setInt(2, restaurantId);
            stmt.setString(3, status);
            stmt.executeUpdate();
            System.out.println("Order added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getAllOrders() {
        List<String> orders = new ArrayList<>();
        String sql = "SELECT * FROM Orders";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String order = "Order ID: " + rs.getInt("id") +
                        ", Customer ID: " + rs.getInt("customer_id") +
                        ", Restaurant ID: " + rs.getInt("restaurant_id") +
                        ", Date: " + rs.getTimestamp("order_date") +
                        ", Status: " + rs.getString("status");
                orders.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }

    public static void updateOrderStatus(int id, String status) {
        String sql = "UPDATE Orders SET status = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, status);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Order status updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteOrder(int id) {
        String sql = "DELETE FROM Orders WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Order deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
