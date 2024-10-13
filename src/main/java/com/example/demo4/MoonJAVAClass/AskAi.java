package com.example.demo4.MoonJAVAClass;


import com.example.demo4.Start;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.web.WebView;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class AskAi implements Initializable {
    @FXML
    private WebView showWeb;
    @FXML
    private WebEngine Engine;

    String Path;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Engine=showWeb.getEngine();
        LoadBird();
    }

    public void LoadBird(){
        Engine.load("https://bard.google.com/?hl=en");
    }
    public void showai() throws IOException {
        //Path=path;
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("AskAi.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        //for appliing css must add this line
        //String  css= this.getClass().getResource("style.css").toExternalForm();
        // scene.getStylesheets().add(css);
        Stage stage=new Stage();
        //stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("ASK AI");
        stage.setScene(scene);
        stage.show();

    }


}
