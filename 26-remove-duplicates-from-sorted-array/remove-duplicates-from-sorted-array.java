class Solution {
    public int removeDuplicates(int[] nums) {
        int nums1[] = new int[nums.length];
        int k = 0;
        for(int i =0, j = 0 ; i < nums.length; i++){
            if(i == 0){  //i did a mistake initially i put the codition j==0 which cause the else if statement to get ignored everytime
                nums1[j] = nums[i];
                k++;
            }
            else if(nums[i] != nums1[j]){
                j++;
                nums1[j] = nums[i];
                k++;
            }
            
        }
        for(int i = 0 ; i<nums.length; i++){
            nums[i] = nums1[i];
        }
        return k;
    }
}