// reverse an array
// input = 10, 7, 8, 3, 2, 6
// output = 6, 2, 3, 8, 7, 10

public class reverseArr {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 3, 2, 6};
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        // Reverse the array
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }

        // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
