public class BasicForLoops {
    public static void main(String[] args) 
    {
        /* Print multiples of 3 from 3 to 300 (evaluate every number) */
        for (int i = 3; i <= 300; i++) 
        {
            if (i % 3 == 0) 
            {
                System.out.println(i);
            }
        }

        /* Print multiples of 3 from 3 to 300 (only counting multiples ) */
        for (int i = 3; i <= 300; i+= 3)
        {
            System.out.println(i);
        }

        /* Print multiples of 3 from 300 down to 3 */
        for (int i = 300; i >= 3; i = i - 3)
        {
            System.out.println(i);
        }

        /* Computer the sum of integers from 20 to 70, inclusive, 
         *   and then print the result */
        int low = 20;
        int high = 70;
        int sum = 0;

        for (int i = low; i <= high; i++)
        {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        /* Running Sums - Compute the sum of even integers from 10 to 100, inclusive
         *    and store the result in a variable called evenSum. For the same range, 
         *    compute the sum of odd numbers and store the in variable called oddSum.
         *    
         * Expected Results:
         *    Even sum: 2530
         *    Odd sum: 2475    
         */
        
    }
}
