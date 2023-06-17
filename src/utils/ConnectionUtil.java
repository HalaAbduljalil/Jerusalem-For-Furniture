package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
    Connection conn = null;

    public static Connection conDB() {
        try {
            Class.forName("con.mysql.jdbc.Driver");
            String str_url = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con= DriverManager.getConnection(str_url,"sahar","1928374655");
            return con ;
        } catch (Exception ex) {
            return null;
        }

    }
}
