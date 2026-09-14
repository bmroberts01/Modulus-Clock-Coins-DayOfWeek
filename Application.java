import java.util.Scanner;
/**
    Blake Roberts
    08/27/26 
**/
public class Application
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter amount of seconds:   ");
        int seconds = keyboard.nextInt();

        int hours = seconds / 3600;
        seconds = seconds % 3600;

        int minutes = seconds / 60;
        seconds = seconds % 60;
        
        System.out.println(hours + ":" + minutes + ":" + seconds);


        System.out.println("Enter a value in cents to simplify");
        int cents = keyboard.nextInt();

        int quarters = cents / 25;
        cents = cents % 25;

        int dimes = cents / 10;
        cents = cents % 10;

        int nickels = cents / 5;
        cents = cents % 5;

        System.out.println( quarters + " Quarters, " + dimes + " Dimes, " + nickels + " Nickels, " + "and " + cents + " Pennies");


         keyboard.close();

    }
}