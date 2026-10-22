class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ptr1 = 0;
        int ptr2 = 0;
        // if(numbers.length == 2){
        //     return new int [] {1,2};
        // }
        // for( ; ptr2 < numbers.length ; ptr2++){
        //     if(numbers[ptr2] > target){
        //         break;
        //     }
        // }
        // ptr2--;
        // while(ptr1 < ptr2){
        //     if(numbers[ptr1] + numbers[ptr2] == target){
        //         return new int[] { ptr1+1, ptr2+1 };
        //     }
        //     else if((numbers[ptr1] + numbers[ptr2]) < target){
        //         ptr1++;
        //     }
        //     else if((numbers[ptr1] + numbers[ptr2]) < target){
        //         ptr2--;
        //     }
        // }
        //     return new int[] { ptr1+1, ptr2+1 };

        for(ptr1 = 0 , ptr2 = numbers.length - 1 ; ptr1 < ptr2 ; ){
            if(numbers[ptr1] + numbers[ptr2] == target){
                return  new int[] { ptr1+1, ptr2+1 };
            }
            else if((numbers[ptr1] + numbers[ptr2]) < target){
                ptr1++;
            }
            else if((numbers[ptr1] + numbers[ptr2]) > target){
                ptr2--;
            }
        }
        return  new int[] { ptr1+1, ptr2+1 };
    }
}