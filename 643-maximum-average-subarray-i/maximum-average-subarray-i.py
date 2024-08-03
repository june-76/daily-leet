class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        # 가장 첫번째 창문
        window_sum = sum(nums[:k])
        max_sum = window_sum

        # 창문을 차례대로 열어 나가기
        for i in range(k, len(nums)):
            window_sum += nums[i] - nums[i - k]
            max_sum = max(max_sum, window_sum)

        # 최대 합계를 k로 나누어 평균 구하기
        return max_sum / k