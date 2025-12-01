/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinputconfirmmvc;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author angel
 */
public class MyInputConfirmController {
    MyInputConfirmView view;
    
    public MyInputConfirmController(MyInputConfirmView view){
        this.view=view;
        view.btn.setOnAction(event -> buttonAction());
        
        view.btn.disableProperty().bind(view.tf1.textProperty().isNotEqualTo(view.tf2.textProperty()).or(view.tf1.textProperty().isEmpty()));
    }
    
    private void buttonAction(){
        System.out.println("Input confermato.");
        Stage window = new Stage();
        window.setTitle("Confirmation");
        
        Label msg = new Label("Input confermato!");
        StackPane second = new StackPane(msg);
        second.setPadding(new Insets(20));
        
        Scene seconds = new Scene(second, 250, 150);
        window.setScene(seconds);
        window.show();
    }
}
