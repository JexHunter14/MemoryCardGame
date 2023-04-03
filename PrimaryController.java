package com.example;

import java.io.IOException;
import java.util.Collections;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PrimaryController {

    public static class arrays {
        
        static int[] selectedCards = {0, 0, 0, 0, 0, 0};
        static int[] currentMatches = {0, 0, 0, 0, 0, 0};
    }

    // checks the validity of the user's move
    public static void checkMoveValidity(int index, String chosenCards[], HBox mainHBox) {

       

        int counter = 0;
        for (int card : arrays.selectedCards) {
            if (card == 1) {
                counter++;
            }
        }

        if (counter > 1) {
            int cardCounter = 0;
            for (Node card : mainHBox.getChildren()) {
                if (arrays.currentMatches[cardCounter] != 2) {
                    Image cardback = new Image("CardBack.jpg");
                    ImageView cardImageView = (ImageView) card;
                    cardImageView.setImage(cardback);
                }

                cardCounter++;
            }
        } else if (counter == 1) {
            for (int i = 0; i < arrays.selectedCards.length; i++) {
                if (arrays.selectedCards[i] == 1) {
                    if (chosenCards[i] == chosenCards[index]) {
                        arrays.selectedCards[i] = 2;
                        arrays.selectedCards[index] = 2;
                        arrays.currentMatches[index] = 2;
                        arrays.currentMatches[i] = 2;
                    }
                    else {
                        arrays.selectedCards[i] = 0;
                        arrays.selectedCards[index] = 0;
                        int cardCounter = 0;
                        for (Node card : mainHBox.getChildren()) {
                            if (arrays.currentMatches[cardCounter] != 2) {
                                Image cardback = new Image("CardBack.jpg");
                                ImageView cardImageView = (ImageView) card;
                                cardImageView.setImage(cardback);
                            }

                        cardCounter++;
            }
                        
                    }
                }
            }
        }

    }


    private static int stringChecker(String[] arr, String toCheckValue)
    {
        int counter = 0;
        for (String element : arr) {
            if (element == toCheckValue) {
                counter++;
            }
        }
        return counter; 
    }

    @FXML
    private void startGame() throws IOException {

        String[] possibleCards = {"Bananas", "Pear", "Orange", "Watermelon", "Grapes", "Apple"};
        String[] chosenCards = new String[6];
        

        for (int i = 0; i < 3; i++) {
            int chosen = new Random().nextInt(possibleCards.length);
            while ( stringChecker(chosenCards, possibleCards[chosen]) > 0 ) {
                chosen = new Random().nextInt(possibleCards.length);
            }

            chosenCards[i] = possibleCards[chosen];
            chosenCards[5-i] = possibleCards[chosen];

        }

        Collections.shuffle(chosenCards);
 
        for (int i = 0; i < 6; i++) {
            System.out.println(chosenCards[i]);
        }

        for (String card : chosenCards) {
            Image image = new Image("CardBack.jpg");
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(100);
            imageView.setFitWidth(100);

            imageView.setOnMouseClicked(event -> {

                int index = mainHBox.getChildren().indexOf(imageView);

                if (arrays.selectedCards[index] == 0) {
                    checkMoveValidity(index, chosenCards, mainHBox);
                    Image cardImage = new Image(chosenCards[index] + ".jpg");
                    imageView.setImage(cardImage);
                    arrays.selectedCards[index] = 1;

                    System.out.println();
                    for (int i=0; i < 6; i++) {
                        System.out.print(arrays.currentMatches[i]);
                        
                    }
                    System.out.println();

                } 
        

            });

            
            
            mainHBox.getChildren().add(imageView);
        }
        

    }

    @FXML
    private ImageView cards;
    @FXML
    private VBox mainBox;
    @FXML
    public HBox mainHBox;


    
}
