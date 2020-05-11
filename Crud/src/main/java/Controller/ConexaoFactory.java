/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author Feeco
 */
public class ConexaoFactory {
    private Connection conn;
    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet rs;
    
    public void open() {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/telacadastro?autoReconnect=true",
"root", "");
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
    
    
    public static Connection getConexao() {
        String url = "jdbc:mysql://127.0.0.1:3306/telacadastro?useSSL=false";
        String user = "root";
        String password = "";
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static JdbcRowSet getRowSetConnection() {
        String url = "jdbc:mysql://127.0.0.1:3306/telacadastro?useSSL=false";
        String user = "root";
        String password = "";
        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);
            return jdbcRowSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static CachedRowSet getRowSetConnectionCached() {
        String url = "jdbc:mysql://127.0.0.1:3306/telacadastro?useSSL=false&relaxAutoCommit=true";
        String user = "root";
        String password = "";
        try {
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(user);
            cachedRowSet.setPassword(password);
            return cachedRowSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void close(RowSet jrs) {
        try {
            if (jrs != null)
                jrs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stmt) {
        close(connection);
        try {
            if (stmt != null)
                stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stmt, ResultSet rs) {
        close(connection, stmt);
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
