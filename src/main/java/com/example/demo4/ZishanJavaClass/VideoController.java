package com.example.demo4.ZishanJavaClass;


import com.example.demo4.Start;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class VideoController implements Initializable {
    @FXML
    private WebView showWeb;
    @FXML
    private WebEngine Engine;
    static String Path;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Engine=showWeb.getEngine();
        System.out.println(Path);
        Engine.load(Path);
    }

    public void showweb(String path) throws IOException {
        Path=path;
        System.out.println(path);
        System.out.println(Path);
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/IntrCrpingPlayVid.fxml"));
        Scene scene = new Scene(fxmlLoader.load());


        Stage stage=new Stage();
        stage.setOnHidden(e -> stopVideoPlayback());
        stage.setTitle("crp if");
        stage.setScene(scene);
        stage.show();

    }
    private void stopVideoPlayback() {
        Engine.load(null); // Stop the video playback when the window is closed
    }

    }


