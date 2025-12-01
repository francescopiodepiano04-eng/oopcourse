/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystudentlistah;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author lucagreco
 */
public class MyStudentListViewController implements Initializable {
    
    
    @FXML
    private TextField nameField;
    @FXML
    private TextField surnameField;
    @FXML
    private TextField codeField;
    @FXML
    private Button addButton;
    @FXML
    private Button removeButton;
    @FXML
    private MenuItem saveButton;
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> nameClm;
    @FXML
    private TableColumn<Student, String> surnameClm;
    @FXML
    private TableColumn<Student, String> codeClm;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        
    }    

    @FXML
    private void addStudent(ActionEvent event) {
        
    }

    @FXML
    private void removeStudent(ActionEvent event) {
        
    }

    @FXML
    private void openFile(ActionEvent event) {
    }

    @FXML
    private void saveFile(ActionEvent event) {
    }

    @FXML
    private void exitApp(ActionEvent event) {
    }
    
}
