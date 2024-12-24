class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> result = new ArrayList<>();
        for(String word : words)
        {
            if(isInOneRow(word.toLowerCase(),row1) ||
            isInOneRow(word.toLowerCase(),row2) ||
            isInOneRow(word.toLowerCase(),row3))
            {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
    private static boolean isInOneRow(String word, String row)
    {
        for(char ch : word.toCharArray())
        {
            if(!row.contains(String.valueOf(ch)))
            {
                return false;
            }
        }
        return true;
    }
}