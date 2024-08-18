class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        e = len(nums)
        d = 0

        i = 0
        while i < len(nums) - 1:
            if nums[i] == nums[i + 1]:
                nums.pop(i + 1)
                d += 1
            else:
                i += 1

        return e - d