class Solution:
    def intersection(self, nums1: list[int], nums2: list[int]) -> list[int]:
        # Convert both lists to sets to remove duplicates
        set1 = set(nums1)
        set2 = set(nums2)
        
        # Use the set intersection operator '&' and convert back to a list
        return list(set1 & set2)
        