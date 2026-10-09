class Solution {
    public int[] sortArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        sort(nums , left , right);
        return nums;
    }
    public static void sort(int[]nums , int left , int right){
        if(left >= right){
            return ;
        }
        int mid = left + (right - left)/2;

        sort(nums , left , mid);
        sort(nums , mid+1 , right);

        merge(nums , left , right, mid);
    }
    public static void merge(int []nums ,int left ,int right ,int mid){
        
        int temp[] = new int[right - left+1];

        int i = left;
        int  j = mid+1;
        int k = 0;
        while(i <= mid && j <= right){
            if(nums[i]<=nums[j]){
                temp[k] = nums[i];
                k++;
                i++;
            }else{
                temp[k] = nums[j];
                k++;
                j++;
            }

            
        }
        while(i <= mid){
            temp[k] = nums[i];
            k++;
            i++;
        }
        while(j <= right){
            temp[k] = nums[j];
            k++;
            j++;
        }

        for(int a = 0 ; a < temp.length ; a++){
            nums[left+a] = temp[a];
        }
        

    }
    
}