class Solution {
    void pushZerosToEnd(int[] arr) {
        int nonZeroIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroIdx];
                arr[nonZeroIdx] = arr[i];
                arr[i] = temp;
                nonZeroIdx++;
            }
        }
    }
}
