  

/* Name: Matheus DePaiva Castro
   Class: CSIT 111 - Fundamentals of Programming */
import java.util.Scanner;

/*This program prompts the user to imput a number of hours,
minutes, and seconds, and them converts it to seconds*/

public class ToSecondsConverter {
    public static void main(String[] args) {

        //Input days, hours, and minutes from user
        Scanner hours = new Scanner(System.in);
        System.out.println("Enter Hours: ");
        int Hours = hours.nextInt();

        Scanner minutes = new Scanner(System.in);
        System.out.println("Enter Minutes: ");
        int Minutes = minutes.nextInt();

        Scanner seconds = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        int Seconds = seconds.nextInt();

        //Converts to seconds
        int secondsInSeconds = Seconds;
        int minutesInSeconds = Minutes * 60;
        int hoursInSeconds = Hours * 60 * 60;

        int totalSeconds = hoursInSeconds + minutesInSeconds + secondsInSeconds;
        int TotalSeconds = totalSeconds;

        //Displays the conversion
        System.out.println(Hours + " Hours, " + Minutes + " Minutes, and " + Seconds + " Seconds are equal to " + TotalSeconds + " Seconds");
    }
}