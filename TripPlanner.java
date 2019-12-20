import java.util.Scanner;

public class TripPlanner {
    public static void main( String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Nice to meet you " +name+", where are you travelling to?");
        String destination = input.nextLine();
        System.out.println("Great!" +destination+" sounds like a great trip");

        System.out.print("*********");

        System.out.print("How many days are you going to spend travelling");
        int trip_duration = input.nextInt();
        System.out.print("How much money, in USD are you planning to spend on your trip?");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination?");
        String symbol = input.next();

        }
}
