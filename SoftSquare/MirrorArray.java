package SoftSquare;

import java.util.Arrays;

/*    0 0 0 0 5
      0 0 0 2 6
      0 0 3 8 1
      0 4 7 5 2
      3 6 4 1 7
---------------------------
      7 1 4 6 5
      2 5 7 4 6
      1 8 3 8 1
      6 4 7 5 2
      3 6 4 1 7

 */

public class MirrorArray {
    public static void main(String[] args) {
        int arr[][] = {{0,0,0,0,5} ,
                       {0,0,0,2,6} ,
                       {0,0,3,8,1} ,
                       {0,4,7,5,2} ,
                       {3,6,4,1,7}
        };

        int k = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int l = arr.length - 1;
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = arr[k][l];
                l--;
            }
            k--;
        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
