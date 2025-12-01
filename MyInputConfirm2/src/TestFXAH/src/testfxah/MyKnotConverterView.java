/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfxah;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author laywork
 */
//solo attributi di tipo label o textfield
//contiene solo l'organizzazione degli elementi grafici e gli attributi che consentono al controller di fare il suo lavoro
public class MyKnotConverterView extends HBox {
    //l'importanza dell'incapsulamento è relativa perchè la funzionalità degli oggetti grafici non cambierà
    public TextField input;
    public Label display;
    
    public MyKnotConverterView(){
        super();
        
        initComponents();
    }
    
    private void initComponents(){
        input = new TextField();
        display = new Label();
        
        Label symbols = new Label();
        
        symbols.setText("km/h --> kts");
        
        input.setPrefColumnCount(7);
        
        
        this.getChildren().addAll(input, symbols, display);
       
        this.setSpacing(10);
        
        this.setAlignment(Pos.CENTER);
    }
    
}