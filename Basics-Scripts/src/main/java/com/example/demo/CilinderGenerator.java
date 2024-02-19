package com.example.demo;

/* Name: Matheus DePaiva Castro
   Class: CSIT 111 - Fundamentals of Programming */
import java.lang.*;
import java.util.Random;

/*This program prompts the user to enter a floating point,
then prints the two closest integers from that number*/

public class CilinderGenerator {
    public static void main(String[] args) {

        //Create objects, assign random numbers to variables, and assing pi
        Random radius = new Random();
        Random height = new Random();

        double Radius = radius.nextInt(21 - 1) + 1;
        double Height = height.nextInt(21 - 1) + 1;
        double Pi = Math.PI;

        //Calculates the cilider measures
        double volume = Pi * (Math.pow(Radius, 2.0)) * Height;
        double RoundedVol = Math.round(volume * 100d) / 100d;

        double surfaceArea = 2 * Pi * Radius * Height;
        double RoundedArea = Math.round(surfaceArea * 100d) / 100d;

        //Displays the results
        System.out.println("For a cilinder of radius " + Radius + ", and height " + Height +
                " , the rounded volume is " + RoundedVol + " and the surface area is " + RoundedArea);
    }
}