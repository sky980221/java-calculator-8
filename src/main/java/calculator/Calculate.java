package calculator;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Calculate {
    public static int add(String input){
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] arr = splitString(input);
        return 1;
    }

    public static String[] splitString(String input){
        input = input.replace("\\n", "\n");
        if (input.startsWith("//")) {
            int endIndexOfDelimiter = input.indexOf("\n");
            String customDelimiter = input.substring(endIndexOfDelimiter - 1, endIndexOfDelimiter);
            String numbers = input.substring(endIndexOfDelimiter + 1);
            //Pattern.quote를 사용하여 정규식 특수문자일 때도 안전하게 split 함
            String[] str = numbers.split(Pattern.quote(customDelimiter));
            return str;
        }

        else {
            String[] str = input.split("[,:]");
            System.out.println("분리된 배열은 : " + Arrays.toString(str));
            return str;
        }
    }
}
