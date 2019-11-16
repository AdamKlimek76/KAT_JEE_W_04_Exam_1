package exam;

import org.apache.commons.lang3.StringUtils;

public class Main7 {

    public static void main(String[] args) {
        String text = "a1b2c3d4";
        int sum = countNumbers(text);
        System.out.println(sum);
    }

    static int countNumbers(String str) {
        String number = StringUtils.getDigits(str);
        int lenNumber = StringUtils.length(number);
        int sum = 0;
        for (int i = 0; i < lenNumber; i++) {
            char digit = number.charAt(i);
            String dig = Character.toString(digit);
            int numb = Integer.parseInt(dig);
            sum += numb;
        }
        return sum;
    }
}
