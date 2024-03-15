package zoho.Round2;

public class LargestContiguousSum {
    public static void main(String[] args) {
        int[] inputArray = {-10, 2, 3, -2, 0, 5, -15};
        int largestSum = findLargestContiguousSum(inputArray);

        System.out.println(largestSum);
    }

    static int findLargestContiguousSum(int[] arr){
        int maxOfTwo = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxOfTwo = Math.max(arr[i], maxOfTwo + arr[i]);
            maxSoFar = Math.max(maxOfTwo, maxSoFar);
        }
        return maxSoFar;
    }
}
