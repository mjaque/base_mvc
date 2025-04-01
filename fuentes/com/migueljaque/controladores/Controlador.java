package com.migueljaque.controladores;

import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public abstract class Controlador{

	private static final String PATH_VISTAS = "../vistas/";

	protected Scene cargarVista(Controlador controlador, String nombre){
		Scene vista = null;
	   	try{
        	FXMLLoader fxmlLoader = new FXMLLoader(ControladorPrincipal.class.getResource(PATH_VISTAS + nombre + ".fxml"));
        	fxmlLoader.setController(controlador);
        	Parent raiz = fxmlLoader.load();
			vista = new Scene(raiz);
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("ERROR FATAL. No se encuentra la vista " + nombre + ".");
			System.exit(-1);
		}
        return vista;
	}

}
