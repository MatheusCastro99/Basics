package com.example.demo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
public class Olympics extends Application
{
    //--------------------------------------------------------------------
    //  Presents The Olympics logo.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {

        Circle blue = new Circle(330, 280, 100);
        blue.setFill(Color.TRANSPARENT);
        blue.setStrokeType(StrokeType.CENTERED);
        blue.setStroke(Color.DODGERBLUE);
        blue.setStrokeWidth(18.0);

        Circle black = new Circle(570, 280, 100);
        black.setFill(Color.TRANSPARENT);
        black.setStrokeType(StrokeType.CENTERED);
        black.setStroke(Color.BLACK);
        black.setStrokeWidth(18.0);

        Circle red = new Circle(810, 280, 100);
        red.setFill(Color.TRANSPARENT);
        red.setStrokeType(StrokeType.CENTERED);
        red.setStroke(Color.RED);
        red.setStrokeWidth(18.0);

        Circle yellow = new Circle(450, 400, 100);
        yellow.setFill(Color.TRANSPARENT);
        yellow.setStrokeType(StrokeType.CENTERED);
        yellow.setStroke(Color.GOLD);
        yellow.setStrokeWidth(18.0);

        Circle green = new Circle(690, 400, 100);
        green.setFill(Color.TRANSPARENT);
        green.setStrokeType(StrokeType.CENTERED);
        green.setStroke(Color.GREEN);
        green.setStrokeWidth(18.0);

        Group olympics = new Group(blue, black, red, yellow, green);

        Group root = new Group(olympics);
        Scene scene = new Scene(root, 1180, 700, Color.WHITE);
        primaryStage.setTitle("Olympics Logo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}