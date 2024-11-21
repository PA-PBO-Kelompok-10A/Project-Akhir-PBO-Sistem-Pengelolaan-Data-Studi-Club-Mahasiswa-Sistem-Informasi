/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Asus
 */
public class Database {
    public static Connection connection = null;
    protected static Statement statement;
    protected static PreparedStatement preparedStatement;
    protected static ResultSet resultSet;

    private final static String DB_HOST = "localhost";
    private final static String DB_NAME = "study_club";
    private final static String DB_USERNAME = "root";
    private final static String DB_PASSWORD = "";

    public Database(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver!");
        }
    }

    public final static Connection connect(){
        try {
            String url = "jdbc:mysql://" + DB_HOST + "/" + DB_NAME;
            connection = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            System.out.println("Failed to connect database! " + e);
        }
        return connection;
    }

    public static void closeResources() {
        try {
            if (preparedStatement != null) preparedStatement.close();
            if (resultSet != null) resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
