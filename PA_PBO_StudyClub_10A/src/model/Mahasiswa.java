/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class Mahasiswa extends User {
    private final String role = "Mahasiswa";

    public Mahasiswa(String idUser, String name, String password) {
        super(idUser, name, password);
    }

    @Override
    public String getRoleUser() {
        return this.role;
    }

    public static boolean loginMahasiswa(String idUser, String password) {
        try {
            String query = "SELECT * FROM mahasiswa WHERE nim = ? AND password = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, idUser);
            Database.preparedStatement.setString(2, password);
            Database.resultSet = Database.preparedStatement.executeQuery();

            return Database.resultSet.next();
        } catch (SQLException e) {
            return false;
        } finally {
            Database.closeResources();
        }
    }

    public static String getName(String idUser) {
        String name = null;
        try {
            String query = "SELECT nama FROM mahasiswa WHERE nim = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, idUser);
            Database.resultSet = Database.preparedStatement.executeQuery();

            if (Database.resultSet.next()) {
                name = Database.resultSet.getString("nama");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error retrieving name: " + e.getMessage());
        } finally {
            Database.closeResources();
        }
        return name;
    }

    public String getNim() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean daftarMahasiswa() {
        try {
               String query = "INSERT INTO MAHASISWA (nim, nama, password) VALUES (?, ?, ?)";

               Database.preparedStatement = Database.connection.prepareStatement(query);
               Database.preparedStatement.setString(1, super.getIdUser());
               Database.preparedStatement.setString(2, super.getName());
               Database.preparedStatement.setString(3, super.getPassword());

               Database.preparedStatement.executeUpdate();
               return true;
            } catch (Exception e){
                return false;
            }
    }
        
}   
