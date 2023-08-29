package controller;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class CrearCita {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgendarCita;

    @FXML
    private DatePicker dateCita;

    @FXML
    private TextField txtCedulaC;

    @FXML
    private TextField txtCodigoV;

    @FXML
    void agendarCita(ActionEvent event) {



    }

    @FXML
    void initialize() {


}

	public void setApplication(Main main) {
		// TODO Auto-generated method stub

	}
}
