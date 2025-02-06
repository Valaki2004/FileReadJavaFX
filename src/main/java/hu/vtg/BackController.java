package hu.vtg;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class BackController {

    @FXML
    void BackButton(ActionEvent event) throws IOException {
        App.setRoot("MainFrame");
    }

}
