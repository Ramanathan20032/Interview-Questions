package SoftSquare;

import java.util.Arrays;

public class MinMaxPositionChange {
    public static void main(String[] args) {
        PositionChange(new int[]{346, 5 ,2 ,6 ,7 ,89 ,-90 ,6});
        //                      [-90, 5, 2, 6, 7, 89, 346, 6]
    }

    static void PositionChange(int[] arr){
        int maxPos = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                maxPos = i;
            }
        }
        int minPos = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                minPos = i;
            }
        }

        arr[maxPos] = min;
        arr[minPos] = max;
        System.out.println(Arrays.toString(arr));
    }
}
