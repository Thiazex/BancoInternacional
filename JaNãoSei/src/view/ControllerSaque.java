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
import module.ContaPoupança;

public class ControllerSaque{





    @FXML
    private Button ButtonConfirmarSaque;

    @FXML
    private TextField TextFieldSaque;

    @FXML
    private Button ButtonVoltarSaque;




    public void voltarSaque(javafx.event.ActionEvent actionEvent) throws Exception{

        Stage stage1 = (Stage) ButtonVoltarSaque.getScene().getWindow();
        stage1.close();

        FXMLLoader load = new FXMLLoader(this.getClass().getResource("principal.fxml"));
        Parent root = load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void confirmarSaque(javafx.event.ActionEvent actionEvent) throws  Exception{
        ContaBancaria cb = new ContaCorrente(100.0);

        if(cb.getValorEmConta()-Double.parseDouble(TextFieldSaque.getText()) > 0.0) {
            cb.setValorEmConta(cb.getValorEmConta() - Double.parseDouble(TextFieldSaque.getText()));
        }else{
            System.out.println("Você não tem essa quantia para saque!");
        }

        Stage stage1 = (Stage) ButtonConfirmarSaque.getScene().getWindow();
        stage1.close();

        FXMLLoader load = new FXMLLoader(this.getClass().getResource("principal.fxml"));
        Parent root = load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
