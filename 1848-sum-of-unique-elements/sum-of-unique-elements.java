class Solution {
    public int sumOfUnique(int[] nums) {
        boolean seen[] = new boolean[101];
        boolean f_seen[] = new boolean[101];
        
        for(int i = 0 ; i < nums.length ; i++){
            if(f_seen[nums[i]]){
                seen[nums[i]] = true;
            }
            f_seen[nums[i]] = true;
            


        }
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(f_seen[nums[i]] && !seen[nums[i]]){
                ans += nums[i];
            }
        }
        return ans;
    }
}