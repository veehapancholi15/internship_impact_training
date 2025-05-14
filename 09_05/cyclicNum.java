import java.util.Scanner;
public class cyclicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        num = sc.nextLong();
        long digit, safe, pos;
        long cy_num=0;

        for(pos=1; num>=pos; pos*=10);
        pos/=10;
        safe=num;

        do { 
            digit=num%10;
            num=num/10;
            num=digit*pos+num;
            System.out.println(num);
        } while ((num!=safe) && (num!=cy_num));
        if(num==cy_num){
            System.out.println("CYCLIC");
        }
        else{
            System.out.println("NOT CYCLIC");
        }
    }
}
