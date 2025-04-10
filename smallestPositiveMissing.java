class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                arr[i] = n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            int a = Math.abs(arr[i]);
            if (a >= 1 && a <= n) {
                if (arr[a-1] > 0) {
                    arr[a-1] = -arr[a-1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) 
                return i+1;
                
        }
        return n+1;
    }
}
