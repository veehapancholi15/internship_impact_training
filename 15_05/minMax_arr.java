// find min and max along with its position in an array
// input = 10, 7, 8, 3, 2, 6
// output = min = 2, max = 10, min_pos = 4, max_pos = 0

public class minMax_arr {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 3, 2, 6};
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];
        int min_pos = 0;
        int max_pos = 0;

        // Find min and max along with their positions
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_pos = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                max_pos = i;
            }
        }

        // Print the results
        System.out.println("Min: " + min + ", Max: " + max);
        System.out.println("Min Position: " + min_pos + ", Max Position: " + max_pos);
    }    
}
