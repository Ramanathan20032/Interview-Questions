package zoho.Round2;

import java.util.Scanner;

public class HallowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit : ");
        int n = sc.nextInt();
        logic(n);
        sc.close();
    }
    static void logic(int n){
        int size = (n * 2) - 1;
        int[][] arr = new int[size][size];
        int start = 0;
        int end = size - 1;

        while (n != 0) {
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    if (i == start || i == end || j == start || j == end) {
                        arr[i][j] = n;
                    }
                }
            }
            start++;
            end--;
            n--;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

/*

Enter the Limit : 5
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

*/
