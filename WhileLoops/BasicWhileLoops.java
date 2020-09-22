import java.util.Scanner;
public class BasicWhileLoops {
    public static void main(String[] args)
    {
        
        /* Basic example of a while loop, counting down */
        int numCookies = 6;  // starting condition
        while (numCookies > 1)  // looping condition
        {
            System.out.println("Here's a cookie!"); // what we do every time
            numCookies = numCookies - 1; //loop counter
        }
        System.out.println("Cookies remaining:" + numCookies);



        /* Basic example of a while loop, counting up */
        int count = 1; //starting condition
        while (count <= 5) //looping condition
        {
            System.out.println(count);
            count++;
        }
        System.out.println("The final value of count is: " + count);



        /* Basic example of while loop with Strings and sentinel value */
        Scanner kbd = new Scanner(System.in);
        String input = "";  //Starting condition
        while (!input.equals("q")) //looping condition
        {
            System.out.print("Enter something (q to quit): ");
            input = kbd.nextLine().toLowerCase(); //loop iterator
        }
        System.out.println("The final value of input is: " + input);
        kbd.close();


        

        /* Knowledge Check - What is the expected output
         *   of the following loop */
        int counter = 0;
        while (counter <= 10) 
        {
            if(counter % 2 == 0)
            {
                System.out.println(counter);
            }
            counter++;
        }

    }
}
