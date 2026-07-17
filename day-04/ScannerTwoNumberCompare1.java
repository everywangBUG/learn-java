import java.util.Scanner;

public class ScannerTwoNumberCompare1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        double a = sc.nextDouble();

        System.out.println("请输入第二个数：");
        double b = sc.nextDouble();

        System.out.println("输出最大的值：" + Math.max(a, b));

        sc.close();
    }
}
