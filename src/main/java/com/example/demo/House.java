package com.example.demo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
public class House extends Application
{
    //--------------------------------------------------------------------
    //  Presents a House scene.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Rectangle grass = new Rectangle(-200, 500, 1050, 300);
        grass.setFill(Color.GREEN);

        Rectangle base = new Rectangle(200, 250, 250, 250);
        base.setFill(Color.BROWN);

        Polygon roof = new Polygon();
        roof.getPoints().addAll(new Double[]{
                325.0, 130.0, 150.0, 250.0, 500.0, 250.0
        });
        roof.setFill(Color.ROSYBROWN);

        Rectangle chimney = new Rectangle(380, 160, 40, 80);
        chimney.setFill(Color.SLATEGREY);

        Rectangle door = new Rectangle(360, 400, 60, 100);
        door.setFill(Color.PERU);

        Circle doorknob = new Circle(407, 470, 7);
        doorknob.setFill(Color.LIGHTGRAY);

        Rectangle window1 = new Rectangle(230, 280, 70, 70);
        window1.setFill(Color.LIGHTBLUE);
        window1.setStrokeWidth(7);
        window1.setStroke(Color.WHITE);

        Rectangle window2 = new Rectangle(350, 280, 70, 70);
        window2.setFill(Color.LIGHTBLUE);
        window2.setStrokeWidth(7);
        window2.setStroke(Color.WHITE);

        Line window1VertDivision = new Line(230, 315, 300, 315);
        window1VertDivision.setStrokeWidth(7);
        window1VertDivision.setStroke(Color.WHITE);

        Line window2VertDivision = new Line(350, 315, 420, 315);
        window2VertDivision.setStrokeWidth(7);
        window2VertDivision.setStroke(Color.WHITE);

        Line window1HorDivision = new Line(265, 280, 265, 350);
        window1HorDivision.setStrokeWidth(7);
        window1HorDivision.setStroke(Color.WHITE);

        Line window2HorDivision = new Line(385, 280, 385, 350);
        window2HorDivision.setStrokeWidth(7);
        window2HorDivision.setStroke(Color.WHITE);

        Ellipse cloud1 = new Ellipse(80, 80, 100, 40);
        cloud1.setFill(Color.WHITE);

        Ellipse cloud2 = new Ellipse(480, 20, 140, 40);
        cloud2.setFill(Color.WHITE);

        Ellipse cloud3 = new Ellipse(600, 120, 120, 40);
        cloud3.setFill(Color.WHITE);

        Circle sun = new Circle(-110, 10, 45);
        sun.setFill(Color.GOLD);

        Group background = new Group(sun, cloud1, cloud2, cloud3, grass);
        background.setTranslateX(170);
        background.setTranslateY(50);

        Group roofComplete = new Group(roof, chimney);
        Group doorComplete = new Group(door, doorknob);
        Group windows = new Group(window1, window2, window1VertDivision, window2VertDivision, window1HorDivision, window2HorDivision);
        Group house = new Group(base, roofComplete, doorComplete, windows);
        house.setTranslateX(170);
        house.setTranslateY(50);

        Group root = new Group(background, house);

        Scene scene = new Scene(root, 1000, 700, Color.LIGHTBLUE);
        primaryStage.setTitle("A House");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}