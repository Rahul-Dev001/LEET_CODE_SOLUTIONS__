class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int tcount = 0;
        int scount = 0;
        for(int i  = 0  ; i < nums.length ; i++){
            if(target == nums[i])
            tcount++;
            else if(nums[i] < target)
            scount++;
        }
        for(int i = 0 ; i < tcount ; i++){
            ans.add(i+scount);
        }

        return ans;
    }
}

// Brute force

// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         List<Integer> ans = new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i  = 0  ; i < nums.length ; i++){
//             if(nums[i] == target){
//                 ans.add(i);
//             }
//         }

//         return ans;
//     }
// }