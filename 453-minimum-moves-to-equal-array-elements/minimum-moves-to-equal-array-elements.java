class Solution {
    public int minMoves(int[] nums) {

        if(nums.length == 1){
            return 0;
        }

        int ans = 0 , count = 0;
        

        Arrays.sort(nums);

        for(int i = nums.length - 1 ; i > 0 ; i--){
            count++;
            ans += (nums[i] - nums[i-1]) * count;
            
        }

        return ans;

    }
}