package com.migueljaque.controladores;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.fxml.FXML;

import com.migueljaque.modelos.Modelo;

public class ControladorPrincipal extends Controlador{

	private Stage ventana;
	private Scene vista1;
	private Scene vista2;

	@FXML
	private Button boton1;	//El nombre debe coincidir con el identificador en FXML

	private Modelo modelo;

	public ControladorPrincipal(Stage ventana){
		super();

		this.modelo = new Modelo();

		this.ventana = ventana;

		//Cargamos las vistas del Controlador
		vista1 = cargarVista(this, "vista1");
		vista2 = cargarVista(this, "vista2");

		//Componemos la vista
		HBox raizVista1 = (HBox) vista1.getRoot();
		VBox raizVista2 = (VBox) vista2.getRoot();
		raizVista1.getChildren().add(raizVista2);

		capturarEventos();

		//Instanaciamos otros controladores (si los hay)

		//Iniciamos la vista principal       
        ventana.setScene(vista1); //Cargamos la vista principal
		ventana.setTitle("Ventana 1");
        ventana.show();
	}

	private void capturarEventos(){
		//Utilizamos funciones lambda para implementar anónimamente EventHandlers
		//Captura de teclado
		vista1.addEventFilter(KeyEvent.KEY_PRESSED, evento -> {
			System.out.println(evento);
			System.out.println("1. Se ha pulsado la tecla " + evento.getCode());
		});
		vista1.setOnKeyPressed(evento -> {
			System.out.println(evento);
			System.out.println("2. Se ha pulsado la tecla " + evento.getCode());
		});
		//Captura de click
		boton1.setOnAction(evento -> {
			System.out.println(evento);
			System.out.println("Se ha pulsado el botón 1.");
		});
		//Movimiento de ratón
		boton1.setOnMouseEntered(evento -> {
			System.out.println(evento);
			System.out.println("El ratón entra en el botón.");
		});
	}
}
