class Solution {
    /**
    Time Complexity: O(n²) , where n is numRows, because every value in the returned triangle is created once.
    Space Complexity: O(1) auxiliary space is used beyond the returned triangle, and the returned triangle stores O(numRows²) values.
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for(int row =0; row< numRows; row++) {
            List<Integer> current = new ArrayList<>();

            // fill the row with initial value as 1
            for( int col = 0; col<= row ; col++) {
                current.add(1);
            }

            // fill the inner values of row from previous row, leaving the first and last value of the row 
            for( int col = 1; col < row; col++) {
                int value = triangle.get(row-1).get(col - 1) + triangle.get(row-1).get(col);
                current.set(col, value);
            } 

            triangle.add(current);
        }
        return triangle;
    }
}