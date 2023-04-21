package com.example;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;
import javafx.stage.Stage;

/**
 * JavaFX App
 */


public class App extends Application {
 
private static Scene scene;
 
@Override
 
public void start(Stage stage) {

stage.setTitle("Main Menu"); 
 
Image image = new Image("FIRM.png");
ImageView imageView = new ImageView();
imageView.setImage(image);
 
Button submit = new Button("Play");
 
submit.setAlignment(Pos.CENTER);
 
submit.setStyle("-fx-text-fill: red; -fx-background-color: black; -fx-font-size: 25px;");
 
 
submit.setOnAction(e -> 
 
{
 
new Categories(stage);
 
});

Button HighScore = new Button("High Scores");
 
HighScore.setAlignment(Pos.CENTER);
 
HighScore.setStyle("-fx-text-fill: yellow; -fx-background-color: black; -fx-font-size: 25px;");
 
 
HighScore.setOnAction(e -> 
 
{
 
new HighScores(stage);
 
});

Button quit = new Button("Quit");
quit.setAlignment(Pos.CENTER);
quit.setStyle("-fx-text-fill: white; -fx-background-color: black; -fx-font-size: 25px;");

quit.setOnAction(e -> 
{
    System.exit(0);
});
 
VBox button = new VBox(submit, HighScore, quit);
 
button.setAlignment(Pos.CENTER);
button.setSpacing(20);
 
VBox container = new VBox(imageView, button);
 
container.setPadding(new Insets(20)
);
 
container.setSpacing(20);
container.setAlignment(Pos.TOP_CENTER);
container.setStyle("-fx-background-color: orange;");

 
scene = new Scene(container, 800, 600);

stage.setScene(scene);
 
stage.show();
 
}
 
public static void main(String[] args) {
 
launch();
    
    }
}
