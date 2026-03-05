class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        # We use the XOR approach for efficiency
        res = 0
        for char in s:
            res ^= ord(char)
        for char in t:
            res ^= ord(char)
            
        return chr(res)