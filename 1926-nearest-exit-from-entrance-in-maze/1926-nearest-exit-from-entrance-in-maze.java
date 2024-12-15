class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;
        
        // Directions: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        // Queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{entrance[0], entrance[1], 0}); // {row, col, steps}
        
        // Mark entrance as visited
        maze[entrance[0]][entrance[1]] = '+';
        
        // BFS traversal
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int steps = current[2];
            
            // Explore all 4 directions
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                
                // Check if the new cell is within bounds and not a wall
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && maze[newRow][newCol] == '.') {
                    // Check if it is on the boundary (exit)
                    if (newRow == 0 || newRow == rows - 1 || newCol == 0 || newCol == cols - 1) {
                        return steps + 1; // Return the steps to the nearest exit
                    }
                    
                    // Mark the cell as visited and add to the queue
                    maze[newRow][newCol] = '+';
                    queue.add(new int[]{newRow, newCol, steps + 1});
                }
            }
        }
        
        // If no exit is found
        return -1;
    }
}
