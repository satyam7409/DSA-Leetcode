public class PeakMountainInArray {
    static int binarySearch(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You are in decreasing part → peak is to the left (including mid)
                end = mid;
            } else {
                // You are in ascending part → peak is to the right
                start = mid + 1;
            }
        }

        // start == end is the peak
        return start;
    }

    public static void main(String[] args) {
        int arr[] = {0, 10, 11, 13, 14, 2, 1};
        int position = binarySearch(arr);
        System.out.println("position: " + position);  // Output should be index of peak
    }
}
