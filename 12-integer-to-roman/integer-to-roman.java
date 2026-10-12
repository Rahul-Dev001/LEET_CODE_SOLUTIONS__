class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<num/1000 ; i++){
            sb.append('M');
            // num = num-1000;
        }
        num = num%1000;

        for(int i = 0 ; i<num/900;i++){
            sb.append("CM");
        }
        num = num%900;

        for(int i = 0 ; i<num/500;i++){
            sb.append('D');
        }
        num = num%500;

        for(int i = 0 ; i<num/400;i++){
            sb.append("CD");
        }
        num = num%400;
        
        for(int i = 0 ; i<num/100;i++){
            sb.append('C');
        }
        num = num%100;
        
        for(int i = 0 ; i<num/90;i++){
            sb.append("XC");
        }
        num = num%90;
        
        for(int i = 0 ; i<num/50;i++){
            sb.append('L');
        }
        num = num%50;
        
        for(int i = 0 ; i<num/40;i++){
            sb.append("XL");
        }
        num = num%40;
        
        for(int i = 0 ; i<num/10;i++){
            sb.append('X');
        }
        num = num%10;
        
        for(int i = 0 ; i<num/9;i++){
            sb.append("IX");
        }
        num = num%9;
        
        for(int i = 0 ; i<num/5;i++){
            sb.append('V');
        }
        num = num%5;
        
        for(int i = 0 ; i<num/4;i++){
            sb.append("IV");
        }
        num = num%4;
        
        for(int i = 0 ; i<num;i++){
            sb.append('I');
        }
        num = num%1;
        

        return sb.toString();
    }
}