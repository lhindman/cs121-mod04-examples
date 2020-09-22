public class NestedLoops {
    public static void main(String[] args)
    {
        /* How many times will "I'm here!" be printed? */
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.println("I'm here!");
            }
        }


        /* What does the following nested loop print? */
        int gridSize = 10;
        for (int i = 0; i < gridSize; i++ )
        {
            for (int j = 0; j < gridSize; j++ )
            {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }


    }
}
