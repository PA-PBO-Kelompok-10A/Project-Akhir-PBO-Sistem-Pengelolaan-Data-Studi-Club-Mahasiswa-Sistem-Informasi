/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controller;

import model.Database;
import model.Admin;
import model.Mahasiswa;
import gui.MenuAdmin;
import gui.MenuMahasiswa;
import javax.swing.JOptionPane;

/**
 *
 * @author rofih
 */
    
import model.Database;
import model.Admin;
import model.Mahasiswa;
import gui.MenuAdmin;
import gui.MenuMahasiswa;
import javax.swing.JOptionPane;

public class LoginController {

    public static boolean loginButton(String idUser, String password, String role) {
        try {
            // Membuka koneksi ke database
            Database.connect();

            // Validasi input ID dan password
            if (idUser.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Harap isi semua kolom!");
                return false;
            } 

            // Validasi login berdasarkan role
            if (role.equalsIgnoreCase("Mahasiswa")) { // Mahasiswa
                if (Mahasiswa.loginMahasiswa(idUser, password)) {
                    String name = Mahasiswa.getName(idUser);
                    
                    MenuMahasiswa dashboardMahasiswa = new MenuMahasiswa();
                    dashboardMahasiswa.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Selamat Datang di Study Club, " + name);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Login gagal! ID atau Password salah.");
                    return false;
                }
            } else if (role.equalsIgnoreCase("Admin")) {
                if (Admin.loginAdmin(idUser, password)) {

                    MenuAdmin dashboardAdmin = new MenuAdmin();
                    dashboardAdmin.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Selamat Datang di Study Club Admin..." );
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Login gagal! ID atau Password salah.");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid role selected.");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Koneksi Database");
            return false;
        } finally {
            Database.closeResources();
        }
    }
}
