import java.util.Scanner;

public class Totalandaverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 0;

        System.out.println("Enter double values (enter -1 to stop):");

        while (true) {
            double value = scanner.nextDouble();
            if (value == -1) {
                break;
            }
            total += value;
            count++;
        }

        if (count > 0) {
            double average = total / count;
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No values were entered.");
        }

        scanner.close();
    }
}
