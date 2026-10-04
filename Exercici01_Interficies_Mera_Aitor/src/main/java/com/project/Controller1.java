package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller1 {

    @FXML
    private Text textSalutacio;

    public void showData() {
        textSalutacio.setText("Hola " + Main.nom + ", tens " + Main.edat + " anys!");
    }

    @FXML
    private void toView0(ActionEvent event) {
        UtilsViews.setView("View0");
    }
}
