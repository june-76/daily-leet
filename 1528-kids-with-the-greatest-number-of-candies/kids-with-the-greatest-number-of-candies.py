class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        
        # 각 아이가 가진 캔디와 여분의 캔디를 더한 합이, 이전 캔디의 합보다 적다면 false, 많다면 true.
       
        # 현재 가장 많은 캔디를 가진 아이의 수를 찾습니다.
        maxCandies = max(candies)
        print(maxCandies)
        
        result = []
        
        # 각 아이에 대해 extraCandies를 더했을 때,
        # 그 아이의 캔디 수가 maxCandies보다 크거나 같은지 확인합니다.
        for candy in candies:
            if candy + extraCandies >= maxCandies:
                result.append(True)
            else:
                result.append(False)
        
        return result