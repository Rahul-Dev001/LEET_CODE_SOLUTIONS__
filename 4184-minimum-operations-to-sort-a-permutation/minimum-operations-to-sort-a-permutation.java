class Solution {
    public int minOperations(int[] nums) {
        int flag = 0; 
        int min = 10000000;
        int min_idx = 0;
        int max_idx = 0;
        int max = -10000000;
        int l = nums.length;

        for(int i = 0 ; i < l ; i++){
            if(nums[i%l] > nums[(i+1)%l]){
                flag++;
            }
            if(min > nums[i]){
                min = nums[i];
                min_idx = i;
            }
            
        }
        if(flag < 2){
            return Math.min(min_idx , l - min_idx + 2);
        }
        flag = 0;

        for(int i = 0 ; i < l ; i++){
            if(nums[i%l] < nums[(i+1)%l]){
                flag++;
            }
            if(max < nums[i]){
                max = nums[i];
                max_idx = i;
            }
            
        }
        if(flag < 2){
            return Math.min(max_idx + 1 , l - max_idx + 1) ;
        }
        return -1;
    }
}