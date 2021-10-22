package com.example.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DatabaseConnection {
    private static Connection conn = null;

    static {
        String url = System.getenv("JDBC_DATABASE_URL");
//        String url = "jdbc:postgresql://ec2-34-250-19-18.eu-west-1.compute.amazonaws.com:5432/d9cejv2qol6orv?user=odzfamuqyxnget&password=b8f4f691df292eec6f31f08c53398bc1f47d1b248421ff311b5347e50e675616";
        try {
            conn = DriverManager.getConnection(Objects.requireNonNullElse(url,"jdbc:postgresql://localhost:5432/rentacar?user=postgres&password=pejda123"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}

