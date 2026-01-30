class Solution {
    public String longestPalindrome(String s) {
        int[] result = {0, 0}; // Stores start and end index

        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i, result);     // Odd length
            expand(s, i, i + 1, result); // Even length
        }
        return s.substring(result[0], result[1] + 1);
    }

    private void expand(String s, int i, int j, int[] res) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            if (j - i > res[1] - res[0]) {
                res[0] = i;
                res[1] = j;
            }
            i--; j++;
        }
    }
}