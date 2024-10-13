package com.example.demo4.ZishanJavaClass;

import com.example.demo4.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class cropPlanningController {

    static String PathVideoRice;
    static String PathHyperlinkRice;
    static String PathVideoJute;
    static String PathHyperlinkJute;
    static Image img1;
    static Image img2;


    @FXML
    Label season;
    @FXML
    Label soilQuality;
    @FXML
    Label frst;
    @FXML
    Label Sec;


    @FXML
    Hyperlink name1;
    @FXML
    Hyperlink name2;

    @FXML
    ImageView imageView1;
    @FXML
    ImageView imageView2;

    static String interCroping1;
    static String interCroping2;

    static String MCrop;



    @FXML
    public void playvideo(String path) throws IOException {
        ZishanvideoController wc=new ZishanvideoController();

        wc.showweb(path);


    }



    public void openFx(FXMLLoader fxmlLoader,ActionEvent event) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cropPlanning.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identify!");
        stage.setScene(scene);
        stage.show();
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


    public void monsoonSandySoil(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/cropPlanning.fxml"));
        openFx(fxmlLoader,event);
        cropPlanningController controller= fxmlLoader.getController();
       PathVideoRice="https://www.youtube.com/watch?v=qHIKRwYe3Cs";
        PathHyperlinkRice="/com/example/demo4/ZishanResources/Zishanhtmll/T.html";
        PathVideoJute="https://www.youtube.com/watch?v=P-PrAS--qGA";
        PathHyperlinkJute="/com/example/demo4/ZishanResources/Zishanhtmll/jute.html";




        controller.imageView1.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_1.png")));
        controller.imageView2.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_2.png")));


        controller.name1.setText("Rice");
        controller.name2.setText("Jute");



        controller.season.setText("Monsoon");
        controller.soilQuality.setText("Sandy soil");

        controller.frst.setText(read("CSVFILES/ZishanFiles/Summary info/RiceSummary.txt"));
        controller.Sec.setText(read("CSVFILES/ZishanFiles/Summary info/jutesummary.txt"));

        //initialize intercroping
        interCroping1="Rice";
        interCroping2="Jute";


    }





    public void monsoonClaySoil(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/cropPlanning.fxml"));
        openFx(fxmlLoader,event);
        cropPlanningController controller= fxmlLoader.getController();
        PathVideoRice="https://www.youtube.com/watch?v=qHIKRwYe3Cs";
        PathHyperlinkRice="/com/example/demo4/ZishanResources/Zishanhtmll/T.html";
        PathVideoJute="https://www.youtube.com/watch?v=l_wX9pdDfkA";
        PathHyperlinkJute="/com/example/demo4/ZishanResources/Zishanhtmll/taro.html";




        controller.imageView1.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_1.png")));
        controller.imageView2.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_3.png")));


        controller.name1.setText("Rice");
        controller.name2.setText("Taro");



        controller.season.setText("Monsoon");
        controller.soilQuality.setText("Clay soil");

        controller.frst.setText(read("CSVFILES/ZishanFiles/Summary info/RiceSummary.txt"));
        controller.Sec.setText(read("CSVFILES/ZishanFiles/Summary info/taro.txt"));

        interCroping1="Rice";
        interCroping2="Taro";


    }

    public void summerSandySoil(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/cropPlanning.fxml"));
        openFx(fxmlLoader,event);
        cropPlanningController controller= fxmlLoader.getController();
        PathVideoRice="https://www.youtube.com/watch?v=O0KSZn5QuX0";
        PathHyperlinkRice="/com/example/demo4/ZishanResources/Zishanhtmll/corn.html";
        PathVideoJute="https://www.youtube.com/watch?v=hs24iV8DA1U";
        PathHyperlinkJute="/com/example/demo4/ZishanResources/Zishanhtmll/groundnuts.html";




        controller.imageView1.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_5.png")));
        controller.imageView2.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_4.png")));


        controller.name1.setText("Corn");
        controller.name2.setText("Groundnuts");



        controller.season.setText("Summer");
        controller.soilQuality.setText("Sandy soil");

        controller.frst.setText(read("CSVFILES/ZishanFiles/Summary info/corn.txt"));
        controller.Sec.setText(read("CSVFILES/ZishanFiles/Summary info/groundnut.txt"));

        interCroping1="Corn";
        interCroping2="Groundnuts";

    }
    public void summerClaySoil(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/cropPlanning.fxml"));
        openFx(fxmlLoader,event);
        cropPlanningController controller= fxmlLoader.getController();
        PathVideoRice="https://www.youtube.com/watch?v=JpOtTh2z5CA";
        PathHyperlinkRice="/com/example/demo4/ZishanResources/Zishanhtmll/lentils.html";
        PathVideoJute="https://www.youtube.com/watch?v=vXVSw7wTsso";
        PathHyperlinkJute="/com/example/demo4/ZishanResources/Zishanhtmll/Sweet POtato.html";




        controller.imageView1.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_6.png")));
        controller.imageView2.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_7.png")));


        controller.name1.setText("Lentils");
        controller.name2.setText("Sweet Potato");



        controller.season.setText("Summer");
        controller.soilQuality.setText("Clay Soil");

        controller.frst.setText(read("CSVFILES/ZishanFiles/Summary info/lentils.txt"));
        controller.Sec.setText(read("CSVFILES/ZishanFiles/Summary info/sweetpotato.txt"));
        interCroping1="Lentils";
        interCroping2="SweetPotato";

    }
    public void winterLoamySoil(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/cropPlanning.fxml"));
        openFx(fxmlLoader,event);
        cropPlanningController controller= fxmlLoader.getController();
        PathVideoRice="https://www.youtube.com/watch?v=Lzvld_ict9g";
        PathHyperlinkRice="/com/example/demo4/ZishanResources/Zishanhtmll/wheat.html";
        PathVideoJute="https://www.youtube.com/watch?v=WJN6ZVV4LCo";
        PathHyperlinkJute="/com/example/demo4/ZishanResources/Zishanhtmll/carrot.html";




        controller.imageView1.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_8.png")));
        controller.imageView2.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_9.png")));


        controller.name1.setText("Wheat");
        controller.name2.setText("Carrot");



        controller.season.setText("Winter");
        controller.soilQuality.setText("Loamy soil");

        controller.frst.setText(read("CSVFILES/ZishanFiles/Summary info/wheat.txt"));
        controller.Sec.setText(read("CSVFILES/ZishanFiles/Summary info/carrot.txt"));

        interCroping1="Wheat";
        interCroping2="Carrot";

    }
    public void winterClaySoil(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/cropPlanning.fxml"));
        openFx(fxmlLoader,event);
        cropPlanningController controller= fxmlLoader.getController();
        PathVideoRice="https://www.youtube.com/watch?v=ghBI0Kv7yWI";
        PathHyperlinkRice="/com/example/demo4/ZishanResources/Zishanhtmll/mustard.html";
        PathVideoJute="https://www.youtube.com/watch?v=ubY_gUm5VA8";
        PathHyperlinkJute="/com/example/demo4/ZishanResources/Zishanhtmll/spinach.html";




        controller.imageView1.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_10.png")));
        controller.imageView2.setImage(new Image(getClass().getResourceAsStream("/com/example/demo4/ZishanResources/Image rice and jute/img_11.png")));


        controller.name1.setText("Mustard");
        controller.name2.setText("Spinach");



        controller.season.setText("Winter");
        controller.soilQuality.setText("Clay soil");

        controller.frst.setText(read("CSVFILES/ZishanFiles/Summary info/mustard.txt"));
        controller.Sec.setText(read("CSVFILES/ZishanFiles/Summary info/spinach.txt"));
        interCroping1="Mustard";
        interCroping2="Spinach";

    }
    @FXML
    public void name1clk(ActionEvent event) throws IOException {
        playvideo(PathHyperlinkRice);
    }
    @FXML
    public void onimg1clk()throws IOException
    {
        playvideo('v'+PathVideoRice);
    }
    @FXML
    public void name2clk(ActionEvent event) throws IOException {
        playvideo(PathHyperlinkJute);
    }
    @FXML
    public void onimg2clk()throws IOException
    {
        playvideo('v'+PathVideoJute);
    }

    @FXML
    void interCropingBtn1(ActionEvent event) throws IOException {
        //btn1 true
        MCrop=interCroping1;


        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/Intercropping.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identify!");
        stage.setScene(scene);
        stage.show();
    }
    @FXML

    void interCropingBtn2(ActionEvent event) throws IOException {

        MCrop=interCroping2;

        //btn2 true
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/Intercropping.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identify!");
        stage.setScene(scene);
        stage.show();
    }


    static public  String getMainCrop(){
        return MCrop;
    }




    @FXML
    public void onbackbtnclk(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ZishanResources/selectSeassonAndSand.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identify!");
        stage.setScene(scene);
        stage.show();
    }



}
