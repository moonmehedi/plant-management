package com.example.demo4.ArifJavaClass;

import com.example.demo4.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class InventController {

    private static final String CSV_FILE_PATH = "CSVFILES/ArifCSVFiles/project.csv"; // Path for the CSV file
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private int serialNumber = 1; // Counter for the serial numbers

    @FXML
    private DatePicker adddate; // DatePicker for the adding date

    @FXML
    private DatePicker exdate; // DatePicker for the expiration date

    @FXML
    private TextField item; // TextField for item name

    @FXML
    private TextField number; // TextField for the serial number

    @FXML
    private Button report; // Button for showing reports

    @FXML
    private Button submit; // Button for submitting the data

    @FXML
    public void initialize() {
        // Initialize the number field with the last serial number from CSV and make it non-editable
        int lastSerialNumber = readLastSerialNumber();
        serialNumber = lastSerialNumber + 1;
        number.setText(String.valueOf(serialNumber));
        number.setEditable(false);
    }

    private int readLastSerialNumber() {
        int lastNumber = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String lastLine = "";
            String line;
            while ((line = br.readLine()) != null) {
                lastLine = line;
            }
            if (!lastLine.isEmpty()) {
                String[] data = lastLine.split(",");
                if (data.length > 3) {
                    lastNumber = Integer.parseInt(data[3].trim());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lastNumber;
    }

    @FXML
    void handleReportShowButtonAction(ActionEvent event) {
        try {
            // Open the ReportApplication window
            Stage stage = new Stage();
            new ReportApplication().start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleSubmitButtonAction(ActionEvent event) {
        String itemName = item.getText();
        String addingDate = (adddate.getValue() != null) ? adddate.getValue().format(DATE_FORMATTER) : "";
        String expirationDate = (exdate.getValue() != null) ? exdate.getValue().format(DATE_FORMATTER) : "";
        String itemNumber = number.getText();
        item.clear();
        adddate.setValue(null);
        exdate.setValue(null);

        try (FileWriter fw = new FileWriter(CSV_FILE_PATH, true)) { // Append to the file
            fw.append(itemName + "," + addingDate + "," + expirationDate + "," + itemNumber + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        incrementSerialNumber(); // Increment the serial number after submission
    }

    private void incrementSerialNumber() {
        serialNumber++;
        number.setText(String.valueOf(serialNumber));
    }

    @FXML
    void gdate(ActionEvent event) {

    }

    @FXML
    void gexp(ActionEvent event) {

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
