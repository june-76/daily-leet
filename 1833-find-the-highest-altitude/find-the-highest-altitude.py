class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        # 길이 n의 배열이 주어질 때,
        # 각 요소의 누계로 n+1 길이 배열을 만들고
        # 그 중 가장 큰 요소를 반환하기.

        # 첫 번째 요소는 0. (고도 0에서 시작)
        altitude = [0]

        for i in range(len(gain)):
            altitude.append(altitude[-1] + gain[i]) # altitude의 마지막 요소에 gain의 현재(i) 요소를 더하여 altitude에 새롭게 추가
        
        return max(altitude)