class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        # 0을 발견했을 경우 그 위치를 기록
        zero = 0

        for i in range(len(nums)):
            if nums[i] != 0:
                # unpacking
                nums[zero], nums[i] = nums[i], nums[zero]
                zero += 1

        