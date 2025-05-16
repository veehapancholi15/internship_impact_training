// find kth greater element in an array without sorting
// input = 10, 7, 8, 9, 6
// k = 2
// output = 9

public class kGreaterEle {
     public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 6};
        int k = 2;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max - k) {
                count++;
            }
        }
        System.out.println("The " + k + "th greater element is: " + (max - k + 1));
     }
}
