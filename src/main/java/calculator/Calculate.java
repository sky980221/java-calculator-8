package calculator;

import java.util.Arrays;

public class Calculate {
    public static int add(String input){
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] arr = splitString(input);
        return 1;
    }

    public static String[] splitString(String input){
        String[] str = input.split("[,:]");
        //System.out.println("분리된 배열은 : " + Arrays.toString(str));
        return str;
    }
}
