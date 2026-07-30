import java.util.Scanner;

// 键盘录入行数和列数，输出对应的星形
public class PrintRowAndColumnStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入行数（整数）：");

        int row = sc.nextInt();

        System.out.println("请输入列数（整数）：");

        int column = sc.nextInt();

        String res = "";

        for (int x = 0; x < row; x++) {
            res += '\n';
            for (int y = 0; y < column; y++) {
                res += '*';
            }
        }

        System.out.println(res);

        sc.close();
    }
}
