class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num.length(); i++) {

            // 모든 원소가 0~9이기 때문에 사용 가능
            int currentDigit = num.charAt(i) - '0';
            // int currentDigit = Character.getNumericValue(num.charAt(i));
            // int currentDigit = Integer.parseInt(String.valueOf(num.charAt(i)));
            
            if (i % 2 == 0) {
                evenSum += currentDigit;
            } else {
                oddSum += currentDigit;
            }
        }

        return evenSum == oddSum;
    }
}
