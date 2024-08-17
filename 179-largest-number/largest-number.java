class Solution 
{
    public String largestNumber(int[] nums) 
    {
        String str[] = new String[nums.length];
        for(int i = 0 ;i< nums.length ; i++)
        {
         str[i] = String.valueOf(nums[i]);
        }
       String s1 ="";
       String s2 = "";
       for(int i = 0 ;i<str.length;i++)
       {
        for(int j =i+1;j<str.length;j++)
        {
            s1 = (str[i]+str[j]);
            s2 = (str[j]+str[i]);
        
        if(((s2).compareTo(s1)) > 0)
        {
            String temp = str[i];
            str[i]=str[j];
            str[j]=temp;
        }
       }
       }
    StringBuilder sb = new StringBuilder();
    for(String s : str)
    {
        sb.append(s);
    }
    while(sb.charAt(0) == '0' && sb.length()>1)
    {
        sb.deleteCharAt(0);
    }
    return sb.toString();
}
}