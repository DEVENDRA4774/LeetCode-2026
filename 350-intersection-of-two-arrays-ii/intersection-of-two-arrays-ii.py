import collections

class Solution:
    def intersect(self, nums1: list[int], nums2: list[int]) -> list[int]:
        # Count the frequencies of each number in the first array
        counts = collections.Counter(nums1)
        result = []
        
        # Iterate through the second array to find overlapping elements
        for num in nums2:
            if counts[num] > 0:
                result.append(num)
                counts[num] -= 1  # Decrement the count to handle duplicates properly
                
        return result