class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        
        # 각 아이가 가진 캔디와 여분의 캔디를 더한 합이, 아이들이 가진 캔디의 수 중 최대값이 된다면 true, 아니라면 false.
       
        # 1명의 아이가 갖고 있는 가장 많은 캔디의 수
        maxCandies = max(candies)
        
        # 반환할 리스트
        result = []

        for candy in candies:
            if candy + extraCandies >= maxCandies:
                result.append(True)
            else:
                result.append(False)
        
        return result