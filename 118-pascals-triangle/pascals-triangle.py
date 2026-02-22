class Solution:
    def generate(self, numRows):
        # Initialize the triangle list
        triangle = []

        for i in range(numRows):
            # Create a row filled with 1s (length of row is i + 1)
            row = [1] * (i + 1)
            
            # The first and last elements are always 1, 
            # so we only iterate through the middle elements.
            for j in range(1, i):
                # Each middle element is the sum of the two elements 
                # directly above it in the previous row.
                row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
            
            # Add the completed row to our triangle
            triangle.append(row)
            
        return triangle