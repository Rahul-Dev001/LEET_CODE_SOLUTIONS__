//imp for interview and basics so it fails due to 

// All five of your method parameters (cost1, cost2, costBoth, need1, need2) are declared as int. In Java, when you multiply two int values together (like cost1 * need1), Java performs the calculation as a 32-bit int first, causing it to overflow and wrap around to a negative number (-1530494976) before widening it to fit into your long variable.

// class Solution {
//     public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        
//         long a = Math.max(need1 , need2)*costBoth ;
//         long b = cost1 * need1 + cost2 * need2 ;
//         long c = Math.min(need1,need2) * costBoth;
//         if(need1 > need2){
//             c += (need1 - need2)*cost1;
//         }
//         if(need2 > need1){
//             c += (need2 - need1)*cost2;
//         }

//         return Math.min(a,Math.min(b,c));
//     }
// }





class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long a = (long)Math.max(need1 , need2)*costBoth ;
        long b = (long)cost1 * need1 + (long)cost2 * need2 ;
        long c = (long)Math.min(need1,need2) * costBoth;
        if(need1 > need2){
            c += (long)(need1 - need2)*cost1;
        }
        if(need2 > need1){
            c += (long)(need2 - need1)*cost2;
        }

        return Math.min(a,Math.min(b,c));
    }
}