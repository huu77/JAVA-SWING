/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 
public class sqlDao {
    public static void main(String[] args) {
        getConnection();
    }
        public static Connection getConnection() {
        String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=QuanLyXeHVCS;"
             + ";encrypt=true;trustServerCertificate=true;";
        String USER_NAME = "sa";
        String PASSWORD = "12";
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
           
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
    
    public static void print1(){
        System.out.println("huu");
    }
}
