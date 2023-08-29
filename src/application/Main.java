package application;


import java.io.IOException;

import controller.CrearCita;
import controller.HistoriaClinica;
import controller.InicioController;
import controller.RegistrarClienteController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Clinica;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends javafx.application.Application {

	Stage stage;

	 @Override
	    public void start(Stage primaryStage) throws IOException {

		 this.stage=primaryStage;
		 mostrarVentanaClientelogin();


	    }

	 public void mostrarVentanaClientelogin() {
	        try {
	            stage.close();
	            stage = new Stage();
	            //Loader lee cada línea de código y la vuelve objetos en memoria
	            FXMLLoader loader = new FXMLLoader();
	            //Dirección del paquete donde está la interfaz
	            loader.setLocation(Main.class.getResource("../view/Inicio.fxml"));
	            AnchorPane rootLayout = loader.load();
	            //Carga los controladores
	           InicioController controller = loader.getController();//Obtenemos el controlador
	            controller.setApplication(this);
	            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
	            // de cambiar de ventana con escape
	            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
	            stage.show();//Muestra el escenario principal
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	    }

	 public void mostrarRegistroCliente(){

		 try {
	            stage.close();
	            stage = new Stage();
	            //Loader lee cada línea de código y la vuelve objetos en memoria
	            FXMLLoader loader = new FXMLLoader();
	            //Dirección del paquete donde está la interfaz
	            loader.setLocation(Main.class.getResource("../view/RegistrarCliente.fxml"));
	            AnchorPane rootLayout = loader.load();
	            //Carga los controladores
	           RegistrarClienteController controller = loader.getController();//Obtenemos el controlador
	            controller.setApplication(this);
	            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
	            // de cambiar de ventana con escape
	            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
	            stage.show();//Muestra el escenario principal
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	 }
	 
	 public void mostrarCrearCita(){

		 try {
	            stage.close();
	            stage = new Stage();
	            //Loader lee cada línea de código y la vuelve objetos en memoria
	            FXMLLoader loader = new FXMLLoader();
	            //Dirección del paquete donde está la interfaz
	            loader.setLocation(Main.class.getResource("../view/CrearCita.fxml"));
	            AnchorPane rootLayout = loader.load();
	            //Carga los controladores
	           CrearCita controller = loader.getController();//Obtenemos el controlador
	            controller.setApplication(this);
	            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
	            // de cambiar de ventana con escape
	            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
	            stage.show();//Muestra el escenario principal
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	 }
	 
	 public void mostrarHistoriaClinica(){

		 try {
	            stage.close();
	            stage = new Stage();
	            //Loader lee cada línea de código y la vuelve objetos en memoria
	            FXMLLoader loader = new FXMLLoader();
	            //Dirección del paquete donde está la interfaz
	            loader.setLocation(Main.class.getResource("../view/HistoriaClinica.fxml"));
	            AnchorPane rootLayout = loader.load();
	            //Carga los controladores
	           HistoriaClinica controller = loader.getController();//Obtenemos el controlador
	            controller.setApplication(this);
	            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
	            // de cambiar de ventana con escape
	            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
	            stage.show();//Muestra el escenario principal
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	 }

	 
	 
	    public static void main(String[] args) {
	        launch(args);
	    }

		



}
