class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = getValue(s.charAt(i));
            
            // If the next value is larger, subtract the current instead of adding
            if (i < n - 1 && current < getValue(s.charAt(i + 1))) {
                ans -= current;
            } else {
                ans += current;
            }
        }
        return ans;
    }

    // A simple helper method is faster and cleaner than a Map
    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}