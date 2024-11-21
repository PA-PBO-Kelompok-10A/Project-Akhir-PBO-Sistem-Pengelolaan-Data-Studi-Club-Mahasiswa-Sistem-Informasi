/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class StudyClub {
    private int idStudyClub;
    private String namaSc;
    private int kapasitas;
    private String jadwalSc;
    private String deskripsi;
    private String nimMahasiswa;
    private String namaPenanggungJawab;
    private String jenisSC;
    
    // Konstruktor
    public StudyClub(String namaSc, int kapasitas, String jadwalSc, String deskripsi, String namaPenanggungJawab, String jenisSC) {
        this.namaSc = namaSc;
        this.kapasitas = kapasitas;
        this.jadwalSc = jadwalSc;
        this.deskripsi = deskripsi;
        this.namaPenanggungJawab = namaPenanggungJawab;
        this.jenisSC = jenisSC;
    }

    public StudyClub(int idStudyClub) {
        this.idStudyClub = idStudyClub;
    }

    // Method untuk menyimpan StudyClub ke database
    public void createStudyClub() {
        try (Connection connection = Database.connect()) {
            String query = "INSERT INTO study_club (nama_sc, jadwal_sc, kapasitas_sc, penanggungjawab_sc, deskripsi_sc, jenis_sc) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, this.namaSc);
                preparedStatement.setString(2, this.jadwalSc);
                preparedStatement.setInt(3, this.kapasitas);
                preparedStatement.setString(4, this.namaPenanggungJawab);
                preparedStatement.setString(5, this.deskripsi);
                preparedStatement.setString(6, this.jenisSC);
                preparedStatement.executeUpdate();
                System.out.println("Study Club berhasil dibuat!");
            }
        } catch (SQLException e) {
            System.out.println("Error while saving Study Club: " + e.getMessage());
        }
    }

    // Method untuk menghapus StudyClub berdasarkan ID
    public void deleteStudyClub() {
        try (Connection connection = Database.connect()) {
            String query = "DELETE FROM study_club WHERE id_sc = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, this.idStudyClub);
                preparedStatement.executeUpdate();
                System.out.println("Study Club berhasil dihapus!");
            }
        } catch (SQLException e) {
            System.out.println("Error while deleting Study Club: " + e.getMessage());
        }
    }

    // Method untuk mengupdate StudyClub berdasarkan parameter yang diterima
    public void updateStudyClub(int kapasitas, String jadwalSc, String deskripsi) {
        try (Connection connection = Database.connect()) {
            String query = "UPDATE study_club SET kapasitas = ?, jadwalSc = ?, deskripsi = ? WHERE idStudyClub = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, kapasitas);
                preparedStatement.setString(2, jadwalSc);
                preparedStatement.setString(3, deskripsi);
                preparedStatement.setInt(4, this.idStudyClub);
                preparedStatement.executeUpdate();
                System.out.println("Study Club berhasil diperbarui!");
            }
        } catch (SQLException e) {
            System.out.println("Error while updating Study Club: " + e.getMessage());
        }
    }
}
