class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean destroyed = false;

            // Handle collision cases
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(stack.peek()) < Math.abs(asteroid)) {
                    stack.pop(); // The top asteroid is destroyed
                } else if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                    stack.pop(); // Both asteroids are destroyed
                    destroyed = true;
                    break;
                } else {
                    // The current asteroid is destroyed
                    destroyed = true;
                    break;
                }
            }

            // If the current asteroid survives, push it to the stack
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}