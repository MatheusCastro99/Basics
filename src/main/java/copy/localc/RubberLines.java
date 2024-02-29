package copy.localc;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;




//************************************************************************
//  RubberLines.java       Author: Lewis/Loftus
//
//  Demonstrates the handling of mouse press and mouse drag events.
//************************************************************************
public class RubberLines extends Application
{
    private Line currentLine;
    private Group root;

    private Button clear;

    private Text lineCount;

    private int count;
    //--------------------------------------------------------------------
    //  Displays an initially empty scene, waiting for the user to
    //  draw lines with the mouse.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        clear = new Button("Clear");
        clear.setOnAction(this::processClearButton);
        clear.setTranslateX(230);
        clear.setTranslateY(15);

        lineCount = new Text(145, 30, "Line count: --");
        lineCount.setFill(Color.GREEN);

        root = new Group(clear, lineCount); // root has nothing, empty

        Scene scene = new Scene(root, 500, 300, Color.BLACK); // scene is like a blackboard

        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);
        primaryStage.setTitle("Rubber Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //--------------------------------------------------------------------
    //  Adds a new line to the scene when the mouse button is pressed.
    //--------------------------------------------------------------------
    public void processMousePress(MouseEvent event)
    {
        currentLine = new Line(event.getX(), event.getY(),   // start-point, not change
                event.getX(), event.getY());  // end-point, change with dragging
        currentLine.setStroke(Color.CYAN);
        currentLine.setStrokeWidth(3);
        root.getChildren().addFirst(currentLine);

        count++;
        lineCount.setText("Line Count: " + count);
    }
    //--------------------------------------------------------------------
    //  Updates the end point of the current line as the mouse is
    //  dragged, creating the rubber band effect.
    //--------------------------------------------------------------------
    public void processMouseDrag(MouseEvent event)
    {
        currentLine.setEndX(event.getX());
        currentLine.setEndY(event.getY());
    }

    public void processClearButton(ActionEvent event) {
        lineCount.setText("Line Count: --");
        count = 0;

        root.getChildren().clear();
        root.getChildren().add(clear);
        root.getChildren().add(lineCount);
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}