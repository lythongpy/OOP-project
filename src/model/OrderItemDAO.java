package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderItemDAO {
    public static void addOrderItem(int orderId, int menuItemId, int quantity) {
        String sql = "INSERT INTO OrderItems (order_id, menu_item_id, quantity) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, orderId);
            stmt.setInt(2, menuItemId);
            stmt.setInt(3, quantity);
            stmt.executeUpdate();
            System.out.println("Order item added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getOrderItems(int orderId) {
        List<String> orderItems = new ArrayList<>();
        String sql = "SELECT * FROM OrderItems WHERE order_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, orderId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String item = "Item ID: " + rs.getInt("id") +
                        ", Menu Item ID: " + rs.getInt("menu_item_id") +
                        ", Quantity: " + rs.getInt("quantity");
                orderItems.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderItems;
    }

    public static void updateOrderItemQuantity(int id, int quantity) {
        String sql = "UPDATE OrderItems SET quantity = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, quantity);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Order item quantity updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteOrderItem(int id) {
        String sql = "DELETE FROM OrderItems WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Order item deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
