package com.example.demo;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class PizzaCustomizerPane extends VBox
{
    private Text phrase;
    private CheckBox baconCheckBox, tomatoCheckBox, extraCheeseCheckBox, garlicCheckBox, chickenCheckBox, pepperoniCheckBox;
    private double finalPrice = 10;
    String dollarFormat = String.format("%.2f", finalPrice);
    Label price;

    public PizzaCustomizerPane()
    {
        phrase = new Text("Customize your Pizza!");
        phrase.setFont(new Font("Helvetica", 36));

        baconCheckBox = new CheckBox("Bacon");
        baconCheckBox.setOnAction(this::processCheckBoxAction);
        baconCheckBox.setFont(new Font("Helvetica", 24));

        tomatoCheckBox = new CheckBox("Tomato");
        tomatoCheckBox.setOnAction(this::processCheckBoxAction);
        tomatoCheckBox.setFont(new Font("Helvetica", 24));

        extraCheeseCheckBox = new CheckBox("Extra Cheese");
        extraCheeseCheckBox.setOnAction(this::processCheckBoxAction);
        extraCheeseCheckBox.setFont(new Font("Helvetica", 24));

        garlicCheckBox = new CheckBox("Garlic");
        garlicCheckBox.setOnAction(this::processCheckBoxAction);
        garlicCheckBox.setFont(new Font("Helvetica", 24));

        chickenCheckBox = new CheckBox("Chicken");
        chickenCheckBox.setOnAction(this::processCheckBoxAction);
        chickenCheckBox.setFont(new Font("Helvetica", 24));

        pepperoniCheckBox = new CheckBox("Pepperoni");
        pepperoniCheckBox.setOnAction(this::processCheckBoxAction);
        pepperoniCheckBox.setFont(new Font("Helvetica", 24));

        price = new Label("Final Price is: $"+dollarFormat);
        price.setFont(new Font("Helvetica", 24));

        HBox optionsLine1 = new HBox(baconCheckBox, garlicCheckBox, extraCheeseCheckBox);
        HBox optionsLine2 = new HBox(tomatoCheckBox, chickenCheckBox, pepperoniCheckBox);
        optionsLine1.setAlignment(Pos.CENTER);
        optionsLine1.setSpacing(20);
        setSpacing(20);

        optionsLine2.setAlignment(Pos.CENTER);
        optionsLine2.setSpacing(20);
        setSpacing(20);

        getChildren().addAll(phrase, optionsLine1, optionsLine2, price);
    }

    public void processCheckBoxAction(ActionEvent event)
    {
        double additional = 0.50;
        finalPrice = 10.00;
        dollarFormat = String.format("%.2f", finalPrice);
        price.setText("Final Price is: $"+dollarFormat);

        if (baconCheckBox.isSelected()){
            finalPrice += additional;
            dollarFormat = String.format("%.2f", finalPrice);
            price.setText("Final Price is: $"+dollarFormat);
        }

        if (tomatoCheckBox.isSelected()){
            finalPrice += additional;
            dollarFormat = String.format("%.2f", finalPrice);
            price.setText("Final Price is: $"+dollarFormat);
        }

        if (extraCheeseCheckBox.isSelected()){
            finalPrice += additional;
            dollarFormat = String.format("%.2f", finalPrice);
            price.setText("Final Price is: $"+dollarFormat);
        }

        if (garlicCheckBox.isSelected()){
            finalPrice += additional;
            dollarFormat = String.format("%.2f", finalPrice);
            price.setText("Final Price is: $"+dollarFormat);
        }

        if (chickenCheckBox.isSelected()){
            finalPrice += additional;
            dollarFormat = String.format("%.2f", finalPrice);
            price.setText("Final Price is: $"+dollarFormat);
        }

        if (pepperoniCheckBox.isSelected()){
            finalPrice += additional;
            dollarFormat = String.format("%.2f", finalPrice);
            price.setText("Final Price is: $"+dollarFormat);
        }
    }
}
