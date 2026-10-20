class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ls = new ArrayList<>();
        // ls.add(1);
        int sum = 0;
        if(s == 1){
            return ls;
        }
        for(int i = 2 ; i <= s && i <= n ; i++ ){
            if(isPrime(i)){
                sum += i;
                if(sum > s){
                    return ls;
                }
                ls.add(i);
            }
        }
        return ls;
    }


    public boolean isPrime(int a){
        if(a == 2 || a == 3 || a == 5 || a == 7 || a == 11){
            return true;
        }
        if(a%2 == 0 || a%3 == 0 || a%5 == 0 || a%7 == 0 && a > 7){
            return false;
        }
        for(int i = (int)Math.sqrt(a) ; i > 7 ; i--){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}