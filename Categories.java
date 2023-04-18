package com.example;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Categories 
{


public Categories(Stage oldStage)
 
{

Stage newStage = new Stage();
newStage.setTitle("Play");
newStage.initOwner(oldStage);

HBox buttonCont = new HBox();
buttonCont.setSpacing(100);

Image Ani = new Image("DST.png");
ImageView AnimV = new ImageView(Ani);
Button Anim = new Button("", AnimV);
Anim.setGraphic(AnimV);

Image Mov = new Image("SP.png");
ImageView Movi = new ImageView(Mov);
Button Movie = new Button("", Movi);
Movie.setGraphic(Movi);

Image TV = new Image("bb.png");
ImageView Tv = new ImageView(TV);
Button tv = new Button("", Tv);
tv.setGraphic(Tv);

buttonCont.getChildren().addAll(Anim, Movie, tv);

Image Ga = new Image("Mine.png");
ImageView Gam = new ImageView(Ga);
Button Game = new Button("", Gam);
Game.setGraphic(Gam);

Image Ti = new Image("time.png");
ImageView Tim = new ImageView(Ti);
Button Time = new Button("", Tim);
Time.setGraphic(Tim);

HBox GameTime = new HBox();
GameTime.setSpacing(200);
GameTime.getChildren().addAll(Game, Time);

VBox mainCont = new VBox();
mainCont.setPadding(new Insets(20));
mainCont.setSpacing(50);
mainCont.getChildren().addAll(buttonCont, GameTime);
mainCont.setStyle("-fx-background-color: BROWN;");


Scene scene = new Scene(mainCont, 800, 600);
scene.setFill(Color.GRAY);
 
newStage.setScene(scene);
newStage.show();
 
    } 
}