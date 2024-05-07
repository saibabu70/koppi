public class BinarySearch {
    // Binary search function
    static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start+end) / 2;

            if (key == arr[mid]) {
                return mid; // Target found
            } else if (key < arr[mid] ) {
                end = mid - 1; // Search in the right half
            } else {
                start = mid + 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    // Example usage
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetValue = 2;

        int result = binarySearch(sortedArray, targetValue);

        if (result != -1) {
            System.out.println("Element " + targetValue + " is present at index " + result + ".");
        } else {
            System.out.println("Element " + targetValue + " is not present in the array.");
        }
    }
}
