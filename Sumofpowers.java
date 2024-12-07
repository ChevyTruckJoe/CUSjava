public class Sumofpowers {
    public static void main(String[] args) {
        int n = 50; 
        double sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += Math.pow(3, i);
        }

        System.out.println("The sum of the sequence is: " + sum);
    }
}