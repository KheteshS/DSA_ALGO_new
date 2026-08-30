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
        // Map<Integer, Integer> mapIndex = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     int more = target - nums[i];

        //     if (mapIndex.containsKey(more)) {
        //         return new int[] { i, mapIndex.get(more) };
        //     }
        //     mapIndex.put(nums[i], i);
        // }
        // return new int[] { -1, -1 };

        //  ----------------optimal ----------------------

        int n = nums.length;
        int[][] numsWithIndex = new int[n][2];

        //store elements with original index 
        for (int i = 0; i < n; i++) {
            numsWithIndex[i][0] = nums[i];
            numsWithIndex[i][1] = i;
        }

        // sort by the value to apply two pointers
        Arrays.sort(numsWithIndex, (a,b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = numsWithIndex[left][0] + numsWithIndex[right][0];

            if (sum == target) {
                return new int[] { numsWithIndex[left][1], numsWithIndex[right][1] };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] { -1, -1 };
    }
}