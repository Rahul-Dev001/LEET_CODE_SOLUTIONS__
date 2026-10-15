class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;

        for (int i = 0; i < nums.size(); i++) {
            Set<Integer> temp = new HashSet<>();

            for (int j = i; j < nums.size(); j++) {
                temp.add(nums.get(j));

                ans += temp.size() * temp.size();
            }
        }

        return ans;
    }
}
//above approach
// For [1, 2, 1]:
// - i = 0: [1], [1,2], [1,2,1]
// - i = 1: [2], [2,1]
// - i = 2: [1]


// i am making to do it in the order first one element subarrays than 2 elemnt than threee and so on

// class Solution {
//     public int sumCounts(List<Integer> nums) {
//         Set<Integer> temp = new HashSet <> ();
//         int ans = 0;

//         for(int i = 1 ; i <= nums.size() ; i++){
//             for(int j = 0 ; j < nums.size() ;j++){
                
//                 if(j >= i ){
//                     ans = ans + (temp.size() * temp.size());
//                     temp.remove(nums.get(j-i));
//                 }
                
//                 temp.add(nums.get(j));
//             }
//         }
//         return ans;
//     }
// }