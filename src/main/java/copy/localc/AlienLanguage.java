package copy.localc;

import java.util.Random;
import java.util.Arrays;

public class AlienLanguage {

    Random rand = new Random();
    char[] whatzitOptional = {'z', 'd'};
    String whoozit = "x"; //+ whoozitOptional[choice];
    String whatzit = "q"; //+ whatzitOptional[choice] + whoozit;
    int YNumber;
    int choice;

    String blurbs = "";

    public void start() {
        YNumber = rand.nextInt(6);
        choice = rand.nextInt(2);

        generateY(YNumber);
        System.out.println(blurbs);
        //System.out.println(YNumber);
    }

    public void generateY (int YNumber) {

        if (YNumber == 0) {
            blurbs += whoozit;
            //whatzit += whatzitOptional[choice] + whoozit;
            //blurbs[1] = whatzit;
        }

        else {
            whoozit += "y";
            whatzit += whatzitOptional[choice] + whoozit;
            blurbs = whoozit;
            blurbs += whatzit;
            generateY(YNumber-1);
        }
    }

    public static void main(String[] args){
        AlienLanguage begin = new AlienLanguage();
        begin.start();
    }
}