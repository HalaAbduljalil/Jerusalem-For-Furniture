package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mySqlConnectbedroom {
    public static Connection ConnectDB()
    {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            // Class.forName("com.mysql.jdbc.Driver");
            String str = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con =  DriverManager.getConnection(str,"sahar","1928374655");

            // JOptionPane.showMessageDialog(null,"connection in  established correctly ");
            return con ;
        } catch (SQLException e) {
            Logger.getLogger(addingEmployee.class.getName()).log(Level.SEVERE,null, e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
            return null;

        }
    }
    public static ObservableList<userbedroom> getDatausers7() {
        Connection con = ConnectDB();
        //JOptionPane.showMessageDialog(null,"connection in  established correctly ");
        ObservableList<userbedroom> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from bedroom");
            ResultSet rs = ps.executeQuery();
            //JOptionPane.showMessageDialog(null,"list correct");
            while(rs.next())

            { list.add(new userbedroom(rs.getString("carbitcolor"),
                    rs.getString("closetsize"),
                    rs.getString("curtainscolor"),
                    rs.getString("bedcolor"),
                    rs.getString("bedsize"),
                    rs.getString("price"),
                    Integer.parseInt(rs.getString("numoflights")),
                    rs.getString("roomarea"),
                    rs.getString("numofframes"), rs.getString("id")));
                //JOptionPane.showMessageDialog(null,"list in while correct");
            }

        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return list;
    }
}
