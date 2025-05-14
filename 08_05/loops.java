// fibonacci series for N terms
import java.util.Scanner;
class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num!=0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}