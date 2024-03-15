package ComplainceCow;

public class longestSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(sequence(arr));
    }

    static int sequence(int[] arr){
        int count = 1;
        int maxCount = 1;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == arr[i-1] + 1){
                count++;
                maxCount = Math.max(count,maxCount);
            }
            else {
                count = 1;
            }
        }
        return maxCount;
    }
}
