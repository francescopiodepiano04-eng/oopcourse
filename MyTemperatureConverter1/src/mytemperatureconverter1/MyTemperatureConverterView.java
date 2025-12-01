/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytemperatureconverter1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

/**
 *
 * @author angel
 */
public class MyTemperatureConverterView extends VBox{
    Label lb;
    Label input;
    TextField tf;
    Label result;
    CheckBox ch;
    
    public MyTemperatureConverterView(){
        super();
        
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
        this.setPadding(new Insets(20));
        
        HBox hb1 = new HBox();
        hb1.getChildren().addAll(input, tf);
        hb1.setAlignment(Pos.CENTER);
        hb1.setSpacing(10);
        hb1.setPadding(new Insets(20));
        
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(new Label("Result"), result);
        hb2.setAlignment(Pos.CENTER);
        hb2.setSpacing(10);
        hb2.setPadding(new Insets(20));
        
        ch = new CheckBox("<---->");
        this.getChildren().addAll(lb, hb1, hb2, ch);
    }
    
}
