
import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;

        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // Left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(
                    candies[i],
                    candies[i + 1] + 1
                );
            }
        }

        int sum = 0;
        for (int candy : candies) {
            sum += candy;
        }

        return sum;
    }
}



//most faah question and it took like hell lot of brain cells to do it


// class Solution {
//     public int candy(int[] ratings) {
//         // int ptr1 = 0;
//         // int ptr2 = 0;
//         int a = 0;
//         int c1 = 1;
//         int sum = 1;
//         if(ratings.length == 1){
//             return sum;
//         }
//         boolean flag = false;
//         for(int i = 1 ; i < ratings.length-1 ; i++){
//             if(ratings[i-1] < ratings[i]){
//                 c1++;
//                 sum += c1;
                


//                 if(!(ratings[i] <ratings[i+1])){
//                     a = c1;
//                     flag = true;
//                     c1 = 0;
//                 }
//             }
//             else if(ratings[i-1] == ratings[i] && ratings[i] == ratings[i+1]){
//             // else if(ratings[i-1] == ratings[i] ){
//                 flag = false;
//                 sum++;
//             }
//             else if(ratings[i-1] == ratings[i]){
//                 if(c1 == 0)
//                 c1++;
//                 flag = false;
//                 // sum++;
//                 sum += c1;
//             }
//             else{
//                 c1++;
//                 sum += c1;
//                 if(!(ratings[i] >ratings[i+1]) ){
//                     if(c1 >= a && flag){
//                         sum += (c1-a+1);
//                         flag = !flag;
//                     }
//                     if(flag == true)
//                         flag = !flag;
//                     c1 = 1;
//                 }
//             }
//         }

//         if(ratings[ratings.length - 2] == ratings[ratings.length - 1]){
//             sum++;
//         }
//         else{
//             c1++;
//             sum += c1;
//             if(c1 >= a && flag){
//                         sum += (c1-a+1);
//                     }
//         }

        

        

//         return sum;
//     }
// }