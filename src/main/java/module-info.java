module com.example.demo4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires com.dlsc.formsfx;
    requires jakarta.mail;

    opens com.example.demo4 to javafx.fxml;
    opens com.example.demo4.MoonJAVAClass to javafx.fxml;
    opens com.example.demo4.ArifJavaClass to javafx.fxml;
    opens com.example.demo4.ZishanJavaClass to javafx.fxml;
    exports com.example.demo4.MoonJAVAClass;
    exports com.example.demo4.ArifJavaClass;
    exports com.example.demo4.ZishanJavaClass;
    exports com.example.demo4;
}