package zoho.Round2;

import java.util.Scanner;

public class LatinSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int  n = sc.nextInt();
        latin(n);
        sc.close();
    }

    static void latin(int n){
        int[][] arr = new int[n][n];

        // fill the latin square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (i + j) % n + 1;
            }
        }

        // print the latin square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
    Enter the limit : 5
    1 2 3 4 5
    2 3 4 5 1
    3 4 5 1 2
    4 5 1 2 3
    5 1 2 3 4
*/