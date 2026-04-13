import java.util.Random;

public class PlayerHeights {

    // Method to find sum
    static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // Method to find mean
    static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find shortest
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    // Method to find tallest
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();

        // Generate random heights (150 to 250)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = r.nextInt(101) + 150;
        }

        // Display heights
        System.out.print("Heights: ");
        for (int i : heights) {
            System.out.print(i + " ");
        }

        System.out.println("\nMean Height = " + findMean(heights));
        System.out.println("Shortest Height = " + findMin(heights));
        System.out.println("Tallest Height = " + findMax(heights));
    }
}