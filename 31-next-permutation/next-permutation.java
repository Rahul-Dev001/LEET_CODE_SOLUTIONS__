class Solution {

    void reverse (int left ,int right ,int [] nums ){
        while(left < right ){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    void sort (int left ,int right ,int [] nums ){}

    public void nextPermutation(int[] nums) {
        int left = -1;
        int right = nums.length -1;
        
        for(int i = nums.length - 2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                left = i;
                
                break;
            }
            
        }

        if(left == -1){
            reverse(0,right,nums);
            return;
        }

        for(int i = nums.length - 1 ; left < i ; i--){
            if(nums[left] < nums[i]){
                int temp = nums[left] ; 
                nums[left] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        
        
        this.reverse(left+1,right,nums);
        return;
    }
}