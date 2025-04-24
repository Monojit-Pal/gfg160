class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        int n = a.length, m = b.length;
        int gap = nextGap(n + m);
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < (n +  m)) {
                int val1 = getVal(a, b, n, i);
                int val2 = getVal(a, b, n, j);
                if (val1 > val2) {
                    setVal(a, b, n, i, val2);
                    setVal(a, b, n, j, val1);
                }
                i++;
                j++;
            }
            gap = nextGap(gap);
        }
    }
    
    private int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }
    
    private int getVal(int[] a, int[] b, int n, int idx) {
        return idx < n ? a[idx] : b[idx - n];
    }
    
    private void setVal(int[] a, int[] b, int n, int idx, int value) {
        if (idx < n) a[idx] = value;
        else b[idx - n] = value;
    }
}
