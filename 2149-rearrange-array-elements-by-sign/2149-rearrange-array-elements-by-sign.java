class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        // ------------------Brute-----------------------
        // Time Complexity: O(N+N/2) { O(N) for traversing the array once for segregating positives and negatives and another O(N/2) for adding those elements alternatively to the array, where N = size of the array A}.
        // Space Complexity: O(N/2 + N/2) = O(N) { N/2 space required for each of the positive and negative element arrays, where N = size of the array A}.

        // List<Integer> pos = new ArrayList<>();
        // List<Integer> neg = new ArrayList<>();

        // for (int i = 0; i < n; i++) {
        //     if (nums[i] > 0)
        //         pos.add(nums[i]);
        //     else
        //         neg.add(nums[i]);
        // }

        // for (int i = 0; i < n / 2; i++) {
        //     nums[2 * i] = pos.get(i);
        //     nums[2 * i + 1] = neg.get(i);
        // }
        // return nums;

        // ---------------------better-----------------------------
        // Time Complexity: O(N) { O(N) for traversing the array once and substituting positives and negatives simultaneously using pointers, where N = size of the array A}.
        // Space Complexity: O(N) { Extra Space used to store the rearranged elements separately in an array, where N = size of array A}.

        // int posIndex = 0, negIndex = 1;
        // int[] ans = new int[n];
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] < 0) {
        //         ans[negIndex] = nums[i];
        //         negIndex += 2;

        //     } else {
        //         ans[posIndex] = nums[i];
        //         posIndex += 2;
        //     }
        // }

        // return ans;

        // ----------------------------whne unequal array is there------------------------------
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                pos.add(nums[i]);
            else
                neg.add(nums[i]);
        }

        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                nums[index] = pos.get(i);
                index++;
            }

        } else {
            for (int i = 0; i < pos.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                nums[index] = neg.get(i);
                index++;
            }
        }

        return nums;
    }
}