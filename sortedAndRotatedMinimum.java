class Solution {
    public int findMin(int[] arr) {
        int low = 0, high = arr.length -1;
        if (arr[low] <= arr[high]) {
            return arr[low];
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
