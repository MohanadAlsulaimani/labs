import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

 
 

public class ArrayReview {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // 1) Initialize an array with random values (0..99)
        int n = 20;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Array elements:");
        printArray(arr);

        // 2) Calculate average and count below/above average
        double avg = average(arr);
        int below = 0, above = 0;

        for (int x : arr) {
            if (x < avg) below++;
            else if (x > avg) above++;
        }

        System.out.printf("%nAverage = %.2f%n", avg);
        System.out.println("Below average = " + below);
        System.out.println("Above average = " + above);

        // 3) Find and swap the largest and smallest elements
        int minIndex = indexOfMin(arr);
        int maxIndex = indexOfMax(arr);

        System.out.println("\nSmallest value = " + arr[minIndex] + " at index " + minIndex);
        System.out.println("Largest value  = " + arr[maxIndex] + " at index " + maxIndex);

        swap(arr, minIndex, maxIndex);

        System.out.println("\nArray after swapping smallest and largest:");
        printArray(arr);

        // Call selectionSort method (sorts from smallest to largest)

         selectionSort(arr);

       /* Arrays.sort(arr);*/

        System.out.println("\nArray after sorting:");
        printArray(arr);

        // Test Binary Search on a sorted array

        int target1 = arr[rand.nextInt(arr.length)];

        int indexResult = binarySearch(arr, target1, 0, arr.length - 1);

        if (indexResult != -1) {
            System.out.println("\nBinary Search: Target " + target1 + " found at index: " + indexResult);
        } else {
            System.out.println("\nBinary Search: Target " + target1 + " not found.");
        }

        // 4)
        System.out.print("\nEnter an element to search: ");
        int target = in.nextInt();

        int idx = linearSearch(arr, target);
        if (idx != -1) {
            System.out.println("Found at index: " + idx);
        } else {
            System.out.println("Not found.");
        }

        in.close();
    }

    // -------- Helper methods --------

    private static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) { // Smallest to largest
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }

    public static int binarySearch(int[] data, int target1, int low, int high) {
        if (low > high)
            return -1;
        else {
            int mid = (low + high) / 2;
            if (target1 == data[mid])
                return mid;
            else if (target1 < data[mid])
                // Fixed: passed 'low' and 'mid - 1'
                return binarySearch(data, target1, low, mid - 1);
            else
                // Correct: passed 'mid + 1' and 'high'
                return binarySearch(data, target1, mid + 1, high);
        }
    }

    private static double average(int[] arr) {
        long sum = 0;
        for (int x : arr) sum += x;
        return (double) sum / arr.length;
    }

    private static int indexOfMin(int[] arr) {
        int minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) minIdx = i;
        }
        return minIdx;
    }

    private static int indexOfMax(int[] arr) {
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIdx]) maxIdx = i;
        }
        return maxIdx;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
