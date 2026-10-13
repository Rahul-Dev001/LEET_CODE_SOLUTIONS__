class Solution {
    public long maxAlternatingSum(int[] nums) {
        long p=0,n=0;
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(i < (nums.length)/2 ){
                n = n + nums[i]*nums[i];
            }
            else{
                p = p + nums[i]*nums[i]; 
            }
        }
        return (p - n);
    }
}