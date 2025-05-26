// given string str, the task is to write a java program to swap the pairs of characters of the string. if the string contains an odd number of characters then the last character remains as it is.
// input = str = "java"
// output = "ajav"
// using array list

import java.util.*;
class strQue1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        String swappedStr = new String(arr);
        System.out.println("Swapped string: " + swappedStr);
    }
}
