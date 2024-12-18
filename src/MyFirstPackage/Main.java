package MyFirstPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     //   exerciseOne();
      //  exerciseTwo();
      //  exerciseThree();
     //   exerciseFour();
     //   exerciseFive();
    //    exerciseSix();
     //   exerciseSeven();
        exerciseSevenInMinutes();
    }

    private static void exerciseOne() {
        String firstName = "Eleonora";
        String middleName = "Yovcheva";
        String lastName = "Mihova";
        System.out.println(firstName + " " + middleName + " " + lastName);
    }

    private static void exerciseTwo() {
        int sideA = 3;
        int sideB = 5;
        int sideC = 2;
        int p = sideA + sideB + sideC;
        System.out.println("The perimeter is: " + p);
    }

    private static void exerciseThree() {
        int sideA = 4;
        int sideB = 6;
        int area = sideA * sideB;
        System.out.println("The area is: " + area);
    }

    private static void exerciseFour() {
        int height = 4;

        // Loop through each level of the tree
        for (int i = 1; i <= height; i++) {
            // Print leading spaces
           for (int j = 1; j <= height - i; j++) {
               System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
    private static void exerciseFive() {

        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        int p = sideA + sideB + sideC;
        System.out.println("The perimeter is: " + p);
    }
    private static void exerciseSix() {

        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int area = sideA * sideB;
        System.out.println("The area is: " + area);
    }
    private static void exerciseSeven() {
        System.out.println("Enter the number you would like to convert: ");
        Scanner scanner = new Scanner(System.in);
        long seconds = scanner.nextLong();

        long sumOfSecondsInYears = seconds / (60 * 60 * 24 * 365);
        double sumOfSecondsInDays = seconds / (60 * 60 * 24);

        System.out.println("Seconds in years: " + sumOfSecondsInYears);
        System.out.println("Seconds in days: " + sumOfSecondsInDays);

    }
    private static void exerciseSevenInMinutes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");

        long minutes = scanner.nextLong();

        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long minutesInDay = 60 * 24;
        long days = remainingMinutes/ minutesInDay;

        System.out.println(minutes + " minutes are equal to " + years + " years and " + days + " days. ");




    }
}
