/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfxah;

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


public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
       /* TextField input = new TextField();
        
        input.setPrefColumnCount(7);
        
        Label symbols = new Label();
        
        symbols.setText("km/h --> kts");
        
        Label display = new Label();
        
        display.setText("0.0");
        
        //effettuare tramite uno stringconverter il contenuto del textfield in una proprietà di tipo numerico che potrà partecipare in un binding numerico
        DoubleProperty inputValue = new SimpleDoubleProperty();
        
        //lo uso per effettuare la conversione
        StringConverter sc = new DoubleStringConverter();
        
        //vogliamo che la stringa di input diventi un osservabile double e non un tipo primitivo o wrapper
        Bindings.bindBidirectional(input.textProperty(), inputValue, sc);
        
        //operazione da fare sul binding numerico
        NumberBinding output = inputValue.divide(1.852);
        
        //prendere il risultato e convertirlo in una StringProperty
        display.textProperty().bind(output.asString("%.2f"));
        
        
        
        HBox root = new HBox();        
        root.getChildren().addAll(input, symbols, display);
        
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);*/
       
       
        MyKnotConverterView root = new MyKnotConverterView();
        //non è necessario istanziare il controller, farà tutto da solo
        new MyKnotConverterController(root);
        
        Scene scene = new Scene(root, 400, 300);
        
        primaryStage.setTitle("MySpeedConverter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}