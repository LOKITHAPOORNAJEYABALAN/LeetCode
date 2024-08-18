class Solution 
{
    public int numJewelsInStones(String jewels, String stones) 
    {
        //char[] a1 = jewels.tocharArray();
        //char[] a2 = stones.toCharArray();
        int count = 0;
        for(int i =0 ;i<jewels.length();i++)
        {
            for(int  j =0;j<stones.length();j++)
            {
                if(jewels.charAt(i)==stones.charAt(j))
                {
                    count++;
                }
            }
        }
        return count;
    }
}