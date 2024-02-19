  

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import java.util.Random;
import javafx.scene.text.*;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;

public class RadiusModifier extends Application
{
    
    private TextField radius = new TextField();
    private int radiusInt;
    Circle circle = new Circle(375, 300, radiusInt);
    Text warning = new Text(200, 700, (""));
            
    public void start(Stage primaryStage)
    {  
        radius.setOnAction(this::processReturn);
        radius.setPrefWidth(75);
        Group rGroup = new Group(radius);
        rGroup.setTranslateY(625);
        rGroup.setTranslateX(470);
        
        
        Text enterRadius = new Text(250, 650, ("Enter Radius: "));
        enterRadius.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 30));
                 
        Group root = new Group(warning, circle, enterRadius, rGroup);
        
        Scene scene = new Scene(root, 800, 800, Color.WHITE);
        primaryStage.setTitle("Circle Randomizer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void processReturn(ActionEvent event){
      radiusInt = Integer.parseInt(radius.getText());
      
      if(radiusInt > 300){
         warning.setText("Your circle is too big. Max radius is 300");
         warning.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 20));
         warning.setFill(Color.RED);
         circle.setRadius(0);  
      }
      else{circle.setRadius(radiusInt); warning.setText("");}
          
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}