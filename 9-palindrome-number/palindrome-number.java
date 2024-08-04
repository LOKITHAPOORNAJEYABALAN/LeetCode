class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int count=1; int newNum=0; int num=x;
        while(num>9){
           num=num/10;
           count=count*10;
        }
        num=x;
       while(num>0){
        newNum=newNum+(num%10)*count;
        num=num/10;
        count=count/10;
       }
       System.out.print(newNum);
        if(newNum==x){
            return true;
        }
        return false;
    }
}