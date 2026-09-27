class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double n1 = 0 ;
        double n2 = 0 ;
        int count ;
        int m = (nums1.length + nums2.length)/2;

        for(int i = 0,j = 0,k = 0 ; i <= m ; i++){
            int current;
            if(j != nums1.length && k != nums2.length){
                if(nums1[j] < nums2[k]){
                    current = nums1[j];
                    j++;

                }
                else{
                    current = nums2[k];
                    k++;
                }
            }
            else if(j != nums1.length){
                current = nums1[j];
                    j++;
            }
            else{
                current = nums2[k];
                    k++;
            }

            if(i == m){
                n1 = current;
            }
            if(i == m-1){
                n2 = current;
            }
        }
        if((nums1.length + nums2.length)%2 == 0){
            return (n1 + n2)/2; //i did a mistake in this is that when we add two integers it gives us integer so if n1 and n2 is int the ans will be wrong
        }
        else{
            return n1;
        }


        
    }
}

//i did a mistake in this is that when we add two integers it gives us integer 