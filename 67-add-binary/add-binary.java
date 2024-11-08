class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int m = a.length()-1;
        int n = b.length() - 1;
        int carry = 0;
        while(m >= 0 || n >= 0 ||carry == 1)
        {
            if(m>=0)
             carry+=a.charAt(m--)-'0';
            if(n>=0)
             carry+=b.charAt(n--)-'0';
            sb.append(carry%2);
            carry/=2;
        }
        return sb.reverse().toString();
    }
}