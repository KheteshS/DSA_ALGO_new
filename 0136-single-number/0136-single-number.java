class Solution {
    public int singleNumber(int[] nums) {
        // brute force
        int n = nums.length;
        
        if(n == 1) {
            return nums[0];
        }
        for( int i = 0; i<n;i++) {
            int num = nums[i];
            int count = 0;
            for(int j = 0; j< n ;j++) {
                if(nums[j] == num) {
                    count++;
                }
            }

            if(count == 1) {
                return num;
            }
        }

        return -1;
    }
}