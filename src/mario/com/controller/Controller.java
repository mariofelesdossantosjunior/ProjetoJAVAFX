package mario.com.controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import mario.com.model.Cliente;
import mario.com.util.DataLoader;

public class Controller {

    public TableView <Cliente> table;

    @FXML
    private void initialize() throws Exception {
        table.setItems(FXCollections.observableArrayList(DataLoader.load()));
    }

    public void exit() {
        Platform.exit();
    }
}
