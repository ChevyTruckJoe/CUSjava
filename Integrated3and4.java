
import java.util.Scanner;

 
public class Integrated3and4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //odd/even
        System.out.print("Enter an integer to check if it is even : ");
        int number = scanner.nextInt();
        boolean evenResult = utils.isEven(number);
        System.out.println("Is the number even? : " + evenResult);

        
        
        // Test min method
        System.out.print("Enter 3 integers to find the smallest\n");
        
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int c = scanner.nextInt();
        int minValue = utils.min(a, b, c);
        System.out.println("The minimum value is: " + minValue);

        scanner.close();
    }

    

    
}