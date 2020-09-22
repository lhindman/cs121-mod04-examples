public class CharacterComparison {
    
    public static void main(String[] args) 
    {

        char letter1 = '%';
        char letter2 = 'b';

        /* Characters can be compared using the relational operators
         *   because they are simply indexes into the unicode character set.
         *   When compared with each, their relative positions (index values)
         *   are compared lexographically. */

        if (letter1 > letter2) 
        {
            System.out.println(letter1 + " is greater than " + letter2);
        }
        else
        {
            System.out.println(letter2 + " is greater than " + letter1);
        }

        /* This can be useful if we want to determine if a character is 
         *    in a certain section of the unicode character set */
        if (letter1 >= 'a' && letter1 <= 'z') 
        {
            System.out.println(letter1 + " is a lowercase letter");
        } 
        else
        {
            System.out.println(letter1 + " is NOT a lowercase letter");
        }
    }
}
