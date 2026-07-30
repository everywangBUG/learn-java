//编程实现如下功能
//某人有100000元，每经过一次路口，需要缴费，规则如下
//1. 当现金 > 50000，每次交5%
//2. 当现金 <= 50000，每次交1000
//计算可以经过多少次路口，使用while break实现
class WhileBreak {
    public static void main(String[] args) {
        int money = 100000;
        int count = 0;
        while(true) {
            if (money > 50000) {
                money *= 0.95;
                count++;
            } else if ( money >= 1000) {
                money -= 1000;
                count++;
            } else {
                break;
            }
        }
        System.out.println("一共可以通过的次数：" + count + "次");
    }
}
