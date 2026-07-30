import java.util.Scanner;

public class ScannerTwoNumberCompare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        double a = sc.nextDouble();

        System.out.println("请输入第二个数：");
        double b = sc.nextDouble();

        System.out.println("请输入第三个数：");
        double c = sc.nextDouble();

        double res = a > b ? a : b > c ? b : c;

        System.out.println("三个数最大的是" + res);

        sc.close();
    }
}
