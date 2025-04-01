package com.migueljaque.controladores;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import com.migueljaque.modelos.Modelo;

public class ControladorPrincipal extends Controlador{

	private Stage ventana;
	private Scene vista1;
	private Scene vista2;

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

		//Instanaciamos otros controladores (si los hay)

		//Iniciamos la vista principal       
        ventana.setScene(vista1); //Cargamos la vista principal
		ventana.setTitle("Ventana 1");
        ventana.show();
	}
}
