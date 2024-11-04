class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 1; // Start with a count of 1 for the first character

        for (int i = 1; i <= word.length(); i++) {
            // Check if we're at the end of the string or the current character is different from the previous one
            if (i == word.length() || word.charAt(i) != word.charAt(i - 1) || count == 9) {
                // Append the count and character
                comp.append(count).append(word.charAt(i - 1));
                count = 1; // Reset count for the new sequence
            } else {
                // Increment count if the character is the same as the previous one
                count++;
            }
        }

        return comp.toString();
    }
}
