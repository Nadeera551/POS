package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import netscape.security.UserTarget;

import java.io.IOException;

public class LoginFormController {

    public AnchorPane loginFormContext;

    public void login(ActionEvent actionEvent) throws IOException {
        Stage stage =(Stage)  loginFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoardForm.fxml"))));
    }
}
