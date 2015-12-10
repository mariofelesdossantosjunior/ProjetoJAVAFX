package mario.com.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * Created by mario on 09/12/15.
 */
public class ControllerLogin{

    public TextField tfLogin;
    public PasswordField pfSenha;
    public Label retornoLogin;


    @FXML
    private void initialize() throws Exception {
        tfLogin.requestFocus();
    }

    public void entrar(ActionEvent actionEvent){
        if(tfLogin.getText().equals("mario") && pfSenha.getText().equals("123")){
            ((Node) actionEvent.getSource()).getScene().getWindow().hide();
            Parent parent = null;
            try {
                parent = FXMLLoader.load(getClass().getResource("view/principal.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(parent);
                stage.setScene(scene);
                stage.setTitle("Principal");
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            retornoLogin.setText("Login Inválido");
        }
    }
}
