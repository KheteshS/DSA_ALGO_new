class Solution {

    // Time Complexity: O(n²), because transposition touches roughly half the matrix and row reversal touches all rows.
    // Space Complexity: O(1), because the matrix is modified in place with only temporary variables.

    public void reverseRow(int[] row) {
        int left = 0;
        int right = row.length - 1;

        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // transpose the matrix by swapping across main diagonal 
        for (int row = 0; row < n - 1; row++) {
            for (int col = row + 1; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // reverse array row to complete the clockwise rotation
        for (int row = 0; row < n; row++) {
            reverseRow(matrix[row]);
        }

    }
}