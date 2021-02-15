package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ProgramStart extends Application {

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/mainWiindow.fxml"));
        stage.setTitle("Product");
        stage.setScene(new Scene(parent));
//        stage.getIcons().add(new Image(""));
        stage.show();
    }
}
