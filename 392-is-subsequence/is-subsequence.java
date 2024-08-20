class Solution 
{
    public boolean isSubsequence(String subseq, String str) 
    {
        int subseq_len = subseq.length();
        int str_len = str.length();
        int subseq_ind = 0;
        int str_ind = 0;
        while(subseq_ind < subseq_len && str_ind < str_len)
        {
            if(subseq.charAt(subseq_ind) == str.charAt(str_ind))
            {
                str_ind++;
                subseq_ind++;
            }
            else
            {
                str_ind++;
            }
        }
        if(subseq_ind == subseq_len)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}