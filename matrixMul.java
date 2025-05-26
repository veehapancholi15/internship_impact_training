// write a function to perform matrix multiplication of given two square matrices
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9

// 9 8 7
// 6 5 4
// 3 2 1

// 30 24 18
// 84 69 54
// 138 114 90

// give code
import java.util.Scanner;
class matrixMul{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        System.out.println("Enter the elements of the first matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The product of the two matrices is");
        mul(a,b,r,c);
    }
    static void mul(int a[][],int b[][],int r,int c){
        int mul[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mul[i][j] = 0;
                for(int k=0;k<c;k++){
                    mul[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}