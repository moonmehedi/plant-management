package com.example.demo4.ArifJavaClass;

public class ReportData {
    private String name;
    private String addingDate;
    private String expDate;
    private String number;

    public String getName() {
        return name;
    }

    public String getAddingDate() {
        return addingDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getNumber() {
        return number;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddingDate(String addingDate) {
        this.addingDate = addingDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // toString (optional, for debugging)
    @Override
    public String toString() {
        return "ReportData{" +
                "name='" + name + '\'' +
                ", addingDate='" + addingDate + '\'' +
                ", expDate='" + expDate + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
