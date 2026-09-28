class Solution {
    public int firstUniqChar(String s) {
        
        int arr[] = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i) - 'a'] ++ ;

        }
        for(int i = 0 ; i < s.length() ; i++){
            if(arr[s.charAt(i) - 'a'] == 1 ){
                return i;
            }
        }
        return -1;
    }
}


// class Solution {
//     public int firstUniqChar(String s) {
        
//         for(int i = 0 ; i < s.length() ; i++){
//             boolean flag = true;
//             for (int j = 0 ; j < s.length() ; j++){
//                 if(s.charAt(i) == s.charAt(j) && i!=j){
//                     flag = false;
//                 }

//             }
//             if(flag){
//                 return i;
//             }
//         }return -1;
//     }
// }