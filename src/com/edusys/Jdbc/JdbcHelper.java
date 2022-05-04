/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO-PC
 */
public class JdbcHelper {

    public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=EduSys";
    public static String user = "sa";
    public static String pass = "songlong";

    //nạp driver
     static{
        try {            
            Class.forName(driver);
        } 
        catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

     public static void update(String sql, Object...args) {
        try {
            PreparedStatement stmt = JdbcHelper.getStmt(sql, args);
            try {
                stmt.executeUpdate();
            } 
            finally{
                stmt.getConnection().close();
            }
        } 
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = JdbcHelper.getStmt(sql, args);
        return stmt.executeQuery();
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
