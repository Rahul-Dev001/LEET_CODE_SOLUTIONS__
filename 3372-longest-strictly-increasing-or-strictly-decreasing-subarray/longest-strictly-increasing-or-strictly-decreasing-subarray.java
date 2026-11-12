class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 1;
        int temp = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            // int temp = 1;
            if (nums[i] < nums[i + 1]) {
                temp++;
            } else {
                if (temp > count) {
                    count = temp;
                }
                temp = 1;
            }

        }
        if (temp > count) {
            count = temp;
        }
        temp = 1;

        for (int i = nums.length - 1; i > 0; i--) {
            // int temp = 1;
            if (nums[i] < nums[i - 1]) {
                temp++;
            } else {
                if (temp > count) {
                    count = temp;
                }
                temp = 1;

            }

        }
        if (temp > count) {
            count = temp;
        }
        temp = 1;

        return count;
    }
}