package model;

import java.sql.*;

public class RestaurantDAO {
    public static void addRestaurant(String name, String address, String phone, int ownerId) {
        String sql = "INSERT INTO Restaurants (name, address, phone, owner_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setString(3, phone);
            stmt.setInt(4, ownerId);
            stmt.executeUpdate();
            System.out.println("Restaurant added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getAllRestaurants() {
        String sql = "SELECT * FROM Restaurants";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Address: " + rs.getString("address"));
                System.out.println("Phone: " + rs.getString("phone"));
                System.out.println("Owner ID: " + rs.getInt("owner_id"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateRestaurant(int id, String name, String address, String phone) {
        String sql = "UPDATE Restaurants SET name = ?, address = ?, phone = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setString(3, phone);
            stmt.setInt(4, id);
            stmt.executeUpdate();
            System.out.println("Restaurant updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteRestaurant(int id) {
        String sql = "DELETE FROM Restaurants WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Restaurant deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
