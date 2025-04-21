class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        if (arr == null || arr.length <= 1) {
            return Arrays.asList(arr);
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : arr) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged;
    }
}
