class Solution {
    public int concatenatedBinary(int n) {
        long result = 0;
        int MOD = 1_000_000_007;
        int binaryLength = 0;

        for (int i = 1; i <= n; i++) {
            // If i is a power of 2, the number of bits required increases by 1
            // e.g., 2 (10), 4 (100), 8 (1000)
            if ((i & (i - 1)) == 0) {
                binaryLength++;
            }

            // 1. Shift current result left by the number of bits in 'i'
            // 2. Add 'i' to the result
            // 3. Apply modulo
            result = ((result << binaryLength) | i) % MOD;
        }

        return (int) result;
    }
}