class Solution(object):
    def onesMinusZeros(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: List[List[int]]
        """
        m, n = len(grid), len(grid[0])

        # Initialize arrays to store counts of ones and zeros in rows and columns
        ones_row = [0] * m
        ones_col = [0] * n
        zeros_row = [0] * m
        zeros_col = [0] * n

        # Calculate counts of ones and zeros in rows and columns
        for i in range(m):
            for j in range(n):
                if grid[i][j] == 1:
                    ones_row[i] += 1
                    ones_col[j] += 1
                else:
                    zeros_row[i] += 1
                    zeros_col[j] += 1

        # Initialize difference matrix with zeros
        diff = [[0] * n for _ in range(m)]

        # Calculate the difference matrix using the formula provided
        for i in range(m):
            for j in range(n):
                diff[i][j] = ones_row[i] + ones_col[j] - zeros_row[i] - zeros_col[j]

        return diff



        