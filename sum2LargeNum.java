// program to find the sum of two large numbers.
// imput: str1 = "23", str2 = "25"
// outpu: "48"
// using array list

import java.util.*;
class sum2LargeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        String str1 = sc.nextLine();
        System.out.println("Enter the second number");
        String str2 = sc.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();
        int carry = 0;
        StringBuilder result = new StringBuilder();

        // Add digits from the end of both strings
        for (int i = 0; i < Math.max(n1, n2); i++) {
            int digit1 = (i < n1) ? str1.charAt(n1 - 1 - i) - '0' : 0;
            int digit2 = (i < n2) ? str2.charAt(n2 - 1 - i) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        // If there's a carry left, append it
        if (carry > 0) {
            result.append(carry);
        }

        // Reverse the result to get the final sum
        System.out.println("Sum: " + result.reverse().toString());
    }
}