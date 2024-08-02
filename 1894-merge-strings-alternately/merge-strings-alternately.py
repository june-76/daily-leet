class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        # 두 문자열을 한 글자씩 병합하기
        merged = []
        
        # 두 문자열을 번갈아가며 병합
        for char1, char2 in zip(word1, word2):
            merged.append(char1)
            merged.append(char2)
        
        # 남은 문자들 추가
        merged.extend(word1[len(word2):])
        merged.extend(word2[len(word1):])
        
        # 리스트를 다시 문자열로 변환
        return ''.join(merged)
