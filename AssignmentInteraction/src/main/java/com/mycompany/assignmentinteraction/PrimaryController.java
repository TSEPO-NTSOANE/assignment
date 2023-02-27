package com.mycompany.assignmentinteraction;

import java.io.IOException;
import java.util.HashMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PrimaryController {
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
    private Rectangle Germany1;
    
    @FXML
    private Rectangle Germany2;
    
    @FXML
    private Rectangle Germany3;
    
    @FXML
    private Rectangle France1;
    
    @FXML
    private Rectangle France2;

    @FXML
    private Rectangle France3;
    
     @FXML
    private Rectangle India1;
     
    @FXML
    private Rectangle India2;
      
    @FXML
    private Rectangle India3;
    
    @FXML
    private Rectangle Belgium1;
    
    @FXML
    private Rectangle Belgium2;
    
    @FXML
    private Rectangle Belgium3;
    
    @FXML
    private Rectangle Defoult;
    
    @FXML
    private Rectangle Defoult1;
    
    @FXML
    private Rectangle Defoult2;
    
    @FXML
    private TextArea LesothoNews;
    
    @FXML
    private TextArea GermanyNews;
    
    @FXML
    private TextArea IndiaNews;
    
    @FXML
    private TextArea BelgiumNews;
    
    @FXML
    private TextArea FrancNews;
    
    private static final double BUTTON_HEIGHT = 100;
    
    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException {   
    }
    @FXML
    private void LesothoButton(){
     flagColorsMap.put("Lesotho", new Color[]{Color.RED, Color.WHITE, Color.BLUE});
     
     Lesotho1.setFill(Color.BLUE);
     Lesotho2.setFill(Color.WHITE);
     Lesotho3.setFill(Color.GREEN);
     
     Lesotho1.setVisible(true);
     Lesotho2.setVisible(true);
     Lesotho3.setVisible(true);
     
     Defoult.setVisible(false);
     Defoult1.setVisible(false);
     Defoult2.setVisible(false);
     
     Germany1.setVisible(false);
     Germany2.setVisible(false);
     Germany3.setVisible(false);
     
     France1.setVisible(false);
     France2.setVisible(false);
     France3.setVisible(false);
        
     India1.setVisible(false);
     India2.setVisible(false);
     India3.setVisible(false);
        
     Belgium1.setVisible(false);
     Belgium2.setVisible(false);
     Belgium3.setVisible(false);
     
     LesothoNews.setText("Lesotho is the landlocked country, It was found \n "
             + "by Moshoeshoe 1. It is the small country, and it \n its dependency on"
             + "04 October 1966 KHOTSO PULA NALA Chaba sa Thesele\n maapara kobo");
     
    }
    
    
    
    @FXML
    private void GermanyButton(ActionEvent event) throws IOException{

        flagColorsMap.put("Germany", new Color[]{Color.RED, Color.WHITE, Color.BLUE});
        
        Germany1.setFill(Color.BLACK);
        Germany2.setFill(Color.RED);
        Germany3.setFill(Color.YELLOW);
        
        Germany1.setVisible(true);
        Germany2.setVisible(true);
        Germany3.setVisible(true);
        
        
        Lesotho1.setVisible(false);
        Lesotho2.setVisible(false);
        Lesotho3.setVisible(false);
        
        Defoult.setVisible(false);
        Defoult1.setVisible(false);
        Defoult2.setVisible(false);
     
        France1.setVisible(false);
        France2.setVisible(false);
        France3.setVisible(false);
        
        India1.setVisible(false);
        India2.setVisible(false);
        India3.setVisible(false);
        
        Belgium1.setVisible(false);
        Belgium2.setVisible(false);
        Belgium3.setVisible(false);
        
        LesothoNews.setText("The Germani, German, or Germanic\n"
                + " tribes are now considered to be related \n"
                + "to the Jastorf culture before expanding and\n"
                + " interacting with the other peoples"
                 );
       
          
    }
    @FXML
    private void IndiaButton(ActionEvent event) throws IOException{
       
        flagColorsMap.put("India", new Color[]{Color.RED, Color.WHITE, Color.BLUE});
        
        India1.setFill(Color.ORANGE);
        India2.setFill(Color.WHITE);
        India3.setFill(Color.LAWNGREEN);
        
        Lesotho1.setVisible(false);
        Lesotho2.setVisible(false);
        Lesotho3.setVisible(false);
        
        France1.setVisible(false);
        France2.setVisible(false);
        France3.setVisible(false);
        
        Defoult.setVisible(false);
        Defoult1.setVisible(false);
        Defoult2.setVisible(false);
        
        Germany1.setVisible(false);
        Germany2.setVisible(false);
        Germany3.setVisible(false);
        
        Belgium1.setVisible(false);
        Belgium2.setVisible(false);
        Belgium3.setVisible(false);
        
        India1.setVisible(true);
        India2.setVisible(true);
        India3.setVisible(true);
        
        LesothoNews.setText("The mature Indus civilisation flourished\n"
                + " from about 2600 to 1900 BCE, marking the \n"
                + "beginning of urban civilisation on the\n"
                + " Indian subcontinent."
                 );
          
        
    }
    @FXML
    private void BelgiumButton(ActionEvent event) throws IOException{
       flagColorsMap.put("Belgium", new Color[]{Color.RED, Color.WHITE, Color.BLUE});
       
        Belgium1.setFill(Color.BLACK);
        Belgium2.setFill(Color.RED);
        Belgium3.setFill(Color.YELLOW);
       
        Lesotho1.setVisible(false);
        Lesotho2.setVisible(false);
        Lesotho3.setVisible(false);
        
        Defoult.setVisible(false);
        Defoult1.setVisible(false);
        Defoult2.setVisible(false);
        
        France1.setVisible(false);
        France2.setVisible(false);
        France3.setVisible(false);
        
        Germany1.setVisible(false);
        Germany2.setVisible(false);
        Germany3.setVisible(false);
        
        India1.setVisible(false);
        India2.setVisible(false);
        India3.setVisible(false);
        
        Belgium1.setVisible(true);
        Belgium2.setVisible(true);
        Belgium3.setVisible(true);
        
        LesothoNews.setText("Belgium became independent from\n"
                + " the Netherlands in 1830. It was occupied\n"
                + " by Germany during World Wars I and II.\n"
                + " The country prospered in the past half\n"
                + " century as a modern, technologically-advanced\n"
                + " European state and a member of NATO and the EU."
                 );
          
    }
    @FXML
    private void FranceButton(ActionEvent event) throws IOException{
      
       flagColorsMap.put("France", new Color[]{Color.RED, Color.WHITE, Color.BLUE}); 
       
        France1.setFill(Color.DARKBLUE);
        France2.setFill(Color.WHITE);
        France3.setFill(Color.RED);
       
        Germany1.setVisible(false);
        Germany2.setVisible(false);
        Germany3.setVisible(false);
        
        Defoult.setVisible(false);
        Defoult1.setVisible(false);
        Defoult2.setVisible(false);
        
        Belgium1.setVisible(false);
        Belgium2.setVisible(false);
        Belgium3.setVisible(false);
        
        Lesotho1.setVisible(false);
        Lesotho2.setVisible(false);
        Lesotho3.setVisible(false); 
        
        India1.setVisible(false);
        India2.setVisible(false);
        India3.setVisible(false);
        
        France1.setVisible(true);
        France2.setVisible(true);
        France3.setVisible(true);
        
        LesothoNews.setText("France is a country in Western \n"
                + "Europe that is roughly hexagonal in\n"
                + " shape. It has existed as a country \n"
                + "for a little over a thousand years \n"
                + "and has managed to fill those years \n"
                + "with some of the most important events\n"
                + " in European history"
                 );
          
    }
    
    @FXML
    private void ClearButton(){
        
     Defoult.setVisible(true);
     Defoult1.setVisible(true);
     Defoult2.setVisible(true);
     
     Lesotho1.setVisible(false);
     Lesotho2.setVisible(false);
     Lesotho3.setVisible(false);
     
     Germany1.setVisible(false);
     Germany2.setVisible(false);
     Germany3.setVisible(false);
     
     France1.setVisible(false);
     France2.setVisible(false);
     France3.setVisible(false);
        
     India1.setVisible(false);
     India2.setVisible(false);
     India3.setVisible(false);
        
     Belgium1.setVisible(false);
     Belgium2.setVisible(false);
     Belgium3.setVisible(false);
        
     LesothoNews.setText("Lesotho is the landlocked country, It was found \n "
             + "by Moshoeshoe 1. It is the small country, and it \n its dependency on"
             + "04 October 1966 KHOTSO PULA NALA \nChaba sa Thesele maapara kobo");
    }
}

