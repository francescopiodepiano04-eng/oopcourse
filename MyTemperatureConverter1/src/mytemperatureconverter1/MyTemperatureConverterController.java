/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytemperatureconverter1;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.util.StringConverter;

/**
 *
 * @author angel
 */
public class MyTemperatureConverterController {
    MyTemperatureConverterView view;
    SimpleStringProperty fahrString;
    SimpleStringProperty celsiusString;
    
    public MyTemperatureConverterController(MyTemperatureConverterView view){
        this.view = view;
        fahrString = new SimpleStringProperty("");
        celsiusString = new SimpleStringProperty("");
        bindMode();
        bindInput();
        bindConversion();
        bindResult();
    }
    
    
    
    public void bindMode(){
        view.lb.textProperty().bind(Bindings.when(view.ch.selectedProperty()).then("Fahr to Celsius").otherwise("Celsius to Fahr"));
    }
    
    public void bindInput() {
        Bindings.bindBidirectional(celsiusString, fahrString, new StringConverter<String>() {
            
            @Override
            public String toString(String object) {
                try {
                    return Float.toString((Float.valueOf(object) - 32) * 5 / 9);
                } catch (NumberFormatException ex) {
                    return "";
                }
            }

            
            @Override
            public String fromString(String string) {
                try {
                    return Float.toString(Float.valueOf(string) * 9 / 5 + 32);
                } catch (NumberFormatException ex) {
                    return "";
                }
            }
        });
    }
    
    public void bindConversion(){
        celsiusString.bind(view.tf.textProperty());
        view.ch.setOnAction(event -> {
            if (view.ch.isSelected()) {
                celsiusString.unbind();
                fahrString.bind(view.tf.textProperty());
            } else {
                fahrString.unbind();
                celsiusString.bind(view.tf.textProperty());
            }
        });
    }
    
    public void bindResult(){
        view.lb.textProperty().bind(Bindings.when(view.ch.selectedProperty()).then(celsiusString).otherwise(fahrString));
    }
}
