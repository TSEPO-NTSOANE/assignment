package com.mycompany.assignmentinteraction;

import java.io.IOException;
import java.util.HashMap;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
       
    }
       private HashMap<String, Color[]> flagColorsMap = new HashMap<>();
    Rectangle flagRectangle = new Rectangle(200, 100);
    
    @FXML
    private Button Lesotho;
    
    @FXML
    private Button Germany;
    
    @FXML
    private Button India;
    
    @FXML
    private Button France;
    
    @FXML
    private Button Belgium;
    
    @FXML
    private VBox CountryFlags;
    
    @FXML
    private Rectangle Lesotho1;
    
    @FXML
    private Rectangle Lesotho2;
    
    @FXML
    private Rectangle Lesotho3;

    @FXML
    private void switchToSecondary() throws IOException {   
    }
}
