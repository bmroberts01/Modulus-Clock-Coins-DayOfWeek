import java.util.Scanner;
/**
    @author Bake Roberts
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
        

        System.out.println("Enter today in #s, (Sunday is 0, 6 is Saturday) and the # of days in the future:  ");
        int today = keyboard.nextInt();
        int time = keyboard.nextInt();

        int future = (today + time) % 7;

        System.out.println("In " + time + " days, it will be " + future);
        

        System.out.println("Enter an 8 digit number in binary");
        int binaryNumber = keyboard.nextInt();

        int first = binaryNumber % 10 * 1;
        binaryNumber = binaryNumber / 10;
        
        int second = binaryNumber % 10 * 2;
        binaryNumber = binaryNumber / 10;

        int third = binaryNumber % 10 * 4;
        binaryNumber = binaryNumber / 10;

        int fourth = binaryNumber % 10 * 8;
        binaryNumber = binaryNumber / 10;

        int fifth = binaryNumber % 10 * 16;
        binaryNumber = binaryNumber / 10;

        int sixth = binaryNumber % 10 * 32;
        binaryNumber = binaryNumber / 10;

        int seventh = binaryNumber % 10 * 64;
        binaryNumber = binaryNumber / 10;

        int eighth = binaryNumber % 10 * 128;
        binaryNumber = binaryNumber / 10;


        System.out.println("That is " + (first + second + third + fourth + fifth + sixth + seventh + eighth) );

         keyboard.close();

    }
}