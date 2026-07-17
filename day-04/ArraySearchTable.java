import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 数组查表法，根据键盘录入的索引，查找对应的星期
public class ArraySearchTable {
    public static void main(String[] args) {
        ArrayList<String> week = new ArrayList<>(Arrays.asList("周一", "周二", "周三", "周四", "周五", "周六", "周日"));
        System.out.println(week);
        // 创建扫描器
        Scanner sc = new Scanner(System.in);

        // 键盘录入事件
        System.out.println("请输入1-7的整数：");
        int num = sc.nextInt();
        System.out.println("输出：" + week.get(num - 1));
        sc.close();
    }
}
