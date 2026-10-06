class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        int open = 0;
        int close = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                open++;
                count ++;
            }
            else if(ch == ')'){
                if(open > 0){
                    count--;
                    open--;
                }
                else{
                    count++;
                }
                

            }
            
        }
        count = Math.abs(count);
        return count;
    }
}