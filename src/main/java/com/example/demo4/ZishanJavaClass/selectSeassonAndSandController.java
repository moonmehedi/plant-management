package com.example.demo4.ZishanJavaClass;

import com.example.demo4.Start;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class selectSeassonAndSandController implements Initializable {
    @FXML
    public ComboBox<String> season;


    @FXML
    public ComboBox<String> soilquality;
    ObservableList<String> l2 = FXCollections.observableArrayList("Sandy Soil", "Clay Soil", "Loamy Soil");
    ObservableList<String> l1 = FXCollections.observableArrayList("Monsoon", "Summer","Winter");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        season.setItems(l1);
        soilquality.setItems(l2);
    }

    @FXML
    public void findcrop(ActionEvent event) throws IOException {
        String s1 = season.getValue();
        String s2 = soilquality.getValue();

        switch (s1+" "+s2) {
            case "Monsoon Sandy Soil":
               cropPlanningController obj=new cropPlanningController();
                obj.monsoonSandySoil(event);
                break;
            case "Monsoon Clay Soil":
                cropPlanningController obj1=new cropPlanningController();
                obj1.monsoonClaySoil(event);
                break;
            case "Summer Sandy Soil":
                cropPlanningController obj2=new cropPlanningController();
                obj2.summerSandySoil(event);
                break;
            case "Summer Clay Soil":
                cropPlanningController obj3=new cropPlanningController();
                obj3.summerClaySoil(event);
                break;
            case "Winter Loamy Soil":
                cropPlanningController obj4=new cropPlanningController();
                obj4.winterLoamySoil(event);
                break;
            case "Winter Clay Soil":
                cropPlanningController obj5=new cropPlanningController();
                obj5.winterClaySoil(event);
                break;
            default:
                System.out.println("not found");
                //showError.setText("Not In List");
        }
    }


 @FXML
    void onHomeBtnClk(ActionEvent event) throws IOException {
     FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/Functions.fxml"));
     Scene scene = new Scene(fxmlLoader.load());
     Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
     stage.setTitle("identify!");
     stage.setScene(scene);
     stage.show();
 }



}


