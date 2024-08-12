class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        # 최대공약수 구하기!
        # GCD, Greatest Common Divisor
        def gcd(x, y):
            if y == 0: # 나머지가 0이 되면 x를 리턴
                return x
            return gcd(y, x % y) # x를 y로 나누고, 나머지를 y값으로 다시 호출


        # 최대공약수가 될 수 있는 최대 길이
        gcd_lenght = gcd(len(str1), len(str2))

        # gcd_lenght만큼 문자열 자르기
        sliced = str1[:gcd_lenght]

        # / : 실수 반환, // : 정수 반환
        if sliced * (len(str1) // gcd_lenght) == str1 and sliced * (len(str2) // gcd_lenght) == str2:
            return sliced

        # 서로 일치하는 문자열이 하나도 없을 경우 빈 스트링 리턴
        return ""