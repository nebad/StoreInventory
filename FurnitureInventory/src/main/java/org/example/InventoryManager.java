package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private Connection connection;

    public InventoryManager() {
        // Establish database connection
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_db", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();

        // Fetch items from the database
        try (Statement statement = connection.createStatement()) {
            String query = "SELECT * FROM items";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");

                Item item = new Item( name, quantity, price);
                items.add(item);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return items;
    }

    public void addItem(Item item) {
        // Insert item into the database
        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO items (name, price, quantity) VALUES (?, ?, ?)")) {
            statement.setString(1, item.getName());
            statement.setDouble(2, item.getPrice());
            statement.setInt(3, item.getQuantity());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Additional methods for updating, deleting, searching, etc.
}
