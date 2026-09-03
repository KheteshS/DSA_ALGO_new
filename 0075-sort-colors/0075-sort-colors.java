class Solution {
    public void sortColors(int[] nums) {
        // Time Complexity: O(n),We traverse the array twice: once to count, once to overwrite. Each operation is O(n).

        // Space Complexity: O(1), We use only a constant number of counters regardless of the input size. No extra array is used
        // Initialize count variables for 0s, 1s, and 2s
        int count0 = 0, count1 = 0, count2 = 0;

        // Count the frequency of 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0)
                count0++;
            else if (num == 1)
                count1++;
            else
                count2++;
        }

        // Overwrite the array with sorted values
        int index = 0;

        // Fill with 0s
        while (count0-- > 0) {
            nums[index++] = 0;
        }

        // Fill with 1s
        while (count1-- > 0) {
            nums[index++] = 1;
        }

        // Fill with 2s
        while (count2-- > 0) {
            nums[index++] = 2;
        }

    }
}