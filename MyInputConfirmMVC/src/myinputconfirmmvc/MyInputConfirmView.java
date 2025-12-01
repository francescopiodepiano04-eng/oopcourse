/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinputconfirmmvc;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author angel
 */
public class MyInputConfirmView extends VBox {
    public Label lb1;
    public TextField tf1;
    public Label lb2;
    public TextField tf2;
    public Button btn;
    
    
    public MyInputConfirmView() {
        super();
        
        initComponents();
    }
    
    private void initComponents(){
        lb1 = new Label();
        btn = new Button();
        lb2 = new Label();
        tf1 = new TextField();
        tf2 = new TextField();
        
        btn.setText("Ok");
        lb1.setText("input: ");
        lb2.setText("confirm input: ");
        
        //row1
        HBox row1 = new HBox();
        row1.getChildren().addAll(lb1, tf1);
        row1.setAlignment(Pos.CENTER);
        row1.setSpacing(62);
        
        
        //row2
        HBox row2 = new HBox();
        row2.getChildren().addAll(lb2, tf2);
        row2.setAlignment(Pos.CENTER);
        row2.setSpacing(10);
        
        
        //root
        
        this.getChildren().addAll(row1, row2, btn);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(20));
        
    }
}
