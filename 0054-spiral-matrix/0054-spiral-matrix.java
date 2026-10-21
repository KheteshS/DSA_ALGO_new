class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // if a matrix is empty & has no cells to traverse
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        List<Integer> spiral = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int top = 0;
        int right = columns - 1;
        int bottom = rows -1;
        int left = 0;

        // traverse one layer at a time 
        while( top <= bottom && left <= right) {
            // adds the current top row from left to right 
            for(int col = left; col <= right; col++) {
                spiral.add(matrix[top][col]);
            }
            top++;

            // adds the current right column from top to bottom 
            for(int row = top; row <= bottom; row++  ) {
                spiral.add(matrix[row][right]);
            }
            right--;

            // bottom row exists only if top has not crossed it 
            if(top <= bottom) {
                // adds the current bottom row from right to left
                for ( int col = right; col >= left; col--) {
                    spiral.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // left row exists only if right has not crossed it
            if(left <= right ) {
                // adds the current left column from bottom to top
                for(int row = bottom; row >= top ; row--) {
                    spiral.add(matrix[row][left]);
                }
                left++;
            }
        }
        return spiral;
    }
}