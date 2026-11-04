class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int product2 = 1;
        boolean flag = true;
        int count = 0 ;
        int ans [] = new int[nums.length];
    for(int i = 0 ; i < nums.length ; i++){
        product *= nums[i];
        if(nums[i] != 0){
            product2 *= nums[i];
            // flag = !flag;
            
        }else{
            count++;
        }
    }
    if(count > 1){
        flag = !flag;
    }
    for(int i = 0 ; i < nums.length ; i++){
        if(nums[i] != 0){
        ans[i] = product/nums[i];
        }
        else{
            if(flag){
            ans[i] = product2;
            }
            else{
                ans[i] = product;
            }
        }
    }

    return ans;
    }
}