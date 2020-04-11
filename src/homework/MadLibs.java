package homework;

import java.util.Scanner;

public class MadLibs {

    public static void main (String arg[]){
       // 1. Get Season of the year
        System.out.println("Enter a season of your choice");
        Scanner scanner = new Scanner(System.in);
        String seasonOfTheYear = scanner.next();
        // 2. Get a whole number
        System.out.println("Enter a whole number of your choice");
        int wholeNumber = scanner.nextInt();
        // 3. Get an adjective
        System.out.println("Enter an adjective that describes your current mood");
        String adjective = scanner.next();
        scanner.close();
        // Display / Complete the sentence
        System.out.println("On a " + adjective + " "+ seasonOfTheYear + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
