class Solution {
    public boolean canWinNim(int n) {
        // You lose if and only if n is a multiple of 4
        return n % 4 != 0;
    }
}