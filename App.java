package com.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;
import javafx.stage.Stage;

/**
 * JavaFX App
 */


public class App extends Application {
 
private static Scene scene;
 
private static Label FIRM;
 
@Override
 
public void start(Stage stage) {

stage.setTitle("Main Menu"); 
 
Label FIRM = new Label("F.I.R.M");
 
FIRM.setStyle("-fx-font-size: 100px; -fx-font-family: Arial; -fx-text-fill: black;");
 
Button submit = new Button("Play");
 
submit.setAlignment(Pos.CENTER);
 
submit.setStyle("-fx-text-fill: red; -fx-background-color: black; -fx-font-size: 35px;");
 
 
submit.setOnAction(e -> 
 
{
 
new Categories(stage);
 
});

Button HighScore = new Button("High Scores");
 
HighScore.setAlignment(Pos.CENTER);
 
HighScore.setStyle("-fx-text-fill: yellow; -fx-background-color: black; -fx-font-size: 35px;");
 
 
HighScore.setOnAction(e -> 
 
{
 
new HighScores(stage);
 
});

Button quit = new Button("Quit");
quit.setAlignment(Pos.CENTER);
quit.setStyle("-fx-text-fill: white; -fx-background-color: black; -fx-font-size: 35px;");

quit.setOnAction(e -> 
{
    System.exit(0);
});
 
VBox button = new VBox(submit, HighScore, quit);
 
button.setAlignment(Pos.CENTER);
button.setSpacing(20);
 
VBox container = new VBox(FIRM, button);
 
container.setPadding(new Insets(20)
);
 
container.setSpacing(20);
container.setAlignment(Pos.TOP_CENTER);
container.setStyle("-fx-background-color: cyan;");

 
scene = new Scene(container, 800, 600);

stage.setScene(scene);
 
stage.show();
 
}
 
public static void main(String[] args) {
 
launch();
    
    }
}
