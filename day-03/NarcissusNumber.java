//判断一个数是否是水仙花数：一个三位数，各个位上的立方和等于其本身
//例如 153 = 1*1*1 + 3*3*3 + 5*5*5
import java.util.Scanner;

class NarcissusNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出一个三位数的正整数：");
        int num = sc.nextInt();
        int bai = num / 100;
        int shi = num / 10 % 10;
        int ge = num % 10;
        if (num == (int)(Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3))) {
            System.out.println(num + "是一个水仙数");
            return;
        }
        System.out.println(num + "不是一个水仙数");
    }
}
