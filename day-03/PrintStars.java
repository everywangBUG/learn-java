//  输出以下图形
//        *
//       *  *
//      *    *
//     *       *
//    * * * * * *
import java.util.Scanner;

class PrintStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数输出打印*的列数：");
        int totalRowAndColumn = sc.nextInt();

        for (int i = 0; i < totalRowAndColumn; i++) { // 控制行
            for (int k = 0; k < totalRowAndColumn - i; k++) { // 打印前面的空格
                System.out.print(' ');
            }

            for (int j = 0; j <= 2 * i; j++) { // 控制列
                // 第一个位置和最后一个位置打印*
                if (j == 0 || j == 2 * i || i == totalRowAndColumn - 1) {
                   System.out.print("*");
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
