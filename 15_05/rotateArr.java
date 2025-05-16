// rotate once the array to its right side
// input = 10, 7, 8, 9, 6
// output = 6, 10, 7, 8, 9

public class rotateArr {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 6};
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }    
}
