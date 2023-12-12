package com.example.greenshop.controller;

import com.example.greenshop.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class AppController {
    @FXML
    BorderPane contentPane;
    public void closeApp(){
        HelloApplication.getWindow().close();
    }
    public void showHomeView(){
        contentPane.setCenter(new Label("Home"));
    }
    public void showCartView(){
        contentPane.setCenter(new Label("Cart"));
    }

}
