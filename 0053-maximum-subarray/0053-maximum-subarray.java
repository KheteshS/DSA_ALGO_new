class Solution {
    public int maxSubArray(int[] nums) {
        /* Initialize maximum sum with the smallest possible integer */
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        // ---------------Brute---------------------

        // Time Complexity: O(N^3), where N is the size of the array. This is because we have three nested loops: one for the starting index, one for the ending index, and one for calculating the sum of the subarray.
        // Space Complexity: O(1), as we are using a constant amount of space for variables, regardless of the input size.

        // Iterate over each starting index of subarrays
        // for (int i = 0; i < nums.length; i++) {

        //     /* Iterate over each ending index of subarrays starting from i */
        //     for (int j = i; j < nums.length; j++) {

        //         /* Variable to store the sum of the current subarray */
        //         int sum = 0;

        //         // Calculate the sum of subarray nums[i...j]
        //         for (int k = i; k <= j; k++) {
        //             sum += nums[k];
        //         }

        //         /* Update maxi with the maximum of its current value and the sum of the current subarray */
        //         maxi = Math.max(maxi, sum);
        //     }
        // }
        // // Return the maximum subarray sum found
        // return maxi;

        // ---------------------------better----------------------------------
        // Time Complexity: O(N^2), where N is the size of the array. This is because we have two nested loops: one for the starting index and one for the ending index of the subarray.

        // Space Complexity: O(1), as we are using a constant amount of space for variables, regardless of the input size.

        // Iterate over each starting index of subarrays
        // for (int i = 0; i < nums.length; i++) {
        //     /* Variable to store the sum of the current subarray */
        //     int sum = 0; 

        //     /* Iterate over each ending index of subarrays starting from i */
        //     for (int j = i; j < nums.length; j++) {

        //         /* Add the current element nums[j] to the sum i.e. sum of nums[i...j-1] */
        //         sum += nums[j];

        //         /* Update maxi with the maximum of its current value and the sum of the current subarray */
        //         maxi = Math.max(maxi, sum);
        //     }
        // }

        // // Return the maximum subarray sum found
        // return maxi;

        // ---------------------------------Optimized (Kadane's Algorithm)---------------

        // Time Complexity: O(n), where n is the number of elements in the array. We traverse the array only once.
        // Space Complexity: O(1). We use a constant amount of space for variables.

        // Current sum of subarray 
        int sum = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // Add current element to the sum
            sum += nums[i];

            // Update maxi if current sum is greater
            if (sum > maxi) {
                maxi = sum;
            }

            // Reset sum to 0 if it becomes negative
            if (sum < 0) {
                sum = 0;
            }
        }

        // Return the maximum subarray sum found
        return (int) maxi;
    }
}