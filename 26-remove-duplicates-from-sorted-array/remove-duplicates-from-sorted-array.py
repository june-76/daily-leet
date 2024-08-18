class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        # 해당 코드의 시간복잡도는 O(n^2)
        # .pop()을 할 필요가 없음. 고유 요소의 개수만 파악하면 됨.
        # -> 인덱스(k)를 이용하기
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
        """
        
        # 인덱스 이용
        k = 0

        for i in range(1, len(nums)):
            if nums[i] != nums[k]:
                k += 1
                nums[k] = nums[i]

        return k + 1