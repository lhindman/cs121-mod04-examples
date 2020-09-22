public class StringComparison {
    public static void main(String[] args)
    {
        String msg1 = new String("Hello World");
        String msg2 = new String("Hello World");

        /* String are objects, so we'll need to use their equals() method
         *   to compare the contents of the strings */
        if (msg1.equals(msg2)) 
        {
            System.out.println("The contents of msg1 is equivalent to msg2");
        }
        else
        { 
            System.out.println("The contents of msg1 is different than msg2");
        }

        /* String objects also provide a compareTo() method that allows strings 
         *   to be ordered lexigraphically. */
        String name1 = "Ted";
        String name2 = "Zeb";

        int result = name1.compareTo(name2);
        if (result < 0) 
        {
            System.out.println(name1 + " comes before " + name2);
        }
        else if (result == 0) 
        {
            System.out.println ("The names are equal");
        }
        else 
        {
            System.out.println(name1 + " comes after " + name2);
        }
    }
}
