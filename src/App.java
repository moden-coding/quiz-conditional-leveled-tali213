import java.util.*;

/**
 * Task: Write code that will take input and output different messages.
 * 
 * Description: Our code should take in inputs then print a message based on
 * divisibility tests.
 * 
 * Basic task (up to B+ level): Take input from the user. Output if the number
 * is even or odd.
 * 
 * Moderate task (up to A level): Do all of the above AND check to see if the
 * number is divisible
 * by 3 and/or 5:
 * If the number is divisible by 3, print "The number is divisible by 3."
 * If the number is divisible by 5, print "The number is divisible by 5."
 * If divisible by both 3 and 5, print "The number is divisible by both 3 and
 * 5."
 * 
 * Challenge task (up to A+ level): Complete both of the above AND check to see
 * if the number
 * is greater than 10 and less than 100. If the number is less than 10 or above
 * 100, say "Wrong number!".
 * If the number is between 10 and 100, check to see if it is a prime number. A
 * prime number less than
 * 100 should be divisible by itself and 1 but not by 2, 3, 5, or 7.
 * 
 *     *I changed the 0's to 10's in the directions so I didnt confuse myself*
 */

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int first = Integer.valueOf(scanner.nextLine());

        if (first % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        if (first % 3 == 0 && first %5 != 0) {
            System.out.println("The number is divisable by 3.");
        }
        if (first % 5 == 0 && first % 3 != 0) {
            System.out.println("The number is divisable by 5.");
        }
        if (first % 3 == 0 && first % 5 == 0) {
            System.out.println("The number is divisable by both 3 and 5.");
        }

        if (first < 10 || first > 100) {
            System.out.println("Wrong number!");
        } else if (first > 10 && first < 100) {
            if (first % 1 == 0 && first % first == 0 && first % 2 != 0 && first % 3 != 0 && first % 5 != 0
                    && first % 7 != 0) {
                System.out.println("The number is prime.");
            }
        }
    }
}
