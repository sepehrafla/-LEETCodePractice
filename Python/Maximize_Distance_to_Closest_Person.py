class Solution:
    def maxDistToClosest(self, seats: List[int]) -> int:
        m = c = 0
        for i in range(len(seats)):
            if seats[i]: 
                m = max(m, (c + 1) // 2) if i != c else c
                c = 0
            else: c += 1
        return max(m, c) if c else m