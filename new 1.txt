import java.util.Scanner;

public class SimpleInterest {
    
    static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal, rate, time;

        System.out.print("Enter Principal: ");
        principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        time = sc.nextDouble();

        double si = calculateSI(principal, rate, time);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate " + rate +
                " and Time " + time);
    }
}