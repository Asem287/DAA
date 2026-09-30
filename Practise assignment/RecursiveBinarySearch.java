public class RecursiveBinarySearch {

    public static int binarySearch(int[] arr, int target, int low, int high) {

        int mid = low + (high - low) / 2;

        // element is found
        if (arr[mid] == target) {
            return mid;
        }

        // recursive step to find element on the right or left side
        if (target < arr[mid]) {
            return binarySearch(arr, target, low, mid - 1); // left half side
        } else {
            return binarySearch(arr, target, mid + 1, high); // right half side
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };

        int target = 23;
        int result = binarySearch(arr, target, 0, arr.length - 1);

        System.out.println("Element's index " + target + " is on: " + result);
    }
}
