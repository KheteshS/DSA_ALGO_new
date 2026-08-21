class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n == 1) {
            return nums[0];
        }

        // ----------------------brute force--------------------------
        // for( int i = 0; i<n;i++) {
        //     int num = nums[i];
        //     int count = 0;
        //     for(int j = 0; j< n ;j++) {
        //         if(nums[j] == num) {
        //             count++;
        //         }
        //     }

        //     if(count == 1) {
        //         return num;
        //     }
        // }
        // return -1;

        // ------------------------better approach-------------------
        Map<Integer, Integer> freq = new HashMap<>();

        for( int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        for(int num: nums) {
            if(freq.get(num) == 1) {
                return num;
            }
        }

        return -1;
        
    }
}