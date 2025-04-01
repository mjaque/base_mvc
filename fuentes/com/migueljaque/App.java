package com.migueljaque;

import javafx.application.Application;
import javafx.stage.Stage;
import com.migueljaque.controladores.*;
import java.io.IOException;

public class App extends Application{
	public static void main(String[] args){
		//Procesamos argumentos de entrada (si los hay).
		
		//Inicio de servicios no gráficos.
		
		//Iniciamos la aplicación gráfica.
		launch();
	}

	@Override
	public void start(Stage stage) throws IOException {
		new ControladorPrincipal(stage);
	}
}
