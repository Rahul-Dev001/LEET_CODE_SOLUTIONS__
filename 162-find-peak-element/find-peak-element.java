class Solution {
    public int findPeakElement(int[] nums) {
        
        int ans = 0;
        boolean inc = true;
        boolean dec = true;
        if(nums.length ==1){
            return 0;
        }

        for(int i = 0 ; i < nums.length-2 ; i++){
            if(nums[i] < nums[i+1] && nums[i+1] > nums[i+2]){
                return i+1;
            }
            // else if(nums[i] < nums[i+1] && nums[i+1] < nums[i+2]){
            //     dec = false;
            // }
            // else{
            //     inc = false;
            // }
        }
        if(nums[0]<nums[1]){
            return nums.length-1;
        }
        // if(inc){
        //     return nums.length - 1;
        // }
        // if(dec){
        //     return 0;
        // }

        return 0;

    }
}