class Solution {

    /**
    Time Complexity: O(rowIndex), because exactly one coefficient is generated for each position in the requested row.
    Space Complexity: O(rowIndex), because the returned row contains rowIndex + 1 values; auxiliary space besides the answer is O(1)
     */
    public List<Integer> getRow(int rowIndex) {
        rowIndex = rowIndex + 1;
        List<Integer> result = new ArrayList<>();
        long ans = 1;
        result.add(1);

        for( int col =1; col< rowIndex;col++) {
            ans = ans * (rowIndex - col);
            ans = ans / col;

            result.add((int)ans);
        }

        return result;
    }
}