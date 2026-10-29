class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int min = 5001;

        while(left < right){
            int mid = left - (left - right)/2;

            if(nums[mid] < min){
                min = nums[mid];
            }
            if(nums[left] <= nums[mid] && nums[left] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        if(left == right){
            if(nums[left] < min){
                return nums[left];
            }
        }
        return min;
    }
}