package util;

import java.util.Scanner;

public class InputUtil {
    public static String inputString(String string) {
        System.out.println(string);//print asking text
        String input = inputStringLogic(string);//get typed string
        if (input == null || input.isEmpty()) {//if user not typed then ask again
            System.err.println("Input is required");
            input = inputStringLogic(string);
        }
        return input;
    }

    private static String inputStringLogic(String string) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        return str;
    }
}
