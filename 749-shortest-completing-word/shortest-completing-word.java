class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> licenseMap = new HashMap<>();

        // Process the licensePlate to count character frequencies
        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                licenseMap.put(ch, licenseMap.getOrDefault(ch, 0) + 1);
            }
        }

        String result = null;

        // Iterate through words to find the shortest completing word
        for (String word : words) {
            if (isCompletingWord(word, licenseMap)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }

    private static boolean isCompletingWord(String word, Map<Character, Integer> licenseMap) {
        Map<Character, Integer> wordMap = new HashMap<>();

        // Count the character frequencies in the word
        for (char ch : word.toCharArray()) {
            ch = Character.toLowerCase(ch);
            wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
        }

        // Check if the word contains all characters in licenseMap with required frequencies
        for (Map.Entry<Character, Integer> entry : licenseMap.entrySet()) {
            char key = entry.getKey();
            int requiredFrequency = entry.getValue();
            if (wordMap.getOrDefault(key, 0) < requiredFrequency) {
                return false;
            }
        }

        return true;
    }
    
}