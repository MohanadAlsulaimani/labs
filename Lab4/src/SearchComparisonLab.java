

public class SearchComparisonLab {

    public static int linearSearch(int[] data, int key) {

        int comparisons = 0;
        for (int i = 0; i < data.length; i++) {
            comparisons++;
            if (data[i] == key) {
                System.out.println("Linear Search -> key: " + key + " | Comparisons: " + comparisons + " | Index: " + i);
            return comparisons;
            }
        }
        System.out.println("Linear Search -> key: " + key + " | Comparisons: " + comparisons + " | Index: -1 (Not Found)");
        return comparisons;
    }
    public static int binarySearch(int[] data, int key) {
        int left = 0;
        int right = data.length -1;
        int comparisons = 0;

        while (left <= right) {
            comparisons++;
            int mid = left + (right - left) / 2;

            if (data[mid] == key) {
                System.out.println("Binary Search  -> Key: " + key + " | Comparisons: " + comparisons + " | Index: " + mid);
                return comparisons;
            } else if (data[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Binary Search  -> Key: " + key + " | Comparisons: " + comparisons + " | Index: -1 (Not Found)");
        return comparisons;
    }
    public static void main(String[] args ) {
        int[] data = {3, 7, 11, 15, 19, 23, 27, 31, 35, 39};

        int[] testKeys = {3, 27, 39, 50};

        for (int key : testKeys) {
            linearSearch(data, key);
            System.out.println();
            binarySearch(data, key);
        }


    }
}