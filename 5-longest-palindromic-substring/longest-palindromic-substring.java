// attempt one calculation erorrs in calculating the start 

// class Solution {
//     public String longestPalindrome(String s) {
//         StringBuilder sb = new StringBuilder();
//         if(s.length() == 1){
//             sb.append(s.charAt(0));
//         }
//         // int center[] = new int (s.length() + 1 );
//         int ans  = 1;
//         int start = 0;
//         for(int i = 1 ; i < s.length()-1 ; i++){
//             if(s.charAt(i-1) == s.charAt(i+1)){
//                 int temp = 1;
//                 int j = 1;
//                 for( ; j+i < s.length() && i-j >= 0 ; j++){
//                     if(s.charAt(i-j) == s.charAt(i+j)){
//                         temp += 2;
//                     }
//                     else{

//                         break;
//                     }
//                 }
//                 if(temp > ans){
//                     ans = temp;
//                     start = i-j+1;
//                     // sb.append(s.subString(i-j+1,i+j));
//                 }
//             }
//             if(s.charAt(i) == s.charAt(i+1)){
//                 int temp = 1;
//                 int j = 1;
//                 for( ; j+i < s.length() && i-j >= 0 ; j++){
//                     if(s.charAt(i-j) == s.charAt(i+1+j)){
//                         temp += 2;
//                     }
//                     else{

//                         break;
//                     }
//                 }
//                 if(temp > ans){
//                     ans = temp;
//                     start = i-j+1;
//                     // sb.append(s.subString(i-j+1,i+j));
//                 }
//             }

//         }

//         return s.substring(start,start + ans);
//     }
// }



class Solution {
    public String longestPalindrome(String s) {
        // StringBuilder sb = new StringBuilder();
        if(s.length() == 1){
            return s;
        }

        if(s.length() == 2 && s.charAt(0) == s.charAt(1)){
            
            return s;
        }
        else if(s.length() == 2){
            return s.substring(0,1);
        }
        // int center[] = new int (s.length() + 1 );
        int start  = 0;
        int end = 0;
        int len = 1;
        for(int i = 1 ; i < s.length() ; i++){
            if(i+1 < s.length() ){
            if(s.charAt(i-1) == s.charAt(i+1)){
                int temp = 1;
                int j = 1;
                for( ; i + j < s.length() && i-j >= 0 ; j++){
                    if(s.charAt(i-j) == s.charAt(i+j)){
                        temp += 2;
                    }
                    else{

                        break;
                    }
                }
                if(temp > len){
                    len = temp;
                    start = i-j+1;
                    // sb.append(s.subString(i-j+1,i+j));
                }
            }}
            if(s.charAt(i-1) == s.charAt(i)){
                int temp = 2;
                int j = 1;
                for( ; j+i < s.length() && i-j-1 >= 0 ; j++){
                    if(s.charAt(i-1-j) == s.charAt(i+j)){
                        temp += 2;
                    }
                    else{

                        break;
                    }
                }
                if(temp > len){
                    len = temp;
                    start = i-j;
                    // sb.append(s.subString(i-j+1,i+j));
                }
            }

        }

        return s.substring(start,start + len);
    }
}