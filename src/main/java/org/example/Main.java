
package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {

        Button button1 = new Button("haz clic aqui");//se crea el boton

        Scene scene = new Scene(button1, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
        //se crea la escena que es donde va el boton, se asigna a la ventana y se hace visible
    }

    public static void main(String[] args) {
        launch(args);//metodo de la clase application para arrancar el programa
    }
}
