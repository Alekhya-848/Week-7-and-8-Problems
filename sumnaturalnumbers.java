import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method
    static int sumRecursive(int n) {
        if (n == 1)
            return 1;
        return n + sumRecursive(n - 1);
    }

    // Formula method
    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int rec = sumRecursive(n);
            int form = sumFormula(n);

            System.out.println("Sum using recursion = " + rec);
            System.out.println("Sum using formula = " + form);

            if (rec == form) {
                System.out.println("Both results are correct");
            } else {
                System.out.println("Results are not equal");
            }
        }
    }
}