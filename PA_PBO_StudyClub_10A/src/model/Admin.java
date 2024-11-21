/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Admin extends User{
    private final String role = "Admin";

    public Admin(String idUser, String name, String password) {
        super(idUser, name, password);
    }

    @Override
    public String getRoleUser() {
        return this.role;
    }

    public final static boolean loginAdmin(String idUser, String password) {
    try {
        // Pastikan koneksi database terbuka
        if (Database.connection == null || Database.connection.isClosed()) {
            Database.connect(); // Panggil metode untuk membuka koneksi, jika ada
        }

        // Query untuk memeriksa login
        String query = "SELECT * FROM admin WHERE id_admin = ? AND password = ?";
        Database.preparedStatement = Database.connection.prepareStatement(query);
        Database.preparedStatement.setString(1, idUser);
        Database.preparedStatement.setString(2, password);
        Database.resultSet = Database.preparedStatement.executeQuery();

        // Memeriksa hasil query
        if (Database.resultSet.next()) {
            return true; // Jika ditemukan, login berhasil
        } else {
            return false;
        }
    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat login: " + e.getMessage());
        e.printStackTrace(); // Untuk debugging jika ada error
        return false;
    } finally {
        Database.closeResources();
    }
    }
}
