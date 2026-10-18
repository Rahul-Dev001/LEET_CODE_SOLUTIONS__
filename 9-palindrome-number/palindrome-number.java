class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();

        for( ; x != 0 ; x = x/10){
            sb.append(x%10);
        }

        for(int i = 0 ,j = sb.length() - 1 ; i < j ; i++,j--){
            if(sb.charAt(i) != sb.charAt(j))
                return false;
        }

        return true;
    }
}