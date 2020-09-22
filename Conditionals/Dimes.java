public class Dimes {
    public static void main(String[] args) {
        int numDimes = 0;

        String suffix = (numDimes == 1) ? " dime" : " dimes";

        System.out.println("Your change is " + numDimes + suffix);
    }
}
