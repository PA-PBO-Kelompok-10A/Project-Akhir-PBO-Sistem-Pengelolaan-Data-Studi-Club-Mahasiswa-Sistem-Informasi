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
public class PenanggungJawab {
    private final String nim;
    private String nama;
    private String kelas;

    public PenanggungJawab(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

}
