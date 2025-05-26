// write a function to perform transpose of a given matrix
// 3 3

// 1 2 3
// 4 5 6
// 7 8 9

// 1 4 7
// 2 5 8
// 3 6 9

// give code

import java.util.Scanner;
class funMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose of the matrix is");
        transpose(a,r,c);
    }
    static void transpose(int a[][],int r,int c){
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}