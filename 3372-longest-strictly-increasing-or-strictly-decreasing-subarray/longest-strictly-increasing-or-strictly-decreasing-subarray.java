class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 1;
        int temp = 1;

        //first loop goes from top to front checking for increasing order useful to check strictly increase 
        for (int i = 0; i < nums.length - 1; i++) {   
            // int temp = 1;
            if (nums[i] < nums[i + 1]) { //check for striclty increasing
                temp++;
            } else {
                if (temp > count) { //temp stores the count of each striclty increasing and we compare it with ans 
                    count = temp;
                }
                temp = 1; //make temp in the end of all increasing nums subarrays
            }

        }
        if (temp > count) {
            count = temp;    //check for same condition after end of loop for edge case where the longest strichtly increasing subarray continues to end and hence else never works in loop
        }
        temp = 1;


        //second loop goes from back to front checking for increasing ordr and hence checking all strictly decreasing ones
        for (int i = nums.length - 1; i > 0; i--) {
            // int temp = 1;
            if (nums[i] < nums[i - 1]) { //check for striclty increasing
                temp++;
            } else {
                if (temp > count) {  //temp stores the count of each striclty increasing and we compare it with ans 
                    count = temp;
                }
                temp = 1; //make temp in the end of all increasing nums subarrays

            }

        }
        //check for same condition after end of loop for edge case where the longest strichtly increasing subarray continues to end and hence else never works in loop
        
        if (temp > count) {
            count = temp;
        }
        temp = 1;

        return count;
    }
}