package com.example.demo4.ArifJavaClass;

import com.example.demo4.Start;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.*;
import java.util.List;
import java.util.Random;

public class ReportController {

    @FXML
    private TableView<ReportData> data;

    @FXML
    private TableColumn<ReportData, String> number;

    @FXML
    private TableColumn<ReportData, String> name;

    @FXML
    private TableColumn<ReportData, String> addingDate;

    @FXML
    private TableColumn<ReportData, String> expDate;

    @FXML
    private TableColumn<ReportData, Void> expDate1; // Remove column

    private ObservableList<ReportData> dataList = FXCollections.observableArrayList();

    public ReportController() {}

    public ReportController(TableView<ReportData> tableView, TableColumn<ReportData, String> number, TableColumn<ReportData, String> name, TableColumn<ReportData, String> addingDate, TableColumn<ReportData, String> expDate) {
        this.data = tableView;
        this.number = number;
        this.name = name;
        this.addingDate = addingDate;
        this.expDate = expDate;
    }

    @FXML
    public void initialize() {
        bindDataToTableColumns();
        setupRemoveColumn();
        dataList.addAll(readCSV());
        data.setItems(dataList);
    }

    private void bindDataToTableColumns() {
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        addingDate.setCellValueFactory(new PropertyValueFactory<>("addingDate"));
        expDate.setCellValueFactory(new PropertyValueFactory<>("expDate"));
    }

    private ObservableList<ReportData> readCSV() {
        ObservableList<ReportData> dataList = FXCollections.observableArrayList();
        String csvFile = "CSVFILES/ArifCSVFiles/project.csv"; // Update this path if necessary
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (data.length == 4) {
                    ReportData reportData = new ReportData();
                    reportData.setName(data[0].trim());
                    reportData.setAddingDate(data[1].trim());
                    reportData.setExpDate(data[2].trim());
                    reportData.setNumber(data[3].trim());
                    dataList.add(reportData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList;
    }

    private void setupRemoveColumn() {
        Callback<TableColumn<ReportData, Void>, TableCell<ReportData, Void>> cellFactory = new Callback<>() {
            @Override
            public TableCell<ReportData, Void> call(final TableColumn<ReportData, Void> param) {
                return new ButtonTableCell<>() {
                    final Button btn = new Button("Remove");

                    {
                        btn.setOnAction((event) -> {
                            ReportData reportData = getTableView().getItems().get(getIndex());
                            dataList.remove(reportData); // Removes the row from the observable list
                            writeCSV(dataList); // Save the updated list back to the CSV file
                        });
                        btn.setStyle("-fx-background-color: " + getRandomColor() + ";");
                    }

                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(btn);
                        }
                    }
                };
            }
        };

        expDate1.setCellFactory(cellFactory);
    }

    private void writeCSV(List<ReportData> dataList) {
        String csvFile = "CSVFILES/ArifCSVFiles/project.csv"; // Update this path if necessary

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (ReportData reportData : dataList) {
                bw.write(reportData.getName() + "," + reportData.getAddingDate() + "," + reportData.getExpDate() + "," + reportData.getNumber());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getRandomColor() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return String.format("#%02X%02X%02X", r, g, b);
    }

    public static class ButtonTableCell<T> extends TableCell<T, Void> {
        protected final Button btn;

        public ButtonTableCell() {
            this.btn = new Button();
            this.btn.setOnAction(createButtonEventHandler());
        }

        protected EventHandler<ActionEvent> createButtonEventHandler() {
            return event -> {
                // default implementation does nothing
            };
        }

        @Override
        protected void updateItem(Void item, boolean empty) {
            super.updateItem(item, empty);
            if (empty) {
                setGraphic(null);
            } else {
                setGraphic(btn);
            }
        }
    }

    @FXML
    void onBackBtnClk(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("/com/example/demo4/ArifResources/inventory.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("identyfy!");
        stage.setScene(scene);
        stage.show();
    }
}
