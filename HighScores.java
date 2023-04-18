package com.example;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class HighScores 
{
 
public HighScores(Stage oldStage)
 
{
 
Stage newStage = new Stage();
 
newStage.setTitle("HighScores");
 
newStage.initOwner(oldStage);


VBox mainCont = new VBox();
 
mainCont.setPadding(new Insets(20)
);
 
mainCont.setSpacing(20);
 
Scene scene = new Scene(mainCont, 800, 600);
scene.setFill(Color.CYAN);
 
newStage.setScene(scene);
 
newStage.show();
 
    } 
}