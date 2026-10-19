class Solution {
    public int removeDuplicates(int[] nums) {
        int expectedNums[] = new int [nums.length];
        int ptr = 0; 
        int k = 0;
        
        expectedNums[0] = nums[0];
        ptr++;
        k++;
        int count = 1;
       
        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] == nums[i-1]){
                count++;
                if(count < 3){
                    expectedNums[ptr++] = nums[i];
                    k++;
                }

            }
            else{
                count = 1;
                expectedNums[ptr++] = nums[i];
                k++;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = expectedNums[i];
        }
        return k;
    }
}