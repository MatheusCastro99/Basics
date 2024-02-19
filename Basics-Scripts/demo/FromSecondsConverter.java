  

/* Name: Matheus DePaiva Castro
   Class: CSIT 111 - Fundamentals of Programming */
import java.util.Scanner;
import java.lang.*;

/*This program prompts the user to insert an amount of seconds,
which will be converted to hours, minutes, and seconds*/

public class FromSecondsConverter {
    public static void main(String[] args) {

        //Input Seconds
        Scanner seconds = new Scanner(System.in);
        System.out.println("Enter Seconds to convert: ");
        int Seconds = seconds.nextInt();

        //Converts to days, minutes, and seconds
        int Hours = Math.floorDiv(Seconds, 3600);
        int Minutes = Math.floorDiv((Seconds % 3600), 60);
        int SecondsLeft = (Seconds % 3600) % 60;

        //Displays the conversion
        System.out.println(Seconds + " Seconds are equal to " + Hours + " Hours, " + Minutes + " Minutes, and " + SecondsLeft + " Seconds");
    }
}