/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Spring 2024
 * Instructor: Prof. Lily Romano / Prof. Joshua Stough
 *
 * Name: Peter Johnstone
 * Section: YOUR SECTION
 * Date: 5/5/2024
 * Time: 12:16 AM
 *
 * Project: platformer_game
 * Package: org.game
 * Class: GameController
 *
 * Description:
 *
 * ****************************************
 */
package org.game;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameController {
    private GameWorld gameWorld;
    private Stage stage;

    public GameController(Stage stage) {
        this.stage = stage;
        initializeGame();
    }

    private void initializeGame() {
        Pane root = new Pane();
        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        gameWorld = new GameWorld(root);
        stage.setTitle("Platformer");
        stage.show();
    }
}