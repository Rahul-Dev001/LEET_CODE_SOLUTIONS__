class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int close = 0;
        int ans = 0; 
        for(int i = 0 ; i < s.length() ; i++ ){

            if(i != 0){
                if(s.charAt(i-1) == ')' && s.charAt(i) == '('){
                    if(open == 0){
                        if(close%2 == 0){
                            ans += close/2;
                            close = 0;
                        }
                        else{
                            ans += close/2 + 1;
                            ans++;
                            close  = 0;
                        }
                    
                }
                else if(open * 2 < close){
                    close = close - open * 2;
                    open = 0;
                    if(close%2 == 0){
                            ans += close/2;
                            close = 0;
                        }
                        else{
                            ans += close/2 + 1;
                            ans++;
                            close  = 0;
                        }
                }
                else{
                    if(close%2 == 0){
                            open = open - close/2;
                            close = 0;
                        }
                        else{
                            open = open - (close/2 + 1);
                            close = 0;
                            ans++;
                        }
                }
                }
            }
            

            if(s.charAt(i) == '('){
                open++;
            }
            else{
                close++;
                
            }

            
            
        }

        if(open == 0){
                        if(close%2 == 0){
                            ans += close/2;
                            close = 0;
                        }
                        else{
                            ans += close/2 + 1;
                            close  = 0;
                            ans++;
                        }
                    
                }
                else if(open * 2 < close){
                    close = close - open * 2;
                    open = 0;
                    if(close%2 == 0){
                            ans += close/2;
                            close = 0;
                        }
                        else{
                            ans += close/2 + 1;
                            ans++;
                            close  = 0;
                        }
                }
                else{
                    if(close%2 == 0){
                            open = open - close/2;
                            ans += open * 2;
                            close = 0;
                        }
                        else{
                            open = open - (close/2 + 1);
                            ans += open * 2;
                            ans++;
                            close = 0;

                        }
                }
        
        

    return ans;
    }
// class Solution {
//     public int minInsertions(String s) {
//         int open = 0;
//         int close = 0;
//         int ans = 0;
//         for(int i = 0 ; i < s.length() ; i++ ){

//             if(i != 0){
//                 if(s.charAt(i-1) == ')' && s.charAt(i) == '('){
//                 if(open*2 >= close){
//                     ans = ans+ open*2 - close;
//                 }else{
//                     ans = ans + close/2 - open;
//                     if(close % 2 != 0){
//                         ans++;
//                         ans++;
//                     }
//                 }
//                 open = 0;
//             close = 0;
//              }
            
//             }
            

//             if(s.charAt(i) == '('){
//                 open++;
//             }
//             else{
//                 close++;
                
//             }

            
            
//         }

//         if(open*2 >= close){
//                     ans = ans+ open*2 - close;
                    
//                 }else{
//                     ans = ans + close/2 - open;
//                     if(close % 2 != 0){
//                         ans++;
//                         ans++;
                        
//                     }
//                 }
        

//     return ans;
//     }


// class Solution {
//     public int minInsertions(String s) {
//         int open = 0;
//         int close = 0;
//         int ans = 0;
//         for(int i = 0 ; i < s.length() ; i++ ){
//             if(s.charAt(i) == '('){
//                 open++;
//             }
//             else{
//                 if(open > 0){
//                     close++;
//                 }
//                 if(open > 0 && close >= 2){
//                     open--;
//                     close--;
//                     close--;
//                 }
                
//             }
            
//         }
//         ans += open*2 - close;

//         open = 0;
//         close = ans;

//         for(int i = s.length()-1 ; i >= 0 ; i-- ){
//             if(s.charAt(i) == ')'){
//                 close++;
//             }
//             else{
//                 if(close > 0){
//                     open++;
//             }
//                 if(close >= 2 && open >= 1){
//                     open--;
//                     close--;
//                     close--;
//                 }
                
//             }
            
//         }
//         ans += close/2 ;
//         if(close%2 != 0){
//             ans++;
//             ans++;
//         }



//     return ans;
//     }
}