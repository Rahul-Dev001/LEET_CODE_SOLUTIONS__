class Solution {
    public boolean isValid(String s) {
        int st[] = new int[s.length()];
        int top = -1;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('|| s.charAt(i) == '{' || s.charAt(i) == '['){
                st[++top] = s.charAt(i);
                
            }
            else{
                if(top < 0){
                    return false;
                }
                else if(s.charAt(i) == ')' && st[top] == '('){
                    st[top--] = 0;
                }
                else if(s.charAt(i) == '}' && st[top] == '{'){
                    st[top--] = 0;
                }
                else if(s.charAt(i) == ']' && st[top] == '['){
                    st[top--] = 0;
                }
                else{
                    return false;
                }
                

            }
        }
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    
}