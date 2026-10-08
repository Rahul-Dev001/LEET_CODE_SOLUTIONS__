class Solution {
    public String removeOuterParentheses(String s) {

        // char s1[] = s.toCharArray();
        StringBuilder sb = new StringBuilder(s);

        StringBuilder result = new StringBuilder();
        int open  = 0;
        for(int i = 0 ; i < s.length() ; i++){
            
            if(s.charAt(i) == '('){
                if(open == 0){ //check for removable open parenthesis
                    sb.setCharAt(i,'0') ;
                }
                open++;
            }
            else{
                open --;
                if(open > 0){  //check for removable closing paranthesis
                    
                }
                else{
                    sb.setCharAt(i,'0');
                }
            }

            // appends the correct answer
            if(sb.charAt(i) == '0'){

            }else{
                result.append(sb.charAt(i));
            }
        }
        
        return result.toString();
    }
}
// class Solution {
//     public String removeOuterParentheses(String s) {
//         // String s1 = s.substring(1, s.length()-1);
//         char s1[] = s.substring(1, s.length()-1).toCharArray();
//         StringBuilder result = new StringBuilder();
//         int open  = 0;
//         int close = 0;

//         for(int i = 0 ; i < s1.length ; i++){
//             if(s1[i] == '('){
//                 open++;
//             }else{
//                 if(open > 0){
//                     open--;
                    
//                 }
//                 else{
//                     s1[i] = 0;
//                 }
//             }
//         }
//         for(int i = s1.length -1 ; i >=0 ; i--){
//             if(s1[i] == ')'){
//                 close++;
//             }else{
//                 if(close>0){
//                     close--;
                    
//                 }
//                 else{
//                     s1[i] = 0;
//                 }
//             }
//         }
//         for(int i = 0 ; i < s1.length ; i++){
//             if(s1[i] == 0){

//             }else{
//                 result.append(s1[i]);
//             }
//         }
//         return result.toString();
//     }
// }