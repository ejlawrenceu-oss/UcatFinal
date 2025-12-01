import java.util.Scanner;
/**
 * Write a description of class UCAT__1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UCAT__1
{
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
 
        while (true) {
            System.out.print("Please enter a number between 1 and 100: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 1 && number <= 100) {
                    System.out.println("Thank you! Your number is within the valid range.");
                    break;
                } else {
                    System.out.println("The number is not within the range of 1 to 100. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }
 
        scanner.close();
    }
}
 
 
