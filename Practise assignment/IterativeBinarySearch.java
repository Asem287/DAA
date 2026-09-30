public class IterativeBinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // element is found
            } else if (arr[mid] < target) {
                low = mid + 1; // searching on the right half side
            } else {
                high = mid - 1; // searching on the left half side
            }
        }
        return -1; // ELement is not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };

        // 3 examples
        System.out.println("Index 23: " + binarySearch(arr, 23)); // ex1
        System.out.println("Index 5: " + binarySearch(arr, 5)); // ex2
        System.out.println("Index 100: " + binarySearch(arr, 100)); // ex3
    }
}
