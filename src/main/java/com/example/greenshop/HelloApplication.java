package com.example.greenshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class HelloApplication extends Application {
    private static Stage window;
    @Override
    public void start(Stage stage) throws IOException {
        URL file = new File("src/main/java/com/example/greenshop/cartui.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(file);
        stage.setTitle("shopping cart");
        stage.setScene(new Scene(root, Color.TRANSPARENT));
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
    public static Stage getWindow(){
        return window;
    }
}