package com.example.demo4.MoonJAVAClass;


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
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DiseasesController implements Initializable {
    @FXML
    public Label showError;
    @FXML
    public ComboBox<String> comboboxmoon;
    ObservableList<String> l=FXCollections.observableArrayList( "Rice", "Jute", "com/example/demo4/MOONRESOURCES/Wheat", "Maize" );


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboboxmoon.setItems(l);
    }


    @FXML
    public void findDiseases(ActionEvent event) {
        String s = comboboxmoon.getValue();

        switch (s) {
            case "Rice":
                SelectDiseasesController d=new SelectDiseasesController();
                d.showRiceDiseases(event);


                break;
            case "Jute":
              SelectDiseasesController J = new SelectDiseasesController();
              J.showJuteDiseases(event);
                break;
            case "com/example/demo4/MOONRESOURCES/Wheat":
                SelectDiseasesController W = new SelectDiseasesController();
                W.showWheatDiseases(event);
                break;
            case "Maize":
                SelectDiseasesController M = new SelectDiseasesController();
                M.showMaizeDiseases(event);
                break;
            default:
                showError.setText("Not In List");
        }
    }

    @FXML
    public void askAi(ActionEvent event2) {
        try {
            AskAi ai = new AskAi();
            ai.showai();
        } catch (IOException e) {
            // Handle the IOException, e.g., show an error message or log the exception.
            e.printStackTrace();
        }
    }

    @FXML
    void onHomeBtnClk(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/Functions.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identyfy!");
        stage.setScene(scene);
        stage.show();
    }


    }