class Solution {
public:
    int minAddToMakeValid(string s) {
        int count = 0;
        int open = 0;
        for(char ch : s){
            if(ch =='('){
                count++;
                open++;
            }
            else{
                if(open > 0){
                    count--;
                    open--;
                }
                else{
                    count++;
                }
            }
        }
        return count;
    }
};