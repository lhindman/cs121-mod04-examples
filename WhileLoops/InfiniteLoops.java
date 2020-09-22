import java.util.Scanner;

public class InfiniteLoops {
    public static void main(String[] args)
    {
        /* Infinite loops are loops whose looping condition always 
         *   evaluates to true. There are situations where this is 
         *   desired, but most often it is a logic error and it causes
         *   the program to hang unexpectedly. */

        // while(true) 
        // {
        //     System.out.println("Can you hear me now?  :)");
        // }

        /* Sometimes an infinitely loop occurs when we move away from the 
         *   looping condition */
        int counter1 = 0;
        while(counter1 < 10)
        {
            System.out.println("The value of counter1 is: " + counter1);
            counter1 = counter1 - 1;
        }

        /* Sometimes an infinite loop occurs when we are checking for
         *   and impossible value */
        Scanner kbd = new Scanner(System.in);
        String input = "";  //Starting condition
        while (input.equals("Q")) //looping condition
        {
            System.out.print("Enter something (q to quit): ");
            input = kbd.nextLine().toLowerCase(); //loop iterator
            
        }
        kbd.close();
    }
}
