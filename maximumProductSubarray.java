class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (pre == 0)
                pre = 1;
            if (suff == 0)
                suff = 1;
            pre *= arr[i];
            suff *= arr[n-1-i];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
}
