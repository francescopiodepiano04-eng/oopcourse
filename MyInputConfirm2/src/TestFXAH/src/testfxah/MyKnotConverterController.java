/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfxah;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;

/**
 *
 * @author laywork
 */
public class MyKnotConverterController {
    private MyKnotConverterView view;
    
    
    public MyKnotConverterController(MyKnotConverterView view){
        this.view = view;
        
        initBindings();
    }
    
    private void initBindings(){
        DoubleProperty inputValue = new SimpleDoubleProperty();
        
        StringConverter sc = new DoubleStringConverter();
        
        Bindings.bindBidirectional(view.input.textProperty(), inputValue, sc);
        
        NumberBinding outputValue = inputValue.divide(1.852);
        
        view.display.textProperty().bind(outputValue.asString("%.3f"));
    }
}