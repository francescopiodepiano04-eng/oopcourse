/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinputconfirmmvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author angel
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        /*
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });*/
        
        MyInputConfirmView view = new MyInputConfirmView();
        //non è necessario istanziare il controller, farà tutto da solo
        MyInputConfirmController controller = new MyInputConfirmController(view);
        
        Scene scene = new Scene(view, 400, 300);
        
        primaryStage.setTitle("My Input Confirm");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
