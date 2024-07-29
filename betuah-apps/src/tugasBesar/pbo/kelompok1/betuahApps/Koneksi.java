package tugasBesar.pbo.kelompok1.betuahApps;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Koneksi {
    
    static Connection con;
    Statement st = null;
    
    public static Connection getConnection(){
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            
            data.setDatabaseName("betuahapps");
            data.setServerName("localhost");
            data.setPortNumber(3306);
            data.setUser("root");
            data.setPassword("");
            
            try{
                con = data.getConnection();
                System.out.println("koneksi berhasil");
            }catch(SQLException e){
                System.out.println("tidak konek");
            }
        }
        return con;
    }
    
}
