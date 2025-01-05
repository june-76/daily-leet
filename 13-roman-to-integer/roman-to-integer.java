class Solution {
    public int romanToInt(String s) {
        // s의 문자열을 0번째 문자부터 순회하면서
        // roman 배열에 일치하는 인덱스를 기억하고
        // 그 인덱스로 integer에서 숫자를 찾아 총합을 구하기

        // String[] roman = {"I", "V", "X", "L", "C", "D", "M"};
        // int[] integer = {1, 5, 10, 50, 100, 500, 1000};

        // 배열 두 개가 아니라 해시맵으로 진행
        Map<Character, Integer> romanToIntMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int total = 0; 

        for (int i = 0; i < s.length(); i++) {
            // 입력값 s(키)로 int(값)을 찾기(java 9 이상)
            // char currentChar = s.charAt(i);
            // int value = romanToIntMap.get(currentChar);

            int current = romanToIntMap.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? romanToIntMap.get(s.charAt(i + 1)) : 0;

            // 현재 값이 다음 값보다 작을 경우 빼야 함
            if (current < next) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }
}