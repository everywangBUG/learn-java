package com.houseRent;
import java.util.Scanner;

public class Utility {
    private static Scanner sc = new Scanner(System.in);

    /**
     * 根据type读取字符串，限制长度
     *
     * @param prompt 提示信息
     * @param minLen 最小长度（包含），仅 String 类型有效
     * @param maxLen 最大长度（包含），仅 String 类型有效
     * @param type   输入类型："int" 或 "String"
     * @return 符合要求的字符串
     */
    public static String readString(String prompt, int minLen, int maxLen, String type) {
        String input;

        while (true) {
            System.out.print(prompt);

            switch (type.toLowerCase()) {
                case "int":
                    // 读取整数，返回字符串形式
                    try {
                        int num = sc.nextInt();
                        sc.nextLine();  // 消耗换行符
                        return String.valueOf(num);
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("输入无效，请输入整数。");
                        sc.nextLine();  // 清除错误输入
                        continue;
                    }

                case "string":
                    // 读取字符串，限制长度
                    input = sc.nextLine().trim();
                    if (input.length() >= minLen && input.length() <= maxLen) {
                        return input;
                    }
                    System.out.println("输入长度必须在 " + minLen + " 到 " + maxLen + " 之间，请重新输入。");
                    break;

                default:
                    System.out.println("无效的 type 参数，请使用 \"int\" 或 \"String\"。");
                    return null;
            }
        }
    }
}
