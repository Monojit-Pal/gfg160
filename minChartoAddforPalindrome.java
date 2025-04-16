class Solution {
    public static int minChar(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String temp = s + "#" + rev;
        int[] lps = computeLPS(temp);
        return s.length() - lps[lps.length - 1];
    }
    
    private static int[] computeLPS(String str) {
        int[] lps = new int[str.length()];
        int len = 0;
        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
