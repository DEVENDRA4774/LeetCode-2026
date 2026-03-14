class Solution {
    public boolean isPowerOfFour(int n) {
        // 1. Must be greater than 0
        // 2. Must be a power of two: (n & (n - 1)) == 0
        // 3. The '1' bit must be in an even position: (n & 0x55555555) != 0
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}