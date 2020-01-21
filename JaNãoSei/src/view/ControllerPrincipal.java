package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;


import java.io.IOException;

public class ControllerPrincipal{

    @FXML
    private Button ButtonSaque;

    @FXML
    private Button ButtonDepositar;

    @FXML
    private Button ButtonVerSaldo;


    public void Sacar(javafx.event.ActionEvent actionEvent) throws Exception{


        Stage stage1 = (Stage) ButtonSaque.getScene().getWindow();
        stage1.close();

        FXMLLoader load = new FXMLLoader(this.getClass().getResource("saque.fxml"));
        Parent root = load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void Depositar(javafx.event.ActionEvent actionEvent) throws  Exception{
        Stage stage1 = (Stage) ButtonDepositar.getScene().getWindow();
        stage1.close();

        FXMLLoader load = new FXMLLoader(this.getClass().getResource("depositar.fxml"));
        Parent root = load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void verSaldo(javafx.event.ActionEvent actionEvent) throws  Exception{
        Stage stage1 = (Stage) ButtonVerSaldo.getScene().getWindow();
        stage1.close();

        FXMLLoader load = new FXMLLoader(this.getClass().getResource("verSaldo.fxml"));
        Parent root = load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
