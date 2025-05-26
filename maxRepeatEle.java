// find the max repeated element from the array whose occurence in array is first compared to other elements, max can be any number, if 2 or more element has same occurence then print the first element in the array which has max count
// input = 1 3 4 2 1 3 4 5 2 8 1 6 8 4 5 3 6 7 5 
// output = 1

public class maxRepeatEle {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 1, 3, 4, 5, 2, 8, 1, 6, 8, 4, 5, 3, 6, 7, 5};
        int n = arr.length;
        int maxCount = Integer.MIN_VALUE;
        int maxEle = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxEle = arr[i];
            }
        }
        System.out.println(maxEle);
    }
}