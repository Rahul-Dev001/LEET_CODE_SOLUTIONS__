class Solution {
    public String[] createGrid(int m, int n) {
        String []s = new String[m]; 
        StringBuilder sb = new StringBuilder();


        for(int i = 0 ; i < m ; i++){
            
            if(i != m-1 && i != 0){
                s[i] = sb.toString();
                continue;
            }
            else{
                sb.setLength(0);
            }
            for(int j = 0 ; j < n ; j++){
                if(i != m-1 ){
                    if(j != 0){
                        sb.append("#");

                    }
                    else{
                        sb.append(".");
                    }
                }
                else{
                    sb.append(".");
                }
            }
            s[i] = sb.toString();

        }
        return s;
    }
}