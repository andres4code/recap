package com.sda.tallinn6.evgenii.July_6th.task6;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.sql.Time;
import java.time.LocalTime;

public class FlashText extends Application {

    private String text = "";
//    LocalTime time2 = LocalTime.now();
//    System.out.println(time2);

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Label lblText = new Label("Programming is fun");
        pane.getChildren().add(lblText);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (lblText.getText().trim().length() == 0) text = " " + LocalTime.now();
                        else
                            text = "";
                        Platform.runLater(new Runnable() { // Run from JavaFX GUI @Override
                            public void run() {

                                lblText.setText(String.valueOf(text));


                            }
                        });

                        Thread.sleep(500);
                    }
                } catch (InterruptedException ex) {

                }
            }
        }).start();


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("Current Time"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

