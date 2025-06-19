/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumni202457201017;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    // Mendeklarasikan Variabel koneksi sebagai static
    private static Connection mysqlconfiq;
    
    //Method static untuk membuka koneksi ke databases mysql
    public static Connection konek() {
        
        try {
            String url = "jdbc:mysql://localhost:3306/alumni_202457201017";
            String user = "root";
            String pass = "";
            mysqlconfiq = DriverManager.getConnection(url, user, pass);
        } catch (SQLException sQLException) {
            System.out.println(sQLException.getMessage());
        }
         return mysqlconfiq;
    }
        
       
}
