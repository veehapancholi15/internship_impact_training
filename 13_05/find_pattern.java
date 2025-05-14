import java.util.Scanner;

public class find_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int line, itr;
        for(line = 0; line < num; line++){
            for(itr = 1; itr <= num; itr++){
            System.out.printf("%2d", (itr + (line*num) + " "));
            }
        }
    } 
}
    