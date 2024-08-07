class Solution:
    def isPalindrome(self, x: int) -> bool:
        # integer를 string으로 변환하지 않고 문제를 풀어볼 것.
        # 일단 변환해서 풀어보자.
        converted_string = str(x)
        reversed_string = converted_string[::-1]

        if converted_string == reversed_string:
            return True
        return False