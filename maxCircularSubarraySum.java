class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;
        int total = 0, maxSum = arr[0], currMax = 0;
        int minSum = arr[0], currMin = 0;
        for (int i = 0; i < n; i++) {
            currMax = Math.max(arr[i], currMax+arr[i]);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(arr[i], currMin+arr[i]);
            minSum = Math.min(minSum, currMin);
            total += arr[i];
        }
        return (maxSum < 0) ? maxSum : Math.max(maxSum, total-minSum);
    }
}
