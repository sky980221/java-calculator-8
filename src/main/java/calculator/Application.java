package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String input = Console.readLine();
        //System.out.println("유저 입력 : " + input);
        int result = Calculate.add(input);
        //System.out.println("계산 결과 : " + result);
    }
}