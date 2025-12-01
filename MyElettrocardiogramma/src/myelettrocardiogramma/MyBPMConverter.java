/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myelettrocardiogramma;


import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;

/**
 *
 * @author angel
 */
public class MyBPMConverter extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       //interfaccia grafica
        TextField tfd = new TextField();
        tfd.setPrefColumnCount(5);
        
        Label display = new Label(); 
        
        Label symbol = new Label();
        
        symbol.setText("RR interval --> BPM");
        
        
        HBox root = new HBox();
        root.getChildren().addAll(tfd, symbol, display);
        
        root.setAlignment(Pos.CENTER);
        //root.setPadding(new Insets(30));
        root.setSpacing(15);
        
        root.setStyle("-fx-font: 16 Sans;");
        
        
        // Comportamenti
        
        DoubleProperty input = new SimpleDoubleProperty();
        
        StringConverter sc = new DoubleStringConverter();
        
        Bindings.bindBidirectional(tfd.textProperty(), input, sc);
        
        NumberBinding result = Bindings.divide(60,input);
        
        //display.textProperty().bind(result.asString("%.2f"));
        
        display.textProperty()
                .bind(Bindings.when(input.isNotEqualTo(0))
                        .then(result.asString("%.0f"))
                        .otherwise(""));
             
        
        
        Scene scene = new Scene(root, 450, 250);
        
        primaryStage.setTitle("MyBPMconverter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
