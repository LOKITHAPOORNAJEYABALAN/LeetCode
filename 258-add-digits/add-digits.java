class Solution {
    public int addDigits(int num) {
    //     int temp = num;
    //     int ans = 0;
    //     if(temp >= 0 && temp <= 9)
    //     {
    //         return temp;
    //     }
    //    // int ans = 0;
    //     else
    //     {
    //         while(num >= 0)
    //         {
    //             ans+=num%10;
    //             num/=10;
    //         }
    //         temp = ans;
    //     }
    //     return temp;
    if(num == 0)
    return 0;
    if(num%9 != 0)
    return num%9;
    else
    return 9;
    }
}