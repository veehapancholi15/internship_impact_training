// print all even numbers in the given range START and END, both inclusive, in reverse order
// START = 10, END = 20
// output: 20, 18, 16, 14, 12, 10
// use recursion

import java.util.Scanner;
class chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter START: ");
        int start = sc.nextInt();
        System.out.print("Enter END: ");
        int end = sc.nextInt();
        printEvenNumbersInReverse(start, end);
    }

    public static void printEvenNumbersInReverse(int start, int end) {
        if (end < start) {
            return;
        }
        if (end % 2 == 0) {
            System.out.print(end + " ");
        }
        printEvenNumbersInReverse(start, end - 1);
    }
}

