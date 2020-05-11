/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Feeco
 */
public class DataService {
    
    static Connection conn;

    public static Connection open() {
        try {
            // OBRIGATORIO
            Class.forName("com.mysql.cj.jdbc.Driver");
            DataService.conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/telacadastro?useTimezone=true&serverTimezone=UTC&autoReconnect=true",
                    "root", "");
            return DataService.conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close() {
        try {
            DataService.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
