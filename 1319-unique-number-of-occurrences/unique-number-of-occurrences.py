from collections import Counter

class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        occurrences = Counter(arr)
        
        # 빈도 리스트를 정렬
        frequencies = sorted(occurrences.values())
        
        # 인접한 요소끼리 비교하여 중복 확인
        for i in range(1, len(frequencies)):
            if frequencies[i] == frequencies[i - 1]:
                return False
        
        return True