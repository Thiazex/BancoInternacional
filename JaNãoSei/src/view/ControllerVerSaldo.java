package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import module.ContaBancaria;
import module.ContaCorrente;

import java.awt.event.ActionEvent;

public class ControllerVerSaldo {


    @FXML
    private Button ButtonVoltar;

    @FXML
    private Text TextSaldo;

    @FXML
    private Button ButtonRevelarSaldo;

    public void voltarSaldo(javafx.event.ActionEvent actionEvent) throws  Exception{
        Stage stage1 = (Stage) ButtonVoltar.getScene().getWindow();
        stage1.close();

        FXMLLoader load = new FXMLLoader(this.getClass().getResource("principal.fxml"));
        Parent root = load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void revelarSaldo(javafx.event.ActionEvent actionEvent) throws Exception{
        ContaBancaria cb = new ContaCorrente(100.0);
        TextSaldo.setText(cb.getValorEmConta().toString());
    }


}

