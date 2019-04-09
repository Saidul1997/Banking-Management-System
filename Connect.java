
package online_banking;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.*;
import javax.swing.JOptionPane;

public class Connect {
    Connection conn = null;
    
    public static Connection connecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("D:\\practise code\\practise 2\\Online_Banking\\bank.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}
