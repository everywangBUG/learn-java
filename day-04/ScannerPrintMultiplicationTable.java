import java.util.Scanner;

// 键盘录入一个数据n(1 <= n <= 9)，输出对应的nn乘法表
public class ScannerPrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小于10的正整数：");

        int n = sc.nextInt();

        String res = "";

        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= x; y++) {
                String temp = y + "*" + x + "=" + (x * y);
                System.out.println(temp + "\t");
            }
            System.out.println();
        }

        int a = 1, b = 1;
        System.out.println(a++ == 2);
        System.out.println(++b == 2);

        sc.close();
    }
}
