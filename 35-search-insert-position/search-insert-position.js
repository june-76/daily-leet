/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    // nums는 정렬된 숫자로 이루어진 배열, target은 숫자
    // target이 nums의 몇 번째에 위치하는 지 반환
    // 일치하는 숫자가 없다면 삽입하는 위치를 반환

    // find()의 시간복잡도는 O(n)
    // 정렬이 되어 있으므로 이진탐색
    let left = 0;
    let right = nums.length - 1;

    while (left <= right) {
        const mid = Math.floor((left + right) / 2);

        // 일치하는 숫자가 있을 경우
        if (nums[mid] === target) {
            // 일치하는 숫자의 위치(인덱스) 반환
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    // 일치하는 숫자가 없을 경우
    // 삽입하는 위치를 반환
    // return right;
    return left;

};