package SoftSquare;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    static void print(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(" ");
            }
            for (int k = i; k <= n; k++) {
                if(k % 2 == 0){
                    System.out.println("$");
                }
                else {
                    System.out.println("X");
                }
            }
            System.out.println();
        }
    }
}
