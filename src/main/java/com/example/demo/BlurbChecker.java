package com.example.demo;

import java.util.Scanner;
import java.util.Arrays;

public class BlurbChecker {
    String blurb = "";
    int NumCharacter;
    String[] blurbArr;
    boolean reached;
    Scanner scan = new Scanner(System.in);

    public void start(){

        while (!(blurb.equals("DONE"))) {
            System.out.println("Enter Alien blurb to be tested: (enter DONE to quit)");
            blurb = scan.nextLine();
            int NumCharacter = blurb.length()-1;
            blurbArr = blurb.split("");
            reached = false;

            System.out.println(check(NumCharacter));

            //System.out.println(NumCharacter);
            //System.out.println(Arrays.toString(blurbArr));
            //check(NumCharacter);
        }
    }

    public boolean check(int index){                               //xyyyyqdxydxyydxyyydxyyyyxyyyy
        //xyqzxyxy
        if(index == -1) {                                           //xyyqdxydxyyxyy
            return reached;
        }

        else if (blurbArr[index].equals("y") && blurbArr[index-1].equals("y")) {
            check(index-1);
        }

        else if (blurbArr[index].equals("y") && blurbArr[index-1].equals("x")) {
            check(index-1);
        }

        else if(blurbArr[index].equals("x") && index == 0) {
            System.out.println("DONE");
            reached = true;
        }

        else if (blurbArr[index].equals("x") && blurbArr[index-1].equals("y")) {
            check(index-1);
        }

        else if (blurbArr[index].equals("x") && blurbArr[index-1].equals("z")) {
            check(index-1);
        }

        else if (blurbArr[index].equals("x") && blurbArr[index-1].equals("d")) {
            check(index-1);
        }

        else if (blurbArr[index].equals("d") && blurbArr[index-1].equals("q")) {
            check(index-1);
        }

        else if (blurbArr[index].equals("d") && blurbArr[index-1].equals("y")) {
            check(index-1);
        }

        else if (blurbArr[index].equals("z") && blurbArr[index-1].equals("q")) {
            check(index-1);
        }

        else if (blurbArr[index].equals("q") && blurbArr[index-1].equals("y")) {
            check(index-1);
        }

        //System.out.println("   " + blurbArr[index]);       THOSE TWO LINES CHECK WHERE THE ARRAY RETURNED FALSE WHEN ENABLED AND THE PROCESS UNTIL THEN.
        //System.out.println(index);

        return reached;
    }

    public static void main(String[] args){
        BlurbChecker initialize = new BlurbChecker();
        initialize.start();
    }
}