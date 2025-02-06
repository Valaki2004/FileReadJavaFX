package hu.vtg;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
public class SolController {

    @FXML
    void backButton(ActionEvent event) throws IOException {
        App.setRoot("MainFrame");
    }
    @FXML
    void initialize(){
        Reader reader = new Reader();
        reader.readFile();
        ArrayList<Termes> termeslList = reader.readFile();
        for(Termes termes : termeslList){
            System.out.println(termes.nev);
        }        
    }
}
