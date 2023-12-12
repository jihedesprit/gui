package com.example.greenshop.home;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class HomeView {
    private Parent view;
    public HomeView() throws IOException {
        URL url = new File("src/main/java/com/example/greenshop/home/home.fxml").toURI().toURL();
        Parent root =FXMLLoader.load(url);
        this.view = root ;
    }
}
