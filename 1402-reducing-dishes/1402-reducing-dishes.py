class Solution(object):
    def maxSatisfaction(self, satisfaction):
        """
        :type satisfaction: List[int]
        :rtype: int
        """
        satisfaction.sort(reverse=True)
        n = len(satisfaction)
        max_sum = 0
        curr_sum = 0
        for i in range(n):
            if curr_sum + satisfaction[i] < 0:
                break
            curr_sum += satisfaction[i]
            max_sum += curr_sum
        return max_sum

        