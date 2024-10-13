package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class functions {
    @FXML
    public void showDiseases(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/MOONRESOURCES/diseases.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identyfy!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void showTraining(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(functions.class.getResource("/com/example/demo4/MOONRESOURCES/"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Diseases Identification");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void supportBtnClk(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ArifResources/HelpAndSupport.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identyfy!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void inventoryBtnclk(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ArifResources/inventory.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identyfy!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void cropPlanningClk(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/selectSeassonAndSand.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identyfy!");
        stage.setScene(scene);
        stage.show();
    }
}
