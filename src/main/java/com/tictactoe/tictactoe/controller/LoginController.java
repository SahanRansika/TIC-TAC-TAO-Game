package com.tictactoe.tictactoe.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button btnPlay;

    @FXML
    private AnchorPane ancLogin;

    @FXML
    void btnPlayOnAction(ActionEvent event) throws IOException {
        ancLogin.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/BoardView.fxml"));
        ancLogin.getChildren().add(load);
    }

}
