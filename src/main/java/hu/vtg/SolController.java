package hu.vtg;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
public class SolController {

    @FXML
    void backButton(ActionEvent event) throws IOException {
        App.setRoot("MainFrame");
    }
    @FXML
    void initialize(){
        
    }
}
