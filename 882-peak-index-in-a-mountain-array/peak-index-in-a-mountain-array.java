class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0 , high = arr.length-1 , mid = 0 , ans = 0 ;
        while(low <= high){
            mid = low + (high - low)/2;
                ans = arr[ans] < arr[mid] ? mid : ans  ;
            if(arr[mid] < arr[mid + 1]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}