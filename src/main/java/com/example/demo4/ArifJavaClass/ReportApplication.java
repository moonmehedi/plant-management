package com.example.demo4.ArifJavaClass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ReportApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/demo4/ArifResources/inventreport.fxml"));
        primaryStage.setTitle("Report Application");
        primaryStage.setScene(new Scene(root, 1525, 920));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
