from typing import List
class Solution:
    def findMin(self, nums: List[int]) -> int:
        start, end = 0, len(nums) - 1
        curr_min = float("inf")
        while start < end:
            mid = start + (end - start) // 2
            curr_min = min(curr_min, nums[mid])
            if nums[mid] > nums[end]:
                start = mid +1
            else:
                end = mid - 1
        return min(curr_min, nums[start])



sc = Solution()
nums = [3,4,5,1,2]
print(sc.findMin(nums))


