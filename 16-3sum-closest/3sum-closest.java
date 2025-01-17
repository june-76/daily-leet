import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // 먼저 배열을 정렬하자.
        Arrays.sort(nums);

        // int closestSum = 0;
        int closestSum = nums[0] + nums[1] + nums[2];

        // nums의 최소 길이는 3이다.
        for (int i = 0; i < nums.length - 2; i++) {
            // 이중 포인터 사용
            int left = i + 1;
            int right = nums.length - 1;
            
            // 두 포인터가 교차하기 전까지 반복
            while (left < right) {
                // 세 숫자의 합
                int sum = nums[i] + nums[left] + nums[right];
                
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                // sum이 target보다 작으면 left 포인터를 증가시킨다.
                if (sum < target) {
                    left++;
                } 
                // sum이 target보다 크면 right 포인터를 감소시킨다.
                else if (sum > target) {
                    right--;
                } 
                else {
                    return sum;
                }
            }
        }

        return closestSum;
    }
}