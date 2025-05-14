
import java.util.Scanner;

public class funPowerof {
    public static int power2(int base, int exponent){
        int result = 1;
        for(int i=0; i<exponent; i++){
            result *= base;
        }
        return result;
    }
    public static int sum0fdigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int numberofdigits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
    public static int isprime(int n){
        if(n <= 1) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return 0;
        }
        return 1;
    }
    public static int perfectsquare(int n){
        int sqrt = (int)Math.sqrt(n);
        return (sqrt * sqrt == n) ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent for power calculation:");
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        System.out.println("Power: " + power2(base, exponent));
        System.out.println("Enter a number to sum its digits:");
        int num = sc.nextInt();
        System.out.println("Sum of digits: " + sum0fdigits(num));
        System.out.println("Enter a number to count its digits:");
        int numDigits = sc.nextInt();
        System.out.println("Number of digits: " + numberofdigits(numDigits));
        System.out.println("Enter a number to check if it's prime:");
        int primeNum = sc.nextInt();
        if(isprime(primeNum) == 1){
            System.out.println(primeNum + " is a prime number.");
        } else {
            System.out.println(primeNum + " is not a prime number.");
        }
        System.out.println("Enter a number to check if it's a perfect square:");
        int squareNum = sc.nextInt();
        if(perfectsquare(squareNum) == 1){
            System.out.println(squareNum + " is a perfect square.");
        } else {
            System.out.println(squareNum + " is not a perfect square.");
        }
    }
}

