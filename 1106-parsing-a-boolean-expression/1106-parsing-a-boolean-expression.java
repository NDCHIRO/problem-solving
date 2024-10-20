class Solution {

    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();

        // Traverse the entire expression
        for (char currChar : expression.toCharArray()) {
            if (currChar == ')') {
                ArrayList<Character> values = new ArrayList<>();

                // Gather all values inside the parentheses
                while (st.peek() != '(') {
                    values.add(st.pop());
                }
                st.pop(); // Remove '('
                char op = st.pop(); // Remove the operator

                // Evaluate the subexpression and push the result back
                char result = evaluateSubExpr(op, values);
                st.push(result);
            } else if (currChar != ',') {
                st.push(currChar); // Push non-comma characters into the stack
            }
        }

        // Final result is on the top of the stack
        return st.peek() == 't';
    }

    // Evaluates a subexpression based on the operator and list of values
    private char evaluateSubExpr(char op, ArrayList<Character> values) {
        if (op == '!') return values.get(0) == 't' ? 'f' : 't';

        // AND: return 'f' if any value is 'f', otherwise return 't'
        if (op == '&') {
            for (char value : values) {
                if (value == 'f') return 'f';
            }
            return 't';
        }

        // OR: return 't' if any value is 't', otherwise return 'f'
        if (op == '|') {
            for (char value : values) {
                if (value == 't') return 't';
            }
            return 'f';
        }

        return 'f'; // This point should never be reached
    }
}