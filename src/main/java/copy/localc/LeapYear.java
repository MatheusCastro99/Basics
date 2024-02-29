package copy.localc;

/* Name: Matheus DePaiva Castro
   Class: CSIT 111 - Fundamentals of Programming */

import java.util.Scanner;
import java.lang.Math;

public class LeapYear {

    public static void main(String[] args) {

        int yearInput;
        int GregorianCal = 1582;

        Scanner input = new Scanner(System.in);
        System.out.println("Type in the year to figure out if it was/will be a leap year or not: ");
        yearInput = input.nextInt();

        if (yearInput >= GregorianCal){
            if (yearInput % 100 == 0 && yearInput % 400 == 0){
                System.out.println("This is a leap Year!");
            }

            else{
                System.out.println("This is not a leap Year!");
            }
        }
        else{
            System.out.println("Year must be above 1582 (Gregorian Calendar adoption)");
        }
    }
}