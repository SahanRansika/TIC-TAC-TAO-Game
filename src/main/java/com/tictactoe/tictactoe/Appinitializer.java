package com.tictactoe.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Appinitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent load = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.setTitle("TIC-TAC-TAO");
        Image assest = new Image(getClass().getResourceAsStream("/view/assets/game2.png" ));
        stage.getIcons().add(assest);
        stage.setResizable(false);
        stage.show();
    }
}
