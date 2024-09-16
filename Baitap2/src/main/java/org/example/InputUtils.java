package org.example;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static int promptForInt(String prompt) {
        int result;
        do {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                result = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Hãy nhập một số nguyên hợp lệ.");
            }
        } while (true);
        return result;
    }

    public static double promptForDouble(String prompt) {
        double result;
        do {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                result = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Hãy nhập một số thực hợp lệ.");
            }
        } while (true);
        return result;
    }

    public static String promptForString(String prompt) {
        String result;
        do {
            System.out.print(prompt);
            result = scanner.nextLine().trim();
            if (!result.isEmpty()) {
                break;
            }
            System.out.println("Lỗi: Chuỗi không được để trống.");
        } while (true);
        return result;
    }

    public static boolean promptForBoolean(String prompt) {
        String input;
        do {
            System.out.print(prompt + " (có/không): ");
            input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("có")) {
                return true;
            } else if (input.equals("không")) {
                return false;
            } else {
                System.out.println("Lỗi: Vui lòng nhập 'có' hoặc 'không'.");
            }
        } while (true);
    }
}
