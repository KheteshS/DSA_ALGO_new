class Solution {
    public void sortColors(int[] nums) {
        // --------------------------Brute force-------------------------
        // Time Complexity: O(n),We traverse the array twice: once to count, once to overwrite. Each operation is O(n).

        // Space Complexity: O(1), We use only a constant number of counters regardless of the input size. No extra array is used
        // Initialize count variables for 0s, 1s, and 2s
        // int count0 = 0, count1 = 0, count2 = 0;

        // // Count the frequency of 0s, 1s, and 2s
        // for (int num : nums) {
        //     if (num == 0)
        //         count0++;
        //     else if (num == 1)
        //         count1++;
        //     else
        //         count2++;
        // }

        // // Overwrite the array with sorted values
        // int index = 0;

        // // Fill with 0s
        // while (count0-- > 0) {
        //     nums[index++] = 0;
        // }

        // // Fill with 1s
        // while (count1-- > 0) {
        //     nums[index++] = 1;
        // }

        // // Fill with 2s
        // while (count2-- > 0) {
        //     nums[index++] = 2;
        // }


        // ----------------------------better -----------------------------
        // Count of 0s, 1s, and 2s
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        // First pass: Count the number of 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) cnt0++;
            else if (num == 1) cnt1++;
            else cnt2++;
        }

        // Second pass: Fill the array with 0s, then 1s, then 2s

        // Fill the first 'cnt0' elements with 0
        for (int i = 0; i < cnt0; i++) {
            nums[i] = 0;
        }

        // Fill the next 'cnt1' elements with 1
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            nums[i] = 1;
        }

        // Fill the remaining elements with 2
        for (int i = cnt0 + cnt1; i < nums.length; i++) {
            nums[i] = 2;
        }

    }
}