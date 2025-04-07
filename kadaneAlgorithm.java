class Solution {
    int maxSubarraySum(int[] arr) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
