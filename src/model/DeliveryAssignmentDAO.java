package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeliveryAssignmentDAO {
    public static void addAssignment(int orderId, int deliveryStaffId, String status) {
        String sql = "INSERT INTO DeliveryAssignments (order_id, delivery_staff_id, assigned_date, status) VALUES (?, ?, NOW(), ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, orderId);
            stmt.setInt(2, deliveryStaffId);
            stmt.setString(3, status);
            stmt.executeUpdate();
            System.out.println("Delivery assignment added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getAssignmentsByStatus(String status) {
        List<String> assignments = new ArrayList<>();
        String sql = "SELECT * FROM DeliveryAssignments WHERE status = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, status);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String assignment = "Assignment ID: " + rs.getInt("id") +
                        ", Order ID: " + rs.getInt("order_id") +
                        ", Delivery Staff ID: " + rs.getInt("delivery_staff_id") +
                        ", Assigned Date: " + rs.getTimestamp("assigned_date") +
                        ", Status: " + rs.getString("status");
                assignments.add(assignment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return assignments;
    }

    public static void updateAssignmentStatus(int id, String status) {
        String sql = "UPDATE DeliveryAssignments SET status = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, status);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Delivery assignment status updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteAssignment(int id) {
        String sql = "DELETE FROM DeliveryAssignments WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Delivery assignment deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
