/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS ROG
 */
public class database {
     public static Connection connectDb() {
        try {
            // Optional in newer versions (Java 8+), but okay to keep
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connect = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pharmacy", // add port 3306
                "root",                                  // your username
                "root"                                       // your password (empty if none)
            );
            return connect;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
     }
}
