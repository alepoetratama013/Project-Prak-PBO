
package app;
import java.sql.*;

public class Connector {
    protected String DBurl = "jdbc:mysql://localhost/rental_kendaraan";
    protected String DBusername = "root";
    protected String DBpassword = "";
    protected Connection koneksi;
    protected Statement statement;
    public Connector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            //System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
            System.out.println(ex);
        }
    }
}
