class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            // If nums[i] is 0, it stays 0 (logic handles this naturally)
            // If nums[i] > 0, we move right.
            // If nums[i] < 0, we move left (adding a negative is moving left).
            
            int steps = nums[i];
            
            // Calculate circular index
            // We use (i + steps) % n + n) % n to handle both positive and negative wrap-around
            int targetIndex = ((i + steps) % n + n) % n;
            
            result[i] = nums[targetIndex];
        }

        return result;
    }
}
