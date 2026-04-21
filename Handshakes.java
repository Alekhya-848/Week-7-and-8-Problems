import java.util.Scanner;

public class Handshakes {

    static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students;
        System.out.print("Enter number of students: ");
        students = sc.nextInt();

        int result = calculateHandshakes(students);

        System.out.println("Maximum number of handshakes = " + result);
    }
}