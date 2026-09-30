class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean flag = true;
        int count = -1;
        int k = 1;
        int shortest = 0 ;
        for(int i = 0 ; i < strs.length ; i++){
            if(strs[shortest].length() > strs[i].length()){
                shortest = i;
            }
            
        }
        for(int i = 1 ; i  <= strs[shortest].length() && flag ; i++){
            
            for(int j = 1 ; j < strs.length ; j++){
                if(!(strs[0].substring(0,i).equals(strs[j].substring(0,i)))){
                    flag = false;
                }
                
                
            }
            if(flag){
                    k++;
                    count++;
                }
            
        }
        return strs[0].substring(0,count+1);
    }
}