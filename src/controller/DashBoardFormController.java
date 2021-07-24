package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class DashBoardFormController {
    public AnchorPane dashBoardContext;

    public void openCustomerForm(ActionEvent actionEvent) throws IOException {
        openUi("CustomerForm");
    }

    public void openItemForm(ActionEvent actionEvent) throws IOException {
        openUi("ItemForm");
    }

    public void openOrderForm(ActionEvent actionEvent) throws IOException {
        openUi("OrderForm");
    }

    public void openOrderDetailsForm(ActionEvent actionEvent) throws IOException {
        openUi("OrderDetailsForm");
    }
    void openUi(String fileName) throws IOException {
        Stage stage = (Stage)  dashBoardContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+fileName+".fxml"))));

    }
}
