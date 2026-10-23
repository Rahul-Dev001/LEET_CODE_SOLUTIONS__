class Solution {
    public int sortPermutation(int[] nums) {
        
        boolean flag1 = false ;
        
        int k = 2147483647;

        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] == i)
        //         continue;
        //     for(int j = 0; j < nums.length ; j++){
        //         if(nums[j] == i){
        //             if((nums[i] & nums[j]) > k){
        //                 k = nums[i] & nums[j];
        //             }

        //             int temp = nums[j];
        //             nums[j] = nums[i];
        //             nums[i] = temp;
        //         }
        //     }
        // }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != i){
                k = nums[i]&k;
                if(!flag1){
                    flag1 = !flag1;
                }
            }
        }
        if(!flag1){
            return 0;
        }
        return k;
    }
}