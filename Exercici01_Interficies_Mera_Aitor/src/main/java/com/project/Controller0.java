package com.project;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller0 implements Initializable {

    @FXML
    private TextField fieldNom, fieldEdat;

    @FXML
    private Button buttonSeguent;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fieldNom.textProperty().addListener((observable, oldValue, newValue) -> {
            updateButton();
        });
        fieldEdat.textProperty().addListener((observable, oldValue, newValue) -> {
            updateButton();
        });
        updateButton();
    }

    private void updateButton() {
        boolean buit = fieldNom.getText().isBlank() || fieldEdat.getText().isBlank();
        buttonSeguent.setDisable(buit);
    }

    @FXML
    private void toView1(ActionEvent event) {
        Main.nom = fieldNom.getText();
        Main.edat = fieldEdat.getText();

        Controller1 ctrl1 = (Controller1) UtilsViews.getController("View1");
        ctrl1.showData();

        UtilsViews.setView("View1");
    }
}
