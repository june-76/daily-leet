from collections import Counter

class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        # 리스트의 요소 별 빈도가 같다면 False, 다르다면 True
        # 단 하나라도 같다면 False인가?

        occurrences = Counter(arr)

        # 중복 검사용 집합
        seen = set()

        # occurrences의 요소를 반복하면서 
        for occurrence in occurrences.values():
            if occurrence in seen:  # 하나라도 일치한다면 false 리턴
                return False
            seen.add(occurrence)
        
        return True