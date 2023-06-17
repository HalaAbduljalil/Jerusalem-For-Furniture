package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.net.URL;

public class homeEmptest {
    private Pane view;
    private Pane view1;
    private Pane view3;
    public Pane getPage (String filename )
    {
        try
        {


            URL fileUrl = AddFurnitureController.class.getResource("/sample/"+filename+".fxml");
            if (fileUrl == null)
            {
                throw new java.io.FileNotFoundException("FXml file can't be found ");
            }
            view = new FXMLLoader().load(fileUrl);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return view;
    }
    public Pane getPage8 (String filename )//OrderController
    {
        try
        {


            URL fileUrl = CoustomerController.class.getResource("/sample/"+filename+".fxml");
            if (fileUrl == null)
            {
                throw new java.io.FileNotFoundException("FXml file can't be found ");
            }
            view = new FXMLLoader().load(fileUrl);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return view;
    }
    public Pane getPage10 (String filename )//OrderController
    {
        try
        {


            URL fileUrl = OrderController.class.getResource("/sample/"+filename+".fxml");
            if (fileUrl == null)
            {
                throw new java.io.FileNotFoundException("FXml file can't be found ");
            }
            view = new FXMLLoader().load(fileUrl);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return view;
    }
    public Pane getPage11 (String filename )//OrderController
    {
        try
        {


            URL fileUrl = LoveController.class.getResource("/sample/"+filename+".fxml");
            if (fileUrl == null)
            {
                throw new java.io.FileNotFoundException("FXml file can't be found ");
            }
            view = new FXMLLoader().load(fileUrl);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return view;
    }
    public Pane getPage15 (String filename )//OrderController
    {
        try
        {


            URL fileUrl = RatingController.class.getResource("/sample/"+filename+".fxml");
            if (fileUrl == null)
            {
                throw new java.io.FileNotFoundException("FXml file can't be found ");
            }
            view = new FXMLLoader().load(fileUrl);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return view;
    }
    public Pane getPage6 (String filename )
    {
        try
        {


            URL fileUrl = BedroomController.class.getResource("/sample/"+filename+".fxml");
            if (fileUrl == null)
            {
                throw new java.io.FileNotFoundException("FXml file can't be found ");
            }
            view = new FXMLLoader().load(fileUrl);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return view;
    }

    public Pane getPage3(String filename )
    {
        try
        {
            URL fileUrl = addingEmployee.class.getResource("/sample/"+filename+".fxml");
            if (fileUrl == null)
            {
                throw new java.io.FileNotFoundException("FXml file can't be found ");
            }
            view3 = new FXMLLoader().load(fileUrl);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return view3;
    }
    public Pane getPage4(String filename )
    {
        try
        {
            URL fileUrl = furnitureEmployee.class.getResource("/sample/"+filename+".fxml");
            if (fileUrl == null)
            {
                throw new java.io.FileNotFoundException("FXml file can't be found ");
            }
            view1 = new FXMLLoader().load(fileUrl);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return view1;
    }
}
