class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", 
            "-.--", "--.."};
            Set<String> uniqueTransformations = new HashSet<>();
            for(String word : words)
            {
                StringBuilder morseWord = new StringBuilder();
                for(char ch : word.toCharArray())
                {
                    morseWord.append(morseCodes[ch-'a']);
                }
                uniqueTransformations.add(morseWord.toString());
            }
                return uniqueTransformations.size();
            
    }
}