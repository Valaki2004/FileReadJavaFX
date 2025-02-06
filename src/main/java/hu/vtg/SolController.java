package hu.vtg;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SolController {

    @FXML
    private TableColumn<Termes,Integer> Amount;

    @FXML
    private TableColumn<Termes,LocalDate> HarvestEnd;

    @FXML
    private TableColumn<Termes,Integer> Id;

    @FXML
    private TableColumn<Termes,String> Name;

    @FXML
    private TableColumn<Termes,String> Place;

    @FXML
    private TableView<Termes> Table;

    @FXML
    void backButton(ActionEvent event) throws IOException {
        App.setRoot("MainFrame");
    }
    @FXML
    void initialize(){
        Reader reader = new Reader();
        
        ArrayList<Termes>termeslist = reader.readFile();
        ObservableList<Termes> termekek = FXCollections.observableArrayList(termeslist);

        this.Id.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.Name.setCellValueFactory(new PropertyValueFactory<>("Nev"));
        this.Place.setCellValueFactory(new PropertyValueFactory<>("Dulo"));        
        this.Amount.setCellValueFactory(new PropertyValueFactory<>("Mennyiseg"));
        this.HarvestEnd.setCellValueFactory(new PropertyValueFactory<>("BetakaritasVege"));
        this.Table.getItems().addAll(termekek); 
    }
}
