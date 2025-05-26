// write a program to read a string and arrange the words in lexicographical order
// input = It is fine to test a String like this
// output = a fine It is like String test this to

import java.util.Scanner;
class strSorting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        
        // Sort the words in lexicographical order
        java.util.Arrays.sort(words);
        
        // Print the sorted words
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
