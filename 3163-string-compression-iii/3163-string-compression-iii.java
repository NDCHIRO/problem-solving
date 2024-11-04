class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 1; // Start with a count of 1 for the first character

        for (int i = 1; i <= word.length(); i++) {
            if (i == word.length() || word.charAt(i) != word.charAt(i - 1) || count == 9) {
                comp.append(count).append(word.charAt(i - 1));
                count = 1; // Reset count for the new sequence
            } else {
                count++;
            }
        }

        return comp.toString();
    }
}
