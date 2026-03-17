import java.util.Arrays;

class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxArea = 0;

        // Step 1: Update matrix to represent heights of consecutive 1s
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] += matrix[i - 1][j];
                }
            }
        }

        // Step 2: For each row, sort heights and calculate max area
        for (int i = 0; i < m; i++) {
            // We clone the row to avoid issues if the original matrix 
            // needs to be preserved, or sort in-place for efficiency.
            int[] currentRow = matrix[i].clone();
            Arrays.sort(currentRow);

            // Step 3: Iterate backwards (tallest to shortest)
            for (int j = 0; j < n; j++) {
                // Height is currentRow[n - 1 - j], width is (j + 1)
                int height = currentRow[n - 1 - j];
                int width = j + 1;
                maxArea = Math.max(maxArea, height * width);
            }
        }

        return maxArea;
    }
}