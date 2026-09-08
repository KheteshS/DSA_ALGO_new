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
        // Time Complexity: O(N), where N is the size of the input array. This is because we are iterating through the array once to count occurrences and then iterating through the hashmap to find the majority element.

        // Space Complexity: O(N), as we are using a hashmap to store the counts of each element, which can take up to N space in the worst case.

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() > n / 2) {
        //         return entry.getKey();
        //     }
        // }
        // return -1;

        // ---------------------------Optimized (Moore's Voting Algo)----------------------------
        int count = 0;
        int el = -1;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                el = nums[i];
                count++;
            } else if (el == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        // this step should not be done if the majority element always exists in the array.
        // count = 0;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == el)
        //         count++;
        // }
        // if (count > n / 2) {
        //     return el;
        // } else {
        //     return -1;
        // }
        return el;

    }
}