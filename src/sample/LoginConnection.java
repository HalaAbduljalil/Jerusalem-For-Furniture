package sample;

import java.beans.Statement;
import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginConnection {
    public Connection databaseLink ;

    public Connection getConnect(){
        String DatabaseName="connect";
        String DatabaseUser="sahar";
        String DatabasePassword="1928374655";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";

        try {
           DriverManager.registerDriver((new oracle.jdbc.driver.OracleDriver()));
            databaseLink= DriverManager.getConnection(url,DatabaseUser,DatabasePassword);
            Statement stmt = (Statement) databaseLink.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
          return databaseLink;
    }
}
