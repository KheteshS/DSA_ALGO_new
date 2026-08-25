class Solution {
    public int[] twoSum(int[] nums, int target) {
        // ------------------brute------------------
        // for( int i=0;i<nums.length;i++) {
        //     for(int j = i+1;j<nums.length; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             return new int[]{i, j}; 
        //         }
        //     }
        // }
        // return new int[] {-1,-1};

        // -----------------better -----------------
        Map<Integer, Integer> mapIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int more = target - nums[i];

            if (mapIndex.containsKey(more)) {
                return new int[] { i, mapIndex.get(more) };
            }
            mapIndex.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}