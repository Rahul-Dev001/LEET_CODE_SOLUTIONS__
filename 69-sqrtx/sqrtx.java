class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        int left = 1;
        int right = x/2;
        if(x==1)
        return 1;
        while(left <= right){
            double mid = left - (left-right)/2;

            if(mid*mid == x){
                return (int)mid;
            }
            else if(mid*mid > x){
                right = (int)mid-1;
                
            }else{
                left = (int)mid+1;
                if(mid > ans){
                    ans = (int)mid;
                    }
            }
        }

        return ans;
        
    }
}