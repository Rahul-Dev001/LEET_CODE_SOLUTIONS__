class Solution {
    //------- made another function but not required realised after writing the whole code

    // public String func(int n){
    //     if(n==1){
    //         String r1 = "1";
    //         return r1;
    //     }
    //     String b = func(n-1);
    //     StringBuilder sb = new StringBuilder();
        
    //     char temp = b.charAt(0);
    //     int count = 1 ;

    //     for(int i = 1 ; i < b.length() ; i++){
    //         if(b.charAt(i) == temp){
    //             count++;
    //         }
    //         else{
    //             sb.append(count);
    //             sb.append(temp);
    //             temp = b.charAt(i);
    //             count = 1;
    //         }
    //     }
    //     sb.append(count);
    //     sb.append(temp);

    //     return sb.toString();
    // }

    // public String countAndSay(int n) {
    //     int a = n;
    //     return func( a );
    // }


    public String countAndSay(int n) {
        if(n==1){
            
            return "1";
        }
        String tempstr = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        
        char temp = tempstr.charAt(0);
        int count = 1 ;

        for(int i = 1 ; i < tempstr.length() ; i++){
            if(tempstr.charAt(i) == temp){
                count++;
            }
            else{
                sb.append(count);
                sb.append(temp);
                temp = tempstr.charAt(i);
                count = 1;
            }
        }
        sb.append(count); //append the final set of repeated non repeated number after the for loop ends
        sb.append(temp);

        return sb.toString();
    }

    
}