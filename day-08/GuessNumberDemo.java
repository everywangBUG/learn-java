/*
	需求：猜数字小游戏

	分析：
		A:系统产生一个1-100之间的随机数。
			int number = (int)(Math.random()*100)+1;
		B:键盘录入数据,用Scanner实现
		C:用这两个数据进行比较
			大	提示大了
			小	提示小了
			等	恭喜你，猜中了
		D:为了保证我们能够猜中，我们就加入循环，实现多次猜。直到猜中。
*/
import java.util.Scanner;

class GuessNumberDemo {
    public static void main(String[] args) {
        // 产生一个1-100之前的随机数字
        int randomNum = (int)(Math.random() * 99 + 1);

        Scanner sc = new Scanner(System.in);

        // 循环比较两个数的大小
        while(true) {
            // 键盘录入一个数据
            System.out.println("请输入一个1-100的整数猜：");
            int num = sc.nextInt();
            if (randomNum == num) {
                System.out.println("恭喜你猜中了");
                break;
            } else if(randomNum > num) {
                System.out.println("猜小了");
            } else if (randomNum < num) {
                System.out.println("猜大了");
            }
        }
    }

}
