/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytemperatureconverter1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author angel
 */
public class MyTemperatureConverter extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        MyTemperatureConverterView view = new MyTemperatureConverterView();
        MyTemperatureConverterController controller = new MyTemperatureConverterController(view);

        primaryStage.setTitle("My Temperature Converter");
        primaryStage.setScene(new Scene(view, 325, 325));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
