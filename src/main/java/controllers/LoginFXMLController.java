/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Usuario;
import principal.App;

/**
 * FXML Controller class
 *
 * @author João Victor
 */
public class LoginFXMLController implements Initializable {

    @FXML
    private TextField textUsuario;
    @FXML
    private PasswordField textSenha;

    @FXML
    public void autenticar() throws IOException {
        String usuario = textUsuario.getText();
        String senha = textSenha.getText();
        Parent root = FXMLLoader.load(getClass().getResource("/viewFXML/home.fxml"));
        App.setRoot(root, 600, 544);
    }

    @FXML
    public void fechar() {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
