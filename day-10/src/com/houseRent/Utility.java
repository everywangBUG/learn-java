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

            System.out.println("输入长度必须在 " + minLen + " 到 " + maxLen + " 之间，请重新输入。");
        }
    }

    /**
     * 读取字符串（默认不允许为空）
     */
    public static String readString(String prompt) {
        return readString(prompt, null);  // null 表示使用默认行为
    }

    /**
     * 读取字符串
     *
     * @param prompt      提示信息
     * @param defaultValue 默认值：传 null 表示不允许为空，传 "" 或其他字符串表示允许为空时返回该值
     * @return 用户输入的字符串
     */
    public static String readString(String prompt, String defaultValue) {
        System.out.print(prompt);
        String input = sc.nextLine().trim();

        // 如果用户直接回车
        if (input.isEmpty()) {
            // 如果 defaultValue 为 null，表示不允许为空，继续循环
            if (defaultValue == null) {
                while (input.isEmpty()) {
                    System.out.print("输入不能为空，请重新输入：");
                    input = sc.nextLine().trim();
                }
                return input;
            } else {
                // 否则返回默认值（可以是 "" 或其他字符串）
                return defaultValue;
            }
        }

        return input;
    }

    /**
     * 读取整数
     *
     * @param prompt 提示信息
     * @return 用户输入的整数
     */
    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int num = sc.nextInt();
                sc.nextLine();  // 消耗换行符
                return num;
            } catch (java.util.InputMismatchException e) {
                System.out.println("输入无效，请输入整数。");
                sc.nextLine();  // 清除错误输入
            }
        }
    }

    /**
     * 读取整数，限制范围
     *
     * @param prompt 提示信息
     * @param min    最小值（包含）
     * @param max    最大值（包含）
     * @return 符合范围要求的整数
     */
    public static int readInt(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int num = sc.nextInt();
                sc.nextLine();  // 消耗换行符

                if (num >= min && num <= max) {
                    return num;
                }

                System.out.println("输入必须在 " + min + " 到 " + max + " 之间，请重新输入。");
            } catch (java.util.InputMismatchException e) {
                System.out.println("输入无效，请输入整数。");
                sc.nextLine();  // 清除错误输入
            }
        }
    }

    /**
     * 读取选择菜单的选项（1-4 等固定范围）
     *
     * @param prompt 提示信息
     * @param min    最小选项
     * @param max    最大选项
     * @return 用户选择的选项
     */
    public static int readMenuSelection(String prompt, int min, int max) {
        return readInt(prompt, min, max);
    }

    /**
     * 读取确认信息（Y/N）
     *
     * @param prompt 提示信息
     * @return 用户输入的确认字符（大写）
     */
    public static char readConfirmSelection(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim().toUpperCase();

            if (input.equals("Y") || input.equals("N")) {
                return input.charAt(0);
            }

            System.out.println("请输入 Y 或 N。");
        }
    }
}