package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import module.ContaBancaria;
import module.ContaCorrente;

public class ControllerDepositar {

    @FXML
    private Button ButtonConfirmarDeposito;

    @FXML
    private TextField TextFieldDeposito;

    @FXML
    private Button ButtonVoltarDeposito;


    public void confirmarDeposito(javafx.event.ActionEvent actionEvent) throws  Exception{
        ContaBancaria cb = new ContaCorrente(100.00);
        cb.setValorEmConta(cb.getValorEmConta()+Double.parseDouble(TextFieldDeposito.getText()));
        System.out.println("Deposito realizado com sucesso!!");

        Stage stage1 = (Stage) ButtonConfirmarDeposito.getScene().getWindow();
        stage1.close();

        FXMLLoader load = new FXMLLoader(this.getClass().getResource("principal.fxml"));
        Parent root = load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void voltarDeposito(javafx.event.ActionEvent actionEvent) throws  Exception{
        Stage stage1 = (Stage) ButtonVoltarDeposito.getScene().getWindow();
        stage1.close();

        FXMLLoader load = new FXMLLoader(this.getClass().getResource("principal.fxml"));
        Parent root = load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
