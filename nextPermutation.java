class Solution {
    void nextPermutation(int[] arr) {
        int idx = -1;
        int n = arr.length;
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] < arr[i+1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            for (int i = 0, j = n-1; i < j; i++, j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            return;
        }
        for (int i = n-1; i > idx; i--) {
            if (arr[i] > arr[idx]) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            } 
        }
        for (int i = idx + 1, j = n-1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =  temp;
        }
    }
}
