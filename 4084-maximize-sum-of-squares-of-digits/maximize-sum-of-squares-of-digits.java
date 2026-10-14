class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder();
        if(num*9<sum){
            ans.append("");
            return ans.toString();
        }
        while(sum/9 > 0){
            ans.append("9");
            num--;
            sum = sum-9;

        }
        if(sum%9 != 0){
            ans.append(String.valueOf(sum%9));
            num--;
        }
        
        
        while(num>0){
            ans.append("0");
            num--;
        }

        return ans.toString();

    }
}