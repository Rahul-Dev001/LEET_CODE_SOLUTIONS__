class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aa = Integer.parseInt(arriveAlice.substring(0,2) + "" + arriveAlice.substring(3,5));
        int al = Integer.parseInt(leaveAlice.substring(0,2) + "" + leaveAlice.substring(3,5));
        int ba = Integer.parseInt(arriveBob.substring(0,2) + "" + arriveBob.substring(3,5));
        int bl = Integer.parseInt(leaveBob.substring(0,2) + "" + leaveBob.substring(3,5));
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        if(al < ba || bl < aa ){
            return 0;
        }

        if(aa <= ba && bl <= al){
            if(ba/100 == bl/100){
                sum += bl%100 - ba%100 + 1 ;
            }
            else{
                sum += (days[ba/100 - 1] - ba%100) + 1;
                sum += bl%100;
            }
            for(int i = (ba/100)+1; i <= (bl/100)-1 ; i++){
                sum += days[i-1];
            }

            return sum;

        }
        if(ba <= aa && al <= bl){
            if(aa/100 == al/100){
                sum += al%100 - aa%100 + 1 ;
            }
            else{
                sum += (days[aa/100 - 1] - aa%100) + 1;
                sum += al%100;
            }
            for(int i = (aa/100)+1; i <= (al/100)-1 ; i++){
                sum += days[i-1];
            }

            return sum;

        }
        if(aa <= ba && al <= bl){
            if(ba/100 == al/100){
                sum += al%100 - ba%100 + 1 ;
            }
            else{
                sum += (days[ba/100-1] - ba%100) + 1;
                sum += al%100;
            }
            for(int i = (ba/100)+1; i <= (al/100)-1 ; i++){
                sum += days[i-1];
            }

            return sum;
        }
        if(ba <= aa && bl <= al){
            if(aa/100 == bl/100){
                sum += bl%100 - aa%100 + 1 ;
            }
            else{
                sum += (days[aa/100 - 1] - aa%100) + 1;
                sum += bl%100;
            }
            for(int i = (aa/100)+1; i <= (bl/100)-1 ; i++){
                sum += days[i-1];
            }

            return sum;            
        }
        return 0;
    }
}