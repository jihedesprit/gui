module com.example.greenshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.greenshop to javafx.fxml;
    exports com.example.greenshop;
    exports com.example.greenshop.controller;
    opens com.example.greenshop.controller to javafx.fxml;
}