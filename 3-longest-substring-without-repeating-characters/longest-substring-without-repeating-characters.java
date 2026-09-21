class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set = new HashSet<>();
        int largest = 0,
        left = 0,
        right = 0;
        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                largest = Math.max(largest , right-left);

            }
            else{
                set.remove(s.charAt(left));
                left++;
            }


        }
        return largest;

    }
}