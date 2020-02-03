class Solution(object):
    def dieSimulator(self, n, rollMax):
        dp = [[0] * x for x in rollMax]
        print (dp)
        for k in range(6):
            dp[k][0] = 1
        print (dp)
        for k in range(1, n):
            next_dp = [[0] * n for n in rollMax]
            roll_sum = [sum(x) for x in dp]
            total = sum(roll_sum)            
            for i in range(6):
                for j in range(rollMax[i]):
                    if j == 0:
                        next_dp[i][j] = total - roll_sum[i] % (10**9 + 7)
                    else:
                        next_dp[i][j] = dp[i][j-1] % (10**9 + 7)
            dp = next_dp
        return sum([sum(x) for x in dp]) % (10**9 + 7)