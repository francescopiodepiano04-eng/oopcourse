/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinputconfirm;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MyInputConfirm extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TextField tfd1 = new TextField();
        TextField tfd2 = new TextField();
        Label lb1 = new Label();
        Label lb2 = new Label();
        Button btn = new Button();
        btn.setText("Ok");
        lb1.setText("input: ");
        lb2.setText("confirm input: ");
        
         
        btn.disableProperty().bind(tfd1.textProperty().isNotEqualTo(tfd2.textProperty()).or(tfd1.textProperty().isEmpty()));
        
        btn.setOnAction((event) -> { buttonAction();});
       
        
        VBox root = new VBox();
        HBox r1 = new HBox();
        HBox r2 = new HBox();
        r1.getChildren().addAll(lb1, tfd1);
        r2.getChildren().addAll(lb2, tfd2);
        root.getChildren().addAll(r1, r2, btn);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        r1.setAlignment(Pos.CENTER);
        r1.setSpacing(62);
        r2.setAlignment(Pos.CENTER);
        r2.setSpacing(10);
        root.setPadding(new Insets(20));
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("InputConfirm");
        primaryStage.setScene(scene);
        primaryStage.show();
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
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}