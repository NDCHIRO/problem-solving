class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();    // Stack to store repetition counts
        Stack<StringBuilder> strStack = new Stack<>(); // Stack to store intermediate strings
        StringBuilder current = new StringBuilder(); // Current string being processed
        int k = 0; // To store the current number being processed
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the full number if digits appear consecutively
                k = k * 10 + (ch - '0'); 
            } else if (ch == '[') {
                // Push the current state (string and repetition count) onto stacks
                numStack.push(k);
                strStack.push(current);
                current = new StringBuilder(); // Reset current
                k = 0; // Reset k
            } else if (ch == ']') {
                // Pop from stacks and repeat the current string k times
                StringBuilder temp = current;
                current = strStack.pop(); // Previous string context
                int repeat = numStack.pop(); // How many times to repeat
                while (repeat-- > 0) {
                    current.append(temp);
                }
            } else {
                // Append regular characters to the current string
                current.append(ch);
            }
        }
        
        return current.toString();
    }
}
