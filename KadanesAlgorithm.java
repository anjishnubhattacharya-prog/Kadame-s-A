public class KadanesAlgorithm {

    public static int maxSubArraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSoFar = arr[0];

        System.out.println("Tracing Kadane's Algorithm execution:");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-10s | %-12s | %-15s | %-12s\n", 
                          "Index (i)", "Element", "Current Sum", "Max So Far");
        System.out.println("-------------------------------------------------------");
        
        System.out.printf("%-10d | %-12d | %-15d | %-12d\n", 
                          0, arr[0], currentSum, maxSoFar);

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);

            System.out.printf("%-10d | %-12d | %-15d | %-12d\n", 
                              i, arr[i], currentSum, maxSoFar);
        }
        
        System.out.println("-------------------------------------------------------");
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.print("Array: [ ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("]\n");

        int maxSum = maxSubArraySum(numbers);

        System.out.println("\nMaximum contiguous subarray sum is: " + maxSum);
    }
}