package copy.localc;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import java.util.Random;
import javafx.scene.text.*;
import javafx.scene.control.Button;

public class CatchMe extends Application
{

    private int x;
    private int y;

    public void xRandomizer(){

        Random rand = new Random();
        x = rand.nextInt(700-50+1) + 50;

    }
    public void yRandomizer(){

        Random rand = new Random();
        y = rand.nextInt(650-50+1) + 50;

    }


    public void start(Stage primaryStage)
    {
        xRandomizer();
        yRandomizer();

        Button button = new Button("CLICK HERE");
        button.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 30));
        button.setTranslateX(x);
        button.setTranslateY(y);

        button.setOnMouseEntered(mouseEvent -> {
            xRandomizer();
            yRandomizer();
            button.setTranslateX(x);
            button.setTranslateY(y);
        });

        Group root = new Group(button);

        Scene scene = new Scene(root, 1000, 700, Color.LIGHTBLUE);
        primaryStage.setTitle("Catch me if you can!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}