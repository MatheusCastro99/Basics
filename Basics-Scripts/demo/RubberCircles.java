  

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

//************************************************************************
//  RubberLines.java       Author: Lewis/Loftus
//
//  Demonstrates the handling of mouse press and mouse drag events.
//************************************************************************

public class RubberCircles extends Application
{
    private Text count;
    private int circleCount = 0;
    private Group root;
    private Circle newCircle;
    private Line radiusLine;
    private double radius;
    private double initX;
    private double initY;
    private double finalX;
    private double finalY;
    private Button clear;

    public void start(Stage primaryStage)
    {
        count = new Text(500, 30, "Circle Count: --");
        
        clear = new Button("Clear");
        clear.setOnAction(this::processClearButton);
        clear.setTranslateY(10);
        clear.setTranslateX(625);
        
        root = new Group(count, clear);
        Scene scene = new Scene(root, 1200, 800, Color.LIGHTYELLOW);
        
        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);
        scene.setOnMouseReleased(this::processMouseRelease);

        primaryStage.setTitle("Rubber Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void processMousePress(MouseEvent event)
    {
        initX = event.getX();
        initY = event.getY();
        
        radiusLine = new Line(initX, initY, initX, initY);
        radiusLine.setStroke(Color.BLUE);
        radiusLine.setStrokeWidth(3);
        
        root.getChildren().add(radiusLine);   
    }

    public void processMouseDrag(MouseEvent event)
    {
        finalX = event.getX();
        finalY = event.getY();
        
        radiusLine.setEndX(finalX);
        radiusLine.setEndY(finalY);
        
        double xDistance = finalX - initX;
        double yDistance = finalY - initY;
        
        radius = Math.sqrt((xDistance*xDistance) + (yDistance*yDistance));
    }
    
    public void processMouseRelease(MouseEvent event)
    {
      newCircle = new Circle(initX, initY, radius);
      newCircle.setStroke(Color.CYAN);
      newCircle.setStrokeWidth(3);
      newCircle.setFill(Color.WHITE);
      
      root.getChildren().add(newCircle);
        
      circleCount++;
      count.setText("Circle Count: " + circleCount);
    }
    
    public void processClearButton(ActionEvent event)
    {  
      count.setText("Circle Count: --");
      
      root.getChildren().clear();
      root.getChildren().add(count);
      root.getChildren().add(clear);
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
