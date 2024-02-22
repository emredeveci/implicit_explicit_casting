
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable initialization
        int inputInteger;
        double inputDouble;
        char inputChar;

        //scanner initialization
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        inputInteger = scanner.nextInt();

        System.out.print("Enter a decimal: ");
        inputDouble = scanner.nextDouble();

        System.out.print("Enter a char: ");
        inputChar = scanner.next().charAt(1);

        //Implicit casting of an integer to a double
        double castDouble = inputInteger;
        System.out.println("Implicit casting of your integer " + inputInteger + " to a double is equal to: " + castDouble);

        //Explicit casting of a double to an integer
        int castInteger = (int) inputDouble;
        System.out.println("Explicit casting of your double " + inputDouble + " to an integer is equal to: " + castInteger);

        //Explicit casting of a char to an integer
        int ascii = inputChar;
        System.out.println("Explicit casting of your char " + inputChar + " to an int is equal to: " + ascii);

        int intToChar = (char) inputInteger;
        System.out.println("Explicit casting of your integer " + inputInteger + " to a char is equal to " + intToChar);

    }
}