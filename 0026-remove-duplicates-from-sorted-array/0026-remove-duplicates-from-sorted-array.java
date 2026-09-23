class Solution {
    public int removeDuplicates(int[] nums) {
        int index =0;
        HashSet<Integer> seen = new HashSet<>();
        for(int item: nums) {
            if(!seen.contains(item)) {
                seen.add(item);
                nums[index] = item;
                index++;
            }
        }
        return index;   
    }
}