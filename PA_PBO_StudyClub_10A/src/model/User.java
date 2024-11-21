/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public abstract class User {
    private final String idUser;
    final String name;
    final String password;

    public User(String idUser, String name, String password) {
        this.idUser = idUser;
        this.name = name;
        this.password = password;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public abstract String getRoleUser();
}
