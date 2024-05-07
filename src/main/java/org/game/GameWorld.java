package org.game;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class GameWorld {
    private Pane root;
    private AnchorPane fixedDisplay;
    private Pane gameWorld;
    private ScrollPane scrollPane;
    private Rectangle playerSprite;




    public GameWorld(Pane root) {
        // Create the game world pane
        this.root = root;

        gameWorld = new Pane();
        gameWorld.setPrefSize(10000, 10000); // Set a reasonable size for the game world

        Rectangle randomRect = new Rectangle(10000, 30);
        randomRect.setFill(javafx.scene.paint.Color.BROWN);
        randomRect.setTranslateY(9970);
        gameWorld.getChildren().add(randomRect);



        initScrollPane();
        initFixedDisplay();


        // Add the ScrollPane to the root pane

    }

    private void initScrollPane() {
        // Create the scroll pane and set its content to the game world
        scrollPane = new ScrollPane(gameWorld);
        scrollPane.setPrefSize(600, 600);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER); // Enable horizontal scroll bar if needed
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER); // Enable vertical scroll bar if needed
        root.getChildren().add(scrollPane);
    }

    private void initFixedDisplay() {
        fixedDisplay = new AnchorPane();

        // Create the player sprite
        playerSprite = new Rectangle(20, 20);
        playerSprite.setFill(javafx.scene.paint.Color.BLUE);
        playerSprite.setTranslateX(290);
        playerSprite.setTranslateY(290);
        fixedDisplay.getChildren().add(playerSprite);


        root.getChildren().add(fixedDisplay);


    }
}
