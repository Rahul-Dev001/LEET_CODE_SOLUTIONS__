class Solution {
    public void sortColors(int[] nums) {
        
        int a  = 0;
        int b = 0;
        int c = 0;


        for(int i = 0 ; i < nums.length; i++ ){
            if(nums[i] == 0){
                a++;
            }
            else if(nums[i] == 1){
                b++;
            }
            else{
                c++;
            }
        }
        int temp = 0;
        for(int i = 0 ; i < a ; i++){
            nums[temp] = 0;
            temp++;
        }
        for(int i = 0 ; i < b ; i++){
            nums[temp] = 1;
            temp++;
        }
        for(int i = 0 ; i < c ; i++){
            nums[temp] = 2;
            temp++;
        }

    }
}