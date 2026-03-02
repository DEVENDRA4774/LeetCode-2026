class Solution {
    public boolean isUgly(int n) {
        // Step 1: Handle non-positive numbers
        if (n <= 0) return false;

        // Step 2: Divide out all factors of 2, 3, and 5
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }

        // Step 3: Check if the remaining value is 1
        return n == 1;
    }
}