package com.houseRent;
import java.util.Scanner;

public class Utility {
    private static Scanner sc = new Scanner(System.in);

    /**
     * 读取字符串，限制长度
     *
     * @param prompt 提示信息
     * @param minLen 最小长度（包含）
     * @param maxLen 最大长度（包含）
     * @return 符合长度要求的字符串
     */
    public static String readString(String prompt, int minLen, int maxLen) {
        String input;

        while (true) {
            System.out.print(prompt);
            input = sc.nextLine().trim();

            if (input.length() >= minLen && input.length() <= maxLen) {
                return input;
            }

            System.out.println(
                    "输入长度必须在 " + minLen + " 到 " + maxLen + " 之间，请重新输入。"
            );
        }
    }
}
