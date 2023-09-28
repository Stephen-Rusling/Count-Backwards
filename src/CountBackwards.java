// Program to count backwards from user selected number using recursion in Java
import java.util.Scanner;

public class CountBackwards
{
    public static void main(String[] args)
    {
        // While loop to prompt user to give a number, and if they want to play another "game"
        while(true)
        {
            System.out.println("Want to play a game? \"Y\" to play, \"N\" to quit!");
            Scanner scan1 = new Scanner(System.in);
            String response = scan1.next();
            if (response.equalsIgnoreCase("Y"))
            {
                // Recursive loop for counting backwards from given number
                System.out.print("Please enter a number to count backwards to zero from: ");
                Scanner scan2 = new Scanner(System.in);
                int input = scan2.nextInt();
                countBackwards(input);
            }
            else if (response.equalsIgnoreCase("N"))
            {
                break;
            }
        }
    }
    public static void countBackwards(int n)
    {
        if (n == 0)
        {
            System.out.println("Count Finished!");
        }
        else
        {
            System.out.print(n + ", ");
            n--;
            countBackwards(n);
        }
    }

}
