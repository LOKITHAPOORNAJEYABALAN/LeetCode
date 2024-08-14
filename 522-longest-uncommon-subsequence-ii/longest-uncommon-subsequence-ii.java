class Solution 
{
    public int findLUSlength(String[] strs) 
    {
        int res = -1, n = strs.length;
        for (int i = 0; i < n; i++) 
        {    // Checking for all words...
            if (strs[i].length() < res)
                continue; // If length of current string is less, then it will not help in the answer...
            int j = -1; // Variable to find subsequence string...
            while (++j < n)
                if (i != j && isSubsequence(strs[i], strs[j]))
                    break; // If any subsequence is found, it exits...
            if (j == n)
                res = Math.max(res, strs[i].length()); // The word is stored as the uncommon length...
        }
        return res;
    }
        public boolean isSubsequence(String a, String b) {
        int i = 0, len1 = a.length(), len2 = b.length();
        for (int j = 0; i < len1 && j < len2; j++)
            if (a.charAt(i) == b.charAt(j))
                i++; // If both characters match...
        return i == len1; // If all characters match, then a subsequence...
    }
}
