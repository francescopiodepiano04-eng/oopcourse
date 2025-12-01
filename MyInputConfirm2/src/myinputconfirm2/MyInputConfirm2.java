/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinputconfirm2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author angel
 */
public class MyInputConfirm2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Ok");
        Label lb1 = new Label();
        Label lb2 = new Label();
        TextField tfd1 = new TextField();
        TextField tfd2 = new TextField();
        lb1.setText("input: ");
        lb2.setText("confirm input: ");
        btn.disableProperty().bind(tfd1.textProperty().isNotEqualTo(tfd2.textProperty()).or(tfd2.textProperty().isEmpty()));
        
        
        btn.setOnAction((ActionEvent event) -> {
            buttonAction();
        });
        
        GridPane root = new GridPane();
        GridPane.setConstraints(lb1, 0, 0);
        GridPane.setConstraints(tfd1, 1, 0);
        GridPane.setConstraints(lb2, 0, 1);
        GridPane.setConstraints(tfd2, 1, 1);
        GridPane.setConstraints(btn, 1, 2);
        root.getChildren().addAll(lb1, tfd1, lb2, tfd2, btn);
        GridPane.setMargin(lb1, new Insets(5));
        GridPane.setMargin(lb2, new Insets(5));
        GridPane.setMargin(tfd1, new Insets(5));
        GridPane.setMargin(tfd2, new Insets(5));
        GridPane.setMargin(btn, new Insets(5));
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Confirm Input");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void buttonAction(){
        System.out.println("Input confermato.");
        Stage window = new Stage();
        window.setTitle("Confirmation");
        
        Label msg = new Label();
        StackPane second = new StackPane(msg);
        second.setPadding(new Insets(20));
        
        Scene seconds = new Scene(second, 250, 150);
        window.setScene(seconds);
        window.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
