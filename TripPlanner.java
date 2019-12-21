import java.util.Scanner;

public class TripPlanner {
    public static void main( String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " +name+", where are you travelling to?");
        String destination = input.nextLine();
        System.out.println("Great!" +destination+" sounds like a great trip");

        System.out.println("*********");

        System.out.print("How many days are you going to spend travelling?");
        int trip_duration = input.nextInt();
        System.out.print("How much money, in USD are you planning to spend on your trip?");
        int moneyUSD = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination?");
        String cur_symbol = input.next();
        System.out.println("How many "+cur_symbol+" are there in 1 USD?");
        double convertion_factor = input.nextDouble();

        int hours,min;
        double money;
        money=moneyUSD*convertion_factor;

        System.out.println("If you are travelling for "+trip_duration+ " that is as" +trip_duration*24 +"hours or" +trip_duration*24*60 + "minutes.");
        System.out.println("if you are going to spend"+moneyUSD + " USD that means per day you can spend up to $"+moneyUSD/trip_duration + "USD.");
        System.out.println("Your total budget in "+cur_symbol +"is"+money+" "+cur_symbol + "which per day is"+money/trip_duration + " "+cur_symbol+".");
        System.out.println("*******************");
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        double time_difference =input.nextDouble();
        double time1,time2;
        time1=time_difference;
        time2=12+time_difference;
        System.out.println("That means that when it is midnight at home it weill be"+ time1 +"in your travel destination and when it is noon at home it will be" + time2+".");
        System.out.println("*******************");
        System.out.println("What is the sqaure area of your destination country in km^2 ?");
        double area=input.nextDouble();
        System.out.println("In miles^2 that is"+ area*2.59);




        }
}
