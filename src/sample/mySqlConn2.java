package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.sql.*;

public class mySqlConn2 {
    public static Connection ConnectDB()
    {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            // Class.forName("com.mysql.jdbc.Driver");
            String str = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con =  DriverManager.getConnection(str,"sahar","1928374655");

            // JOptionPane.showMessageDialog(null,"connection established correctly ");
            return con ;
        } catch (SQLException e) {
            //Logger.getLogger(addingEmployee.class.getName()).log(Level.SEVERE,null, e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
            return null;

        }
    }

    public static ObservableList<userkitchen> getDatausers5() {
        Connection con = ConnectDB();

        ObservableList<userkitchen> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from kitchen");
            ResultSet rs = ps.executeQuery();
            Statement st1=con.createStatement();
            //ResultSet rs1=st1.executeQuery("select email from employee1" );
            boolean existTid=false;
            while(rs.next())
            { list.add(new userkitchen(rs.getString("woodtype"),
                    rs.getString("marbletype"),
                    rs.getString("kitchencolor"),
                    rs.getString("width"),
                    rs.getString("hight"),
                    rs.getString("electricaltype"),
                   rs.getString("price"),
                    Integer.parseInt(rs.getString("numofshelves")

                    )));
            }
           /* while(rs1.next()){
                add d = new add();
                if(d.EMAIL.getText()==rs1.getString(1)){
                   existTid=true;
                    JOptionPane.showMessageDialog(null, "email is exist , Please Enter new email");
                }
            }*/
        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return list;
    }

    public static ObservableList<userbedroom> getDatausers7() {
        Connection con = ConnectDB();
        //JOptionPane.showMessageDialog(null,"connection established correctly ");
        ObservableList<userbedroom> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from bedroom1");
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
                    rs.getString("numofframes"),
                    rs.getString("id")));
                JOptionPane.showMessageDialog(null,"list correct");
            }

        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return list;
    }
    public static ObservableList <userliving> getDatausers6() {
        Connection conn = ConnectDB();
        ObservableList<userliving> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from livingroom");
            ResultSet rs = ps.executeQuery();
            Statement st1=conn.createStatement();
            //ResultSet rs1=st1.executeQuery("select email from employee1" );
            boolean existTid=false;
            while(rs.next())

            { list.add(new userliving(rs.getString("woodtype"),
                    rs.getString("numofframes"),
                    rs.getString("furniturecolor"),
                    rs.getString("width"),
                    rs.getString("hight"),
                   rs.getString("numofaccessorizing"),
                    Integer.parseInt(rs.getString("numofaccessorizing")),
                    Integer.parseInt(rs.getString("price")

                    )));
            }
           /* while(rs1.next()){
                add d = new add();
                if(d.EMAIL.getText()==rs1.getString(1)){
                   existTid=true;
                    JOptionPane.showMessageDialog(null, "email is exist , Please Enter new email");
                }
            }*/
        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return list;
    }
    public static ObservableList<userssalon> getDatausers4() {
        Connection con = ConnectDB();
        ObservableList<userssalon> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from salon");
            ResultSet rs = ps.executeQuery();
            Statement st1=con.createStatement();
            //ResultSet rs1=st1.executeQuery("select email from employee1" );
            boolean existTid=false;
            while(rs.next())

            { list.add(new userssalon(rs.getString("woodtype"),
                    rs.getString("fabrictype"),
                    rs.getString("furniturecolor"),
                    Integer.parseInt(rs.getString("numofseats")),
                    rs.getString("tablesize"),
                    rs.getString("carbitcolor"),
                    Integer.parseInt(rs.getString("numofaccessorizing")),
                    rs.getString("curtainscolor"),
                    Integer.parseInt(rs.getString("price")

                    )));
            }
           /* while(rs1.next()){
                add d = new add();
                if(d.EMAIL.getText()==rs1.getString(1)){
                   existTid=true;
                    JOptionPane.showMessageDialog(null, "email is exist , Please Enter new email");
                }
            }*/
        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return list;
    }
    public static ObservableList<users2> getDatausers2() {
        Connection con = ConnectDB();
        ObservableList<users2> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from entrance");
            ResultSet rs = ps.executeQuery();
            Statement st1=con.createStatement();
            ResultSet rs1=st1.executeQuery("select email from employee1" );
            boolean existTid=false;
            while(rs.next())

            {



                list.add(new users2(rs.getString("doortype"),
                        rs.getString("mirrorshape"),
                        rs.getString("carbetcolor"),
                        rs.getString("price"),
                        rs.getString("hight"),
                        rs.getString("width"),
                        rs.getString("numfranes"),
                       rs.getString("chandeliersize")

                ));
               // JOptionPane.showMessageDialog(null, "inside your list ");
            }
           /* while(rs1.next()){
                add d = new add();
                if(d.EMAIL.getText()==rs1.getString(1)){
                   existTid=true;
                    JOptionPane.showMessageDialog(null, "email is exist , Please Enter new email");
                }
            }*/
        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return list;
    }
    public static ObservableList<userorder> getDatausers8() {
        Connection con = ConnectDB();
        ObservableList<userorder> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from myorder");
            ResultSet rs = ps.executeQuery();
            Statement st1=con.createStatement();
            while(rs.next())

            {

                list.add(new userorder(rs.getString("myname"),
                        rs.getString("orderno"),
                        rs.getString("paymentmethod"),
                        rs.getString("email"),
                        rs.getString("address")

                ));
            }



        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return list;
    }
    public static ObservableList<users> getDatausers3() {
        Connection con = ConnectDB();
        ObservableList<users> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from employee1");
            ResultSet rs = ps.executeQuery();
            Statement st1=con.createStatement();
            ResultSet rs1=st1.executeQuery("select email from employee1" );
            boolean existTid=false;
            while(rs.next())

            {



                list.add(new users(rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("email"),
                       rs.getString("passwordd"),
                        rs.getString("positionn"),
                        rs.getString("salary"),
                        rs.getString("city"),
                        rs.getString("street")

                ));
               // JOptionPane.showMessageDialog(null,"table list added1 ");
            }


           /* while(rs1.next()){
                add d = new add();
                if(d.EMAIL.getText()==rs1.getString(1)){
                   existTid=true;
                    JOptionPane.showMessageDialog(null, "email is exist , Please Enter new email");
                }
            }*/
        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return list;
    }

}
