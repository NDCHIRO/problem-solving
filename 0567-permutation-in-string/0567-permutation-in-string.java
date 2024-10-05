class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Edge case: if s1 is longer than s2, it's impossible to find a permutation
        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency arrays for s1 and the current window in s2
        int[] s1Freq = new int[26];
        int[] s2WindowFreq = new int[26];

        // Fill the frequency array for s1 and the first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            s2WindowFreq[s2.charAt(i) - 'a']++;
        }

        // Sliding window approach
        for (int i = s1.length(); i < s2.length(); i++) {
            // If frequency arrays match, we found a valid permutation
            if (matches(s1Freq, s2WindowFreq)) {
                return true;
            }

            // Slide the window:
            // Add the current character in s2 to the window
            s2WindowFreq[s2.charAt(i) - 'a']++;
            // Remove the character that is out of the window
            s2WindowFreq[s2.charAt(i - s1.length()) - 'a']--;
        }

        // Check the last window
        return matches(s1Freq, s2WindowFreq);
    }

    // Helper function to check if two frequency arrays match
    private boolean matches(int[] s1Freq, int[] s2WindowFreq) {
        for (int i = 0; i < 26; i++) {
            if (s1Freq[i] != s2WindowFreq[i]) {
                return false;
            }
        }
        return true;
    }
}