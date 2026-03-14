class Solution {
    public int longestPalindrome(String s) {
        // Use an array for ASCII characters (128 covers A-Z and a-z)
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int freq : count) {
            // Add the largest even part of the frequency
            length += (freq / 2) * 2;
            
            // Check if there's a remainder to use as a center piece
            if (freq % 2 != 0) {
                hasOdd = true;
            }
        }

        // If we found at least one odd frequency, add 1 for the center
        return hasOdd ? length + 1 : length;
    }
}