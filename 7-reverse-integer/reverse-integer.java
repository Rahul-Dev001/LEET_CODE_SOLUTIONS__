class Solution {
    public int reverse(int x) {
        double a = 0;
        // if(x < (-1*Integer.MAX_VALUE) && x > Integer.MAX_VALUE ){
        //     return 0;
        // }

        for(int i = Math.abs(x) ; i > 0; i = i/10){
            a = a*10 + i%10;
        }
        

        if(a < (-1*Integer.MAX_VALUE) || a > Integer.MAX_VALUE ){
            return 0;
        }
        if(x >= 0 ){
            return (int ) a;
        }
        else{
            int b = (int ) a;
            return -1*b;
        }
    
    }
}