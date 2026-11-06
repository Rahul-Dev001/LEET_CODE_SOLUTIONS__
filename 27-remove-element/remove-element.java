class Solution {
    public int removeElement(int[] nums, int val) {
        int dp = 0;
        // int p = 0;
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            // if(nums[p] != nums[dp]){
            // if(nums[dp] == val){
            //     nums[dp] = nums[p];
            //     nums[p] = 2;
            // }

            if(nums[dp] != val){
                dp++;
                // p++;
                // count++;

            }
            else{
                if(nums[i] != val){
                    nums[dp] = nums[i];
                    nums[i] = val;
                    dp++;

                }
                else{
                    count++;
                }
                
            }
            // else{
            //     p++;
            // }
            // if(nums[dp] == val){
            //     nums[dp] = nums[p];
            //     nums[p] = 2;
            // }




            
        }

        return nums.length - count;
    }
}