// find the second maximum element in an array
// input = 12, 45, 78, 5, 34, 67, 90, 6, 72
// output = 78
// check maximum element and second maximum element
// first maximum element is 90
// second maximum element is 78

public class secMaxEle_arr {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 5, 34, 67, 90, 6, 72};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        // Find the maximum and second maximum elements
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        // Print the second maximum element
        System.out.println("Maximum Element: " + max);
        if (secMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum element found.");
        } else {
            System.out.println("Second Maximum Element: " + secMax);
        }
    }
}
