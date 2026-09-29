class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0 ;

        while(low <= high){
            mid = low + (high -low)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[low] <= nums[mid]){ //REGRADLESS OF SOLUTION ALWAYS CHECK FOR [1] [1,3] [3,1]
                if(target < nums[mid] && target >= nums[low]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target <= nums[high] && target > nums[mid]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}