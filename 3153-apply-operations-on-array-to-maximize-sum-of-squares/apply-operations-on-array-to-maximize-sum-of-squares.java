// class Solution {
//     public int maxSum(List<Integer> nums, int k) {
//         nums.sort(java.util.Comparator.naturalOrder());
//         int a = nums.size();

//         for(int i = 0; i < a-k ; i++){
//             for(int j = a-1 ; j >= a-k ; j--){
//                 int b = nums.get(j) | nums.get(i);
                
//                 nums.set(i, nums.get(j) & nums.get(i));
//                 nums.set(j, b);

//             }
//         }
//     int ans = 0;
//         for(int j = a-1 ; j >= a-k ; j--){
//             ans = ans + nums.get(j)*nums.get(j);
//         }
//         return ans;
//     }
// }

// import java.util.List;

class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int MOD = 1_000_000_007;
        // Step 1: Count how many times each bit (0 to 30) is set across all numbers
        int[] bitCounts = new int[31];
        for (int num : nums) {
            for (int bit = 0; bit < 31; bit++) {
                if (((num >> bit) & 1) == 1) {
                    bitCounts[bit]++;
                }
            }
        }

        long totalSumOfSquares = 0;

        // Step 2: Greedily construct the k largest possible numbers
        for (int i = 0; i < k; i++) {
            long currentNum = 0;
            for (int bit = 0; bit < 31; bit++) {
                // If this bit is still available, pull it into our current max number
                if (bitCounts[bit] > 0) {
                    currentNum |= (1 << bit);
                    bitCounts[bit]--; // Consume the bit
                }
            }
            // Step 3: Square the constructed number and add to total under modulo
            long square = (currentNum * currentNum) % MOD;
            totalSumOfSquares = (totalSumOfSquares + square) % MOD;
        }

        return (int) totalSumOfSquares;
    }
}
