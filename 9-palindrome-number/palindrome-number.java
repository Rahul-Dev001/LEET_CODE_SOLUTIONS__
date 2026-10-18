// class Solution {
//     public boolean isPalindrome(int x) {
//         StringBuilder sb = new StringBuilder();

//         for(int i = )

//         return true;
//     }
// }


// brute force

class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();

        sb.append(x);

        for(int i = 0 ,j = sb.length() - 1 ; i < j ; i++,j--){
            if(sb.charAt(i) != sb.charAt(j))
                return false;
        }

        return true;
    }
}