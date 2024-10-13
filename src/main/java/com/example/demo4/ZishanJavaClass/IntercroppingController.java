package com.example.demo4.ZishanJavaClass;


import com.example.demo4.Start;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




public class IntercroppingController {

    static String path;
    static String VideoPath;
    static Image img;
    @FXML
    private Label selectedCropLabel;

    @FXML
    private ComboBox<String> cropComboBox;

    @FXML
    private Label intercroppingProcedureLabel;
    @FXML
    ImageView imageView;

    @FXML
    public void initialize() {
        // You can initialize components here or add event handlers
        // For example:
        String s = cropPlanningController.getMainCrop();
        if (s == "Rice") {
            ObservableList<String> l = FXCollections.observableArrayList("Mung Beans", "Pumpkins", "Cucumber");
            cropComboBox.setItems(l);
        } else if (s == "Jute") {
            ObservableList<String> l = FXCollections.observableArrayList("Pumpkins ", "Cucumber", "Turmeric");
            cropComboBox.setItems(l);

        } else if (s == "") {

        } else if (s == "") {

        }

        //  cropComboBox.getItems().addAll("Pumpkins","Cucumber","Soybean","Mung Beans","Taro","Turmeric","Ginger","Spinach","Sweet Potato","Okra","Corn","Carrot","Legumes","Mustard Greens","Lettuce","Barley","Cabbage");
    }


    @FXML
    void ButtonOk(ActionEvent event) {
        String s = cropComboBox.getValue();
        System.out.println(s);

        if (s == "Soybean") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Soyabin.txt";
            VideoPath = "https://youtu.be/3-0IQPPMrgI?si=3J1ConeN2fEpfw98";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Cucumber") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Cucumber.txt";
            VideoPath = "https://youtu.be/AprcXULHGmw?si=QsrsArLhFHzOXSUe";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Pumpkins") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Pumpkin.txt";
            VideoPath = "https://youtu.be/iKxw1mu3JQ8?si=myYuViE2Gahm56WB";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Mung Beans") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Mung Beans.txt";
            VideoPath = "https://youtu.be/uFV_TUAmvEY?si=OISV_g6yAc5IuMw2";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Ginger") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Ginger.txt";
            VideoPath = "https://youtu.be/3c7j7TzjOc8?si=Jb9n0Suf-VXO27SE";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Turmeric") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Turmeric.txt";
            VideoPath = "https://youtube.com/shorts/jv-hd1xpmPM?si=lTYLc35lcsOeNRkR";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Spinach") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Spinach.txt";
            VideoPath = "https://youtube.com/shorts/bLRFhIm_KTY?si=3QXtVwgtRJlKFDJ2";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Sweet Potato") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Ground Nuts.txt";
            VideoPath = "https://youtube.com/shorts/lQx2vQS7D7Q?si=072wF5RQOEoWOLJb";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Okra") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Okra.txt";
            VideoPath = "https://youtu.be/BEPIRr-UoXE?si=RVf7maICdaleNsHl";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Corn") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Corn.txt";
            VideoPath = "https://youtu.be/KL8dUiahgj0?si=kiD5hXpJXIWPre9B";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Carrot") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Carrot.txt";
            VideoPath = "https://youtu.be/4HotVKWPDTk?si=afdBUt0ivx2AKep2";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Legumes") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Legumes.txt";
            VideoPath = "https://youtube.com/shorts/oFvPutjjNX0?si=7pn3xFePijLooOtF";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Mustard Greens") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Mustard Greens.txt";
            VideoPath = "https://youtu.be/pL2dtrhEjlE?si=Vnb8aZ00fBeh61Uy";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Lettuce") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Lettuce.txt";
            VideoPath = "https://youtu.be/yHpLi_TTn1A?si=7ESA9f8uUOWtgldh";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Barley") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Barley.txt";
            VideoPath = "https://youtu.be/jiB79tr2pXA?si=yAM30wjc9wc43Xyq";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        } else if (s == "Cabbage") {
            System.out.println(s);
            path = "CSVFILES/ZishanFiles/ZishanCSVFILES/Cabbage.txt";
            VideoPath = "https://youtu.be/yMJNXQo1Mvs?si=acJmcwU3lh-L3N72";
            // imageView.setImage(new Image(getClass().getResourceAsStream("/Photos/img.png")));
            intercroppingProcedureLabel.setText(read(path));

        }


    }

    @FXML
    void OnVideoLinkclk(ActionEvent event) throws IOException {
        VideoController vc = new VideoController();
        System.out.println(VideoPath);
        vc.showweb(VideoPath);
    }


    public String read(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @FXML
    void onBtnClk(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/cropPlanning.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identyfy!");
        stage.setScene(scene);
        stage.show();
    }
}
