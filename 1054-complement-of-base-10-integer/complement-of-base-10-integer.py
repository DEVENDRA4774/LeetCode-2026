class Solution:
    def bitwiseComplement(self, n: int) -> int:
        # Edge case: The binary representation of 0 is "0", so its complement is "1".
        if n == 0:
            return 1
            
        # Create a bitmask of all 1s of the same bit length as n.
        mask = (1 << n.bit_length()) - 1
        
        # XOR n with the mask to flip all the bits.
        return n ^ mask
        