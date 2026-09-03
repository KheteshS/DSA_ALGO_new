class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // ---------------------Brute -----------------------------------
        // Time Complexity: O(N^2), where N is the size of the input array. This is because we are using a nested loop to count the occurrences of each element.
        // Space Complexity: O(1), as we are using a constant amount of space for the counters and indices.

        // for (int i = 0; i < n; i++) {
        //     int count = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if (count > n / 2)
        //         return nums[i];
        // }
        // return -1;

        // ------------------------Better ------------------------------
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}