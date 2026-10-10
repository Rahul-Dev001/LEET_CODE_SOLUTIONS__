class Solution {
    String convert(String s, int numRows) {
        List<List<Character>> nums = new ArrayList<>();
        if(s.length() ==0){
            return s;
        }
        char arr[] = new char[s.length() ];
        int a = 0;
        for(int i = 0 ; i < numRows ; i++){
            nums.add(new ArrayList<>());
        }
        while(a < s.length()){
            
            for(int j = 0 ; j < numRows && a < s.length(); j++){
                nums.get(j).add(s.charAt(a++));
            }
            for(int k = numRows - 1 -1 ; k > 0 && a < s.length() ; k--){
                nums.get(k).add(s.charAt(a++));
                
            }
        }
        a = 0;
        for(int i = 0 ; i < nums.size() ; i++){
            for(int j = 0 ; j<nums.get(i).size() ; j++){
                arr[a++] = nums.get(i).get(j);
            }
        }
        return new String(arr);

    }
}