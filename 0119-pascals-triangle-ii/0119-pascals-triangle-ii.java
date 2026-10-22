class Solution {
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