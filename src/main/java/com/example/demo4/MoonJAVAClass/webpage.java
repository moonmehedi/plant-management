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


public class webpage implements Initializable {
    @FXML
    private WebView showWeb;
    @FXML
    private WebEngine Engine;
    static String Path;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Engine=showWeb.getEngine();
        Engine.load(Path);
        System.out.println(Path);
    }

    public void showweb(String path) throws IOException {
        Path = getClass().getResource(path).toExternalForm();
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/MOONRESOURCES/webview.fxml"));
        Scene scene = new Scene(fxmlLoader.load());


        Stage stage=new Stage();
        stage.setTitle("ASK AI");
        stage.setScene(scene);
        stage.show();

    }


}