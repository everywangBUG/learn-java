import java.util.Scanner;

// 编写一个方式判断odd和even奇偶性
public class JudgeOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        double num = sc.nextDouble();
        AA aa = new AA();
        boolean isOdd = aa.isOdd(num);
        System.out.println("输入的数字" + (isOdd ? "是" : "不是") + "一个奇数");
        aa.printRowColumnChar(8, 8);
    }
}

class AA {
    public boolean isOdd(double num) {
        return num % 2 != 0;
    }

    public void printRowColumnChar(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}


