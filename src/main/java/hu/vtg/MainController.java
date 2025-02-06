package hu.vtg;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void AboutBtn(ActionEvent event) throws IOException {
        App.setRoot("About");
    }

    @FXML
    void ExitBtn(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void SolBtn(ActionEvent event) throws IOException {
        App.setRoot("Sol");
    }

}


