// replace every element with sum of right side element using array
// input = 10, 7, 8, 3, 12, 6  [46]
// output = 36, 29, 21, 18, 6, 0

public class rightEle_arr {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 3, 12, 6};
        int n = arr.length;
        int[] result = new int[n];
        int totalSum = 0;

        // Calculate the total sum of the array
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Replace each element with the sum of every right side element
        for (int i = 0; i < n; i++) {
            result[i] = totalSum - arr[i];
            totalSum -= arr[i];
        }

        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }    
}
