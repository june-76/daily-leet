class Solution {
    public String intToRoman(int num) {
        // 해시맵
        // int는 해시맵의 키로 사용할 수 없음(객체가 아님)
        // Integer는 사용 가능
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        // num이 M보다 큰 지 확인
        // M을 1개 추가하고 다시 num이 M보다 큰 지 확인
        // num이 D보다 큰 지 확인
        // D를 1개 추가하고 다시 num이 D보다 큰 지 확인
        // ...
        // num이 I보다 크지 않을 때(0일 때) 종료

         for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();

        // 동일한 문자는 연속해서 3번까지만 작성할 수 있음
        // 4, 9는 각각 IV, IX로 표현됨.
        // 40, 90은 XL, XC ...
        // 여기서 처리하는 게 아니라, 처음부터 배열에 넣고 변환해야 함.
        // String convertedResult = result.toString();
        // convertedResult = convertedResult.replace("IIII", "IV");
        // convertedResult = convertedResult.replace("VV", "X");
        // convertedResult = convertedResult.replace("XXXX", "XL");
        // convertedResult = convertedResult.replace("XXXX", "XC");
        // convertedResult = convertedResult.replace("CCCC", "CD");
        // convertedResult = convertedResult.replace("D", "CM");

        // return convertedResult;
    }
}