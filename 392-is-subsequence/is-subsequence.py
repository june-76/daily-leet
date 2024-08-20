class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        # s가 t의 subsequence이면 true, 아니면 false 반환
        # 문자열의 순서는 바꾸지 않음

        # 문자열 s의 첫번째 문자가 t에 존재하는 지 확인(t 인덱스 저장)
        # 있다면 문자열 s의 다음 문자로 넘어가고 다시 비교(저장된 t 인덱스 이후부터 확인) -> two porinters
        
        # 문자열 t의 인덱스
        k = 0

        for i in s:
            
            # i가 t에 있는 지 확인
            # if i === t[k]:
            while k < len(t) and i != t[k]:

                # 있다면 k를 1 증가시키고 다시 반복
                k += 1

            # 없다면 반복문을 빠져나와 false 리턴
            # else:
            if k == len(t):
                return False

            # i를 찾았다면 k를 1 증가시키고 다음 반복
            k += 1

        return True
